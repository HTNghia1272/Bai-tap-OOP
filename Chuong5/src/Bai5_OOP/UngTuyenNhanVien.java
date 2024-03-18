package Bai5_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class UngTuyenNhanVien {
	public static <T> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		System.out.println("Nhap so luong sinh vien can tuyen dung: ");
		int m = sc.nextInt();
		while (m < 2 || m > 15) {
			System.out.println("So luong sinh vien can tuyen toi thieu la 2 va toi da 15. Hay thu nhap lai!");
			m = sc.nextInt();
		}
		int demSVKhaGioi = 0;
		int demSVTB = 0;
		ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
		for (int i = 0; i < n; i++) {
			System.out.println("Chon nhap thong tin sinh vien (1 - sinh vien gioi, 2 - sinh vien trung binh)");
			int choose = sc.nextInt();
			while (choose != 1 && choose != 2) {
				System.out.println("Chon 1 hoac 2!");
				choose = sc.nextInt();
			}
			if (choose == 1) {
				System.out.println("Nhap thong tin sinh vien kha gioi:");
				SinhVien khaGioi = new GoodStudent();
				khaGioi.input();
				dssv.add(khaGioi);
				demSVKhaGioi++;
			} else {
				System.out.println("Nhap thong tin sinh vien trung binh:");
				SinhVien trungBinh = new NormalStudent();
				trungBinh.input();
				dssv.add(trungBinh);
				demSVTB++;
			}

		}

//		System.out.println("\nDanh sach ten va sdt sinh vien truoc khi sap xep:");
//		for (SinhVien sinhVien : dssv) {
//			System.out.println("Ho va ten: " + sinhVien.getFullName());
//			System.out.println("SDT: " + sinhVien.getPhoneNumber());
//			System.out.println("=======");
//		}
//		Collections.sort(dssv, new Comparator<SinhVien>() {
//
//			@Override
//			public int compare(SinhVien o1, SinhVien o2) {
//				if (o1.getName().equals(o2.getName())) {
//					return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
//				} else {
//					return o2.getName().compareTo(o1.getName());
//				}
//			}
//		});
//
//		System.out.println("\nDanh sach sinh vien ten giam dan va sdt tang dan:");
//		for (SinhVien sinhVien : dssv) {
//			System.out.println("Ho va ten: " + sinhVien.getFullName());
//			System.out.println("SDT: " + sinhVien.getPhoneNumber());
//			System.out.println("=======");
//		}

		int slotConLai = m;
		Collections.sort(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getGpa() == (o2.getGpa())) {
					return o1.getName().compareTo(o2.getName());
				} else {
					return Double.compare(o2.getGpa(), o1.getGpa());
				}

			}
		});

		System.out.println("\nSinh vien duoc tuyen dung:");
		System.out.println("=======");
		if (demSVKhaGioi > 0) {
			Iterator<SinhVien> iterator = dssv.iterator();
			while (iterator.hasNext() && demSVKhaGioi <= slotConLai) {
				SinhVien sinhVien = iterator.next();
				slotConLai--;
				sinhVien.ShowMyInfor();
				System.out.println("=======");
				iterator.remove();
			}
		} 
		Collections.sort(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getEnglishScore() == o2.getEnglishScore()) {
					return o1.getName().compareTo(o2.getName());
				} else {
					return Integer.compare(o2.getEnglishScore(), o1.getEnglishScore());
				}

			}
		});

		for (SinhVien sinhVien : dssv) {
			if (slotConLai > 0) {
				slotConLai--;
				sinhVien.ShowMyInfor();
				System.out.println("=======");
			}
		}

	}
}
