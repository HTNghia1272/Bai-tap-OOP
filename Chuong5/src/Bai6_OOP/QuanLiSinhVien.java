package Bai6_OOP;

import java.util.ArrayList;

public class QuanLiSinhVien {
	public static void main(String[] args) {
		Khoa khoaIT = new Khoa("Khoa Công nghệ thông tin");

		SinhVien sv1 = new SinhVien(001, "Nguyen Van A", "01/01/2000", 2022, 8.0);
		sv1.themKetQuaHocTap(new KetQuaHocTap("Hoc Ky 1", 7.5));
		sv1.themKetQuaHocTap(new KetQuaHocTap("Hoc Ky 2", 8.0));

		SinhVienTaiChuc sv2 = new SinhVienTaiChuc(002, "Tran Thi B", "02/02/2000", 2021, 7.5, "Đồng Nai");
		sv2.themKetQuaHocTap(new KetQuaHocTap("Hoc Ky 1", 7.0));
		sv2.themKetQuaHocTap(new KetQuaHocTap("Hoc Ky 2", 7.8));

		khoaIT.themSinhVien(sv1);
		khoaIT.themSinhVien(sv2);

		for (SinhVien sinhVien : khoaIT.getDssv()) {
			sinhVien.xuatThongTin();
			System.out.println("Là sinh viên chính quy: " + sinhVien.laSinhVienChinhQuy());
			System.out.println("Danh sách kết quả học tập:");
			for (KetQuaHocTap ketQua : sinhVien.getKqht()) {
				System.out.println("- " + ketQua.getTenHocKy() + ": " + ketQua.getDiemTrungBinh());
			}
			System.out.println("====================");
		}

		System.out.println("Tong sinh vien chinh quy cua khoa: " + khoaIT.demSinhVienChinhQuy());

		System.out.println("Sinh vien co diem dau vao cao nhat: " + khoaIT.timSinhVienDiemDauVaoCaoNhat().toString());

		String noiDaoTaoCanTim = "Đồng Nai";
		ArrayList<SinhVienTaiChuc> danhSachSinhVienTaiChuc = khoaIT
				.layDanhSachSinhVienTaiChucTheoNoiDaoTao(noiDaoTaoCanTim);

		if (!danhSachSinhVienTaiChuc.isEmpty()) {
			System.out.println("Danh sách sinh viên tại chức tại " + noiDaoTaoCanTim + ":");
			for (SinhVienTaiChuc svTaiChuc : danhSachSinhVienTaiChuc) {
				svTaiChuc.xuatThongTin();
				System.out.println("====================");
			}
		} else {
			System.out.println("Không có sinh viên tại chức tại " + noiDaoTaoCanTim);
		}

		System.out.println(
				"DS Sinh vien co diem TB tren 8 HK truoc: " + khoaIT.layDanhSachSinhVienDiemTBHocKyCuoiTren8());

		System.out.println("\nSinh vien co diem TB cao nhat: " + khoaIT.timSinhVienDiemTBCaoNhat());

		khoaIT.sapXepDanhSachSinhVien();
		System.out.println("Sap xep danh sach sinh vien giam dan theo nam vao hoc: ");
		System.out.println("Danh sách sau khi sắp xếp:");
		for (SinhVien sinhVien : khoaIT.getDssv()) {
			sinhVien.xuatThongTin();
			System.out.println("====================");
		}
		
		khoaIT.thongKeSoLuongSinhVienTheoNamVaoHoc();
	}
}
