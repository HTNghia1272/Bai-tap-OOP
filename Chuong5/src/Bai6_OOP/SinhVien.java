package Bai6_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
	private int maSinhVien;
	private String hoVaTen;
	private String ngayThangNamSinh;
	private int namVaoHoc;
	private double diemDauVao;
	private ArrayList<KetQuaHocTap> kqht;

	public SinhVien(int maSinhVien, String hoVaTen, String ngayThangNamSinh, int namVaoHoc, double diemDauVao) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.ngayThangNamSinh = ngayThangNamSinh;
		this.namVaoHoc = namVaoHoc;
		this.diemDauVao = diemDauVao;
		this.kqht = new ArrayList<KetQuaHocTap>();
	}

	public SinhVien() {
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getNgayThangNamSinh() {
		return ngayThangNamSinh;
	}

	public void setNgayThangNamSinh(String ngayThangNamSinh) {
		this.ngayThangNamSinh = ngayThangNamSinh;
	}

	public int getNamVaoHoc() {
		return namVaoHoc;
	}

	public void setNamVaoHoc(int namVaoHoc) {
		this.namVaoHoc = namVaoHoc;
	}

	public double getDiemDauVao() {
		return diemDauVao;
	}

	public void setDiemDauVao(double diemDauVao) {
		this.diemDauVao = diemDauVao;
	}

	public ArrayList<KetQuaHocTap> getKqht() {
		return kqht;
	}

	public void setKqht(ArrayList<KetQuaHocTap> kqht) {
		this.kqht = kqht;
	}

	public boolean laSinhVienChinhQuy() {
		return (this instanceof SinhVienTaiChuc) ? false : true;
	}

	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên: ");
		maSinhVien = scanner.nextInt();
	}

	public void xuatThongTin() {
		System.out.println("Mã sinh viên: " + maSinhVien);
		System.out.println("Họ tên: " + hoVaTen);
		System.out.println("Ngay thang nam sinh: " + ngayThangNamSinh);
		System.out.println("Nam vao hoc: " + namVaoHoc);
		System.out.println("Diem dau vao: " + diemDauVao);
		System.out.println("Ket qua hoc tap: " + kqht);
	}

	public void themKetQuaHocTap(KetQuaHocTap ketQuaHocTap) {
		kqht.add(ketQuaHocTap);
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", ngayThangNamSinh=" + ngayThangNamSinh
				+ ", namVaoHoc=" + namVaoHoc + ", diemDauVao=" + diemDauVao + ", kqht=" + kqht + "]";
	}

}
