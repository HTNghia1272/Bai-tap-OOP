package Bai3_OOP;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account ac1 = new Account(99999, "Ngu Quy Chin", 900000);
		Account ac2 = new Account(88888, "Ngu Quy Tam", 800000);
		Account ac3 = new Account(55555, "Ngu Quy Nam", 500000);

		System.out.println("Nhap so tien muon nap: ");
		double tienNap = sc.nextDouble();
		while (tienNap <= 0) {
			System.out.println("Tien nap phai lon hon 0, hay nhap lai!");
			tienNap = sc.nextDouble();
		}
		ac1.napTienVaoTaiKhoan(tienNap);
		System.out.println("So tien trong tai khoan:" + ac1);

		double tienRut = sc.nextDouble();
		while (tienRut <= 0) {
			System.out.println("Tien rut phai lon hon 0, hay nhap lai!");
			tienRut = sc.nextDouble();
		}
		while (tienRut > ac1.getSoTienTrongTaiKhoan()) {
			System.out.println("Tien rut khong the lon hon so tien trong tai khoan! Hay nhap lai:");
			tienRut = sc.nextDouble();
		}
		ac1.rutTien(tienRut, 10000);
		System.out.println("So tien trong tai khoan:" + ac1);
		ac1.daoHan();
		System.out.println("Dao han!");
		System.out.println("So tien trong tai khoan:" + ac1);
		System.out.println("Nhap so tien chuyen di: ");
		double tienChuyen = sc.nextDouble();
		while (tienChuyen <= 0) {
			System.out.println("Tien chuyen phai lon hon 0, hay nhap lai!");
			tienChuyen = sc.nextDouble();
		}
		while (tienChuyen > ac1.getSoTienTrongTaiKhoan()) {
			System.out.println("Tien chuyen khong the lon hon so tien trong tai khoan! Hay nhap lai:");
			tienChuyen = sc.nextDouble();
		}
		ac1.chuyenKhoan(ac3, tienChuyen);
		System.out.println("So tien trong tai khoan:" + ac1);
		System.out.println("So tien trong tai khoan:" + ac3);

	}
}
