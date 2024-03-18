package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("So luong sinh vien phai lon hon 0. Hay thu nhap lai.");
			n = sc.nextInt();
		}
		sc.nextLine();
		ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();

		for (int i = 0; i < n; i++) {
			System.out.println("Dien thong tin sinh vien thu " + (i + 1) + ": ");
			System.out.print("Nhap ma sinh vien: ");
			String maSV = sc.nextLine();
			System.out.print("Nhap ho ten sinh vien: ");
			String hoTen = sc.nextLine();
			System.out.print("Nhap email sinh vien: ");
			String email = sc.nextLine();
			System.out.print("Nhap sdt sinh vien: ");
			String soDT = sc.nextLine();
			System.out.print("Nhap khoa quan li sinh vien: ");
			String khoaQL = sc.nextLine();
			System.out.print("Nhap khoa sinh vien: ");
			String khoaDT = sc.nextLine();
			System.out.print("Nhap lop sinh vien: ");
			String lop = sc.nextLine();
			System.out.print("Nhap nam sinh sinh vien: ");
			int namSinh = sc.nextInt();
			System.out.print("Nhap diem mon chuyen nganh sinh vien: ");
			double diemMonChuyenNganh = sc.nextDouble();
			System.out.print("Nhap diem mon tu chon sinh vien: ");
			double diemMonTuChon = sc.nextDouble();
			sc.nextLine();
			SinhVien sv = new SinhVien(maSV, hoTen, email, soDT, khoaQL, khoaDT, lop, namSinh, diemMonChuyenNganh,
					diemMonTuChon);
			double diemTB = (diemMonChuyenNganh + diemMonTuChon) / 2;
			sv.setDiemTB(diemTB);
			// A (8.5- 10) ; B+ (8.0 - 8.4); B (7.0 - 7.9); C+ (6.5 - 6.9);
			// C (5.5 - 6,4); D+ (5.0 - 5.4) ; D (4.0 - 4.9); F (0 – 3.9).
			if (diemTB <= 3.9) {
				sv.setDiemTBChu("F");
			} else if (diemTB <= 4.9) {
				sv.setDiemTBChu("D");
			} else if (diemTB <= 5.4) {
				sv.setDiemTBChu("D+");
			} else if (diemTB <= 6.4) {
				sv.setDiemTBChu("C");
			} else if (diemTB <= 6.9) {
				sv.setDiemTBChu("C+");
			} else if (diemTB <= 7.9) {
				sv.setDiemTBChu("B");
			} else if (diemTB <= 8.4) {
				sv.setDiemTBChu("B+");
			} else {
				sv.setDiemTBChu("A");
			}
			sv.getDiemTBChu();
			dssv.add(sv);
		}

		System.out.println("\nDanh sach sinh vien: ");
		for (SinhVien sinhVien : dssv) {
			System.out.println(sinhVien);
			System.out.println("=========");
		}

		System.out.println("\nDanh sach sinh vien co chu 'a' trong ten:");
		for (SinhVien sinhVien : dssv) {
			if (sinhVien.ktraSVTenCoChuA()) {
				System.out.println(sinhVien);
				System.out.println("=========");
			} else {
				System.out.println("Khong co sinh vien nao co chu 'a' trong ten!");
				System.out.println("=========");
				break;
			}
		}

		System.out.println("\nDanh sach sinh vien co sdt ket thuc bang 026:");
		for (SinhVien sinhVien : dssv) {
			if (sinhVien.ktraSVCoSDT026()) {
				System.out.println(sinhVien);
				System.out.println("=========");
			} else {
				System.out.println("Khong co sinh vien nao co sdt ket thuc bang 026!");
				System.out.println("=========");
				break;
			}
		}

		System.out.println("\nDanh sach sinh vien khoa CNTT co chu 'd' trong ten:");
		for (SinhVien sinhVien : dssv) {
			if (sinhVien.ktraSVCNTTCoChuD()) {
				System.out.println(sinhVien);
				System.out.println("=========");
			} else {
				System.out.println("Khong co sinh vien khoa CNTT nao co chu 'd' trong ten!");
				System.out.println("=========");
				break;
			}
		}

		System.out.println("\nDanh sach sinh vien co diem TB duoi 7.5:");
		for (SinhVien sinhVien : dssv) {
			if (sinhVien.ktraSVDiemTBDuoi75()) {
				System.out.println(sinhVien);
				System.out.println("=========");
			} else {
				System.out.println("Khong co sinh vien co diem TB duoi 7.5!");
				System.out.println("=========");
				break;
			}
		}

		System.out.println("\nDanh sach sinh vien co diem he chu tu B+:");
		for (SinhVien sinhVien : dssv) {
			if (sinhVien.ktraSVDiemChuBCong()) {
				System.out.println(sinhVien);
				System.out.println("=========");
			} else {
				System.out.println("Khong co sinh vien co diem he chu tu B+");
				System.out.println("=========");
				break;
			}
		}

		Collections.sort(dssv, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				return Double.compare(sv1.getDiemTB(), sv2.getDiemTB());
			}
		});

		System.out.println("\nDanh sach sinh vien sau khi sap xep theo diem TB tang dan:");
		for (SinhVien sinhVien : dssv) {
			System.out.println(sinhVien);
			System.out.println("=========");
		}

	}
}
