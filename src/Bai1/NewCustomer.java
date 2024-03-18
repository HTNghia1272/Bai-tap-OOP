package Bai1;

public class NewCustomer extends Customer {
	public NewCustomer(String hoVaTenChuHo, String diaChi, double soCongToThangTruoc, double soCongToThangNay) {
		super(hoVaTenChuHo, diaChi, soCongToThangTruoc, soCongToThangNay);
	}

	@Override
	public double tinhTienDien() {
		if (super.laySoDien() <= 100)
			return this.laySoDien() * 1234;
		else
			return this.laySoDien() * 1650;
	}
	
}
