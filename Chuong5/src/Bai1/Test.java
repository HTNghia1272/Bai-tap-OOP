package Bai1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so luong hinh chu nhat: ");
		int n = sc.nextInt();

		Rectangle[] rectangles = new Rectangle[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap chieu cao hinh chu nhat [" + i + "]: ");
			double length = sc.nextDouble();
			while (length <= 0) {
				System.out.println("Nhap so nguyen duong!");
				length = sc.nextDouble();
			}
			System.out.println("Nhap chieu rong hinh chu nhat[" + i + "]: ");
			double width = sc.nextDouble();
			while (width <= 0) {
				System.out.println("Nhap so nguyen duong!");
				width = sc.nextDouble();
			}
			rectangles[i] = new Rectangle(length, width);
			System.out.println("Dien tich HCN: " + rectangles[i].getArea());
			System.out.println("Chu vi HCN: " + rectangles[i].getPerimeter());
		}

		Rectangle minAreaRectangle = rectangles[0];
		Rectangle maxPerimeterRectangle = rectangles[0];

		for (int i = 1; i < n; i++) {
			if (rectangles[i].getArea() < minAreaRectangle.getArea())
				minAreaRectangle = rectangles[i];

			if (rectangles[i].getPerimeter() > maxPerimeterRectangle.getPerimeter())
				maxPerimeterRectangle = rectangles[i];
		}

		System.out.println("\nHinh chu nhat co chu vi nho nhat: " + minAreaRectangle.getArea());
		System.out.println("Chieu cao: " + minAreaRectangle.getLength());
		System.out.println("Chieu rong: " + minAreaRectangle.getWidth());

		System.out.println("\nHinh chu nhat co dien tich lon nhat: " + maxPerimeterRectangle.getPerimeter());
		System.out.println("Chieu cao: " + maxPerimeterRectangle.getLength());
		System.out.println("Chieu rong: " + maxPerimeterRectangle.getWidth());

		System.out.println("Nhap so luong hinh tron: ");
		int m = sc.nextInt();

		Circle[] circles = new Circle[m];
		for (int i = 0; i < m; i++) {
			System.out.println("Nhap ban kinh hinh tron [" + i + "]: ");
			double r = sc.nextDouble();
			while (r <= 0) {
				System.out.println("Nhap so nguyen duong!");
				r = sc.nextDouble();
			}
			circles[i] = new Circle(r);
			System.out.println("Dien tich hinh tron: " + circles[i].getArea());
			System.out.println("Chu vi hinh tron: " + circles[i].getPerimeter());
		}

		int DistintAreas = countDistintAreas(circles);

		if (DistintAreas > 0) {
			System.out.println("So hinh tron co dien tich khac nhau la: " + DistintAreas);
			System.out.println("Ban co muon sap xep cac hinh tron theo dien tich khong? 'y' or 'n': ");
			char choice = sc.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				Arrays.sort(circles, (c1, c2) -> Double.compare(c1.getR(), c2.getR()));

				System.out.println("Cac hinh tron sau khi duoc sap xep: ");
				displayCircleInfo(circles);
			}
		} else
			System.out.println("Tat ca cac hinh tron co dien tich bang nhau!");

	}

	private static int countDistintAreas(Circle[] circles) {
		int count = 0;
		for (int i = 0; i < circles.length; i++) {
			boolean isDistint = true;

			for (int j = i + 1; j < circles.length; j++) {
				if (circles[i].getArea() == circles[j].getArea()) {
					isDistint = false;
					break;
				}
			}
			if (isDistint) {
				count++;
			}
		}
		return count;
	}

	private static void displayCircleInfo(Circle[] circles) {
		for (Circle circle : circles) {
			System.out.println("Bán kính: " + circle.getR());
			System.out.println("Chu vi: " + circle.getPerimeter());
			System.out.println("Diện tích: " + circle.getArea());
			System.out.println("------------");
		}
	}

}