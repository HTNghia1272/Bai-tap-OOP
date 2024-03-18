package Bai2_OOP;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong tam giac: ");
		int n = sc.nextInt();

		TamGiac[] tamGiacs = new TamGiac[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap kich thuoc cho tam giac thu " + (i + 1) + ": ");
			double kichthuoc[] = new double[3];
			for (int j = 0; j < 3; j++) {
				System.out.print("Canh thu " + (j + 1) + ": ");
				kichthuoc[j] = sc.nextDouble();
			}
			tamGiacs[i] = new TamGiac(kichthuoc);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(tamGiacs[i]);
		}

		double maxArea = tamGiacs[0].tinhDienTichTamGiac();
		for (int i = 1; i < n; i++) {
			if (tamGiacs[i].tinhDienTichTamGiac() > maxArea) {
				maxArea = tamGiacs[i].tinhDienTichTamGiac();
			}
		}
		System.out.println("Tam giac co dien tich lon nhat: " + maxArea);

		for (TamGiac tamGiac : tamGiacs) {
			if (tamGiac.tinhDienTichTamGiac() == maxArea) {
				tamGiac.inCacCanhTamGiac();
			}
		}

		System.out.println("Tim tam giac o vi tri index: ");
		int index = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (index == i) {
				System.out.println("Tam giac o vi tri " + i + ": ");
				System.out.println(tamGiacs[i]);
				break;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (tamGiacs[i].tinhDienTichTamGiac() > tamGiacs[j].tinhDienTichTamGiac()) {
					TamGiac temp = tamGiacs[i];
					tamGiacs[i] = tamGiacs[j];
					tamGiacs[j] = temp;
				}
			}
		}

		System.out.println("Danh sach tam giac sau khi sap xep: ");
		for (int i = 0; i < n; i++) {
			System.out.println(tamGiacs[i]);
		}
	}
}
