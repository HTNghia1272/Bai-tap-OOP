package Bai1;

public class Test {
	public static void main(String[] args) {
		Customer ct = new Customer("nghia", "cau giay", 7000, 7050);
		Customer ct1 = new NewCustomer("ab", "me tri", 10, 120);
		Customer ct2 = new BusinessCustomer("vti", "me tri", 500, 700);

		System.out.println("Tien dien khach hang cu: " + ct.tinhTienDien());
		System.out.println("Tien dien khach hang moi: " + ct1.tinhTienDien());
		System.out.println("Tien dien khach hang doanh nghiep: " + ct2.tinhTienDien());
	}
}
