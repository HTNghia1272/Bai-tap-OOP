package Bai1_OOP;

public class DanhSachCD {
	private CD[] danhSachCD;
	private int soLuong;
	private static final int maxSize = 100;

	public DanhSachCD(CD[] danhSachCD, int soLuong) {
		this.danhSachCD = new CD[maxSize];
		this.soLuong = soLuong;
	}

	public boolean themCD(CD cd) {
		if (soLuong < maxSize && !trungMaCD(cd.getMaCD())) {
			danhSachCD[soLuong++] = cd;
			return true;
		}
		return false;
	}

	private boolean trungMaCD(int maCD) {
		for (int i = 0; i < soLuong; i++) {
			if (danhSachCD[i].getMaCD() == maCD) {
				return true;
			}
		}
		return false;
	}

	public int tinhSoLuongCDTrongDanhSach() {
		return soLuong;
	}

	public double tinhTongGiaThanhCacCD() {
		double tong = 0;
		for (int i = 0; i < soLuong; i++) {
			tong += danhSachCD[i].getGiaThanh();
		}
		return tong;
	}

	public void sapXepGiamDanTheoGia() {
		for (int i = 0; i < soLuong; i++) {
			for (int j = i + 1; j < soLuong; j++) {
				if (danhSachCD[i].getGiaThanh() < danhSachCD[j].getGiaThanh()) {
					CD temp = danhSachCD[i];
					danhSachCD[i] = danhSachCD[j];
					danhSachCD[j] = temp;
				}
			}
		}
	}

	public void sapXepTangDanTheoGia() {
		for (int i = 0; i < soLuong; i++) {
			for (int j = i + 1; j < soLuong; j++) {
				if (danhSachCD[i].getGiaThanh() > danhSachCD[j].getGiaThanh()) {
					CD temp = danhSachCD[i];
					danhSachCD[i] = danhSachCD[j];
					danhSachCD[j] = temp;
				}
			}
		}
	}

	public void xuatToanBoDanhSach() {
		for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSachCD[i]);
        }
	}
}
