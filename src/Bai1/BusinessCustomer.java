package Bai1;

public class BusinessCustomer extends Customer{

	public BusinessCustomer(String hoVaTenChuHo, String diaChi, double soCongToThangTruoc, double soCongToThangNay) {
		super(hoVaTenChuHo, diaChi, soCongToThangTruoc, soCongToThangNay);
	}

	@Override
	public double tinhTienDien() {
		if (this.laySoDien() <= 100)
			return this.laySoDien() * 2000;
		else
			return this.laySoDien() * 2500;
	}
}
