package Bai3_OOP;

public class Account {
	private long soTaiKhoan;
	private String tenTaiKhoan;
	private double soTienTrongTaiKhoan;
	private static final double laiSuat = 0.035;

	public Account(long soTaiKhoan, String tenTaiKhoan, double soTienTrongTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
	}

	public long getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public void setSoTaiKhoan(long soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public double getSoTienTrongTaiKhoan() {
		return soTienTrongTaiKhoan;
	}

	public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
		this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
	}

	public double napTienVaoTaiKhoan(double tienNap) {
		return this.soTienTrongTaiKhoan += tienNap;
	}

	public double rutTien(double tienRut, double phiRut) {
		if (soTienTrongTaiKhoan >= tienRut + phiRut) {
			return soTienTrongTaiKhoan -= (tienRut + phiRut);
		} else {
			System.out.println("Khong du tien de rut!");
			return -1;
		}
	}

	public double daoHan() {
		return soTienTrongTaiKhoan += (soTienTrongTaiKhoan * laiSuat);
	}

	public double chuyenKhoan(Account TKKhac, double tienChuyen) {
		if (soTienTrongTaiKhoan >= tienChuyen) {
			soTienTrongTaiKhoan -= tienChuyen;
			return TKKhac.soTienTrongTaiKhoan += tienChuyen;
		} else {
			System.out.println("Khong du tien de chuyen!");
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Account [soTaiKhoan = " + soTaiKhoan + ", tenTaiKhoan = " + tenTaiKhoan + ", soTienTrongTaiKhoan = "
				+ soTienTrongTaiKhoan + "]";
	}
}
