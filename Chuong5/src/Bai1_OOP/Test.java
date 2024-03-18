package Bai1_OOP;

public class Test {
	public static void main(String[] args) {
		DanhSachCD danhSach = new DanhSachCD(null, 0);

		CD cd1 = new CD(1, "CD1", "Ca Sy 1", 10, 100000);
		CD cd2 = new CD(2, "CD2", "Ca Sy 2", 12, 120000);
		CD cd3 = new CD(3, "CD3", "Ca Sy 3", 8, 80000);

		danhSach.themCD(cd1);
		danhSach.themCD(cd2);
		danhSach.themCD(cd3);

		System.out.println("So luong CD: " + danhSach.tinhSoLuongCDTrongDanhSach());
		System.out.println("Tong gia thanh: " + danhSach.tinhTongGiaThanhCacCD());

		System.out.println("Danh sach CD truoc khi sap xep:");
		danhSach.xuatToanBoDanhSach();

		danhSach.sapXepGiamDanTheoGia();

		System.out.println("\nDanh sach CD sau khi sap xep giam dan theo gia thanh:");
		danhSach.xuatToanBoDanhSach();

		danhSach.sapXepTangDanTheoGia();

		System.out.println("\nDanh sach CD sau khi sap xep tang dan theo tua CD:");
		danhSach.xuatToanBoDanhSach();
	}
}