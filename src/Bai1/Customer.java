package Bai1;

public class Customer {
	private String hoVaTenChuHo, diaChi;
	private double soCongToThangTruoc, soCongToThangNay;
	
	public Customer(String hoVaTenChuHo, String diaChi, double soCongToThangTruoc, double soCongToThangNay) {
		this.hoVaTenChuHo = hoVaTenChuHo;
		this.diaChi = diaChi;
		this.soCongToThangTruoc = soCongToThangTruoc;
		this.soCongToThangNay = soCongToThangNay;
	}

	public String getHoVaTenChuHo() {
		return hoVaTenChuHo;
	}

	public void setHoVaTenChuHo(String hoVaTenChuHo) {
		this.hoVaTenChuHo = hoVaTenChuHo;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public double getSoCongToThangTruoc() {
		return soCongToThangTruoc;
	}

	public void setSoCongToThangTruoc(double soCongToThangTruoc) {
		this.soCongToThangTruoc = soCongToThangTruoc;
	}

	public double getSoCongToThangNay() {
		return soCongToThangNay;
	}

	public void setSoCongToThangNay(double soCongToThangNay) {
		this.soCongToThangNay = soCongToThangNay;
	}
	
	public double laySoDien() {
		return this.soCongToThangNay - this.soCongToThangTruoc;
	}
	
	public double tinhTienDien() {
		return this.laySoDien() * 1234;
	}
}
