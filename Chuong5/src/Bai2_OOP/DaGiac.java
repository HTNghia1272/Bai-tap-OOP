package Bai2_OOP;

public class DaGiac {
	protected int soCanh;
	protected double[] kichThuocCacCanh;
	
	public DaGiac(int soCanh, double[] kichThuocCacCanh) {
		this.soCanh = soCanh;
		this.kichThuocCacCanh = kichThuocCacCanh;
	}

	public int getSoCanh() {
		return soCanh;
	}

	public void setSoCanh(int soCanh) {
		this.soCanh = soCanh;
	}

	public double[] getKichThuocCacCanh() {
		return kichThuocCacCanh;
	}

	public void setKichThuocCacCanh(double[] kichThuocCacCanh) {
		this.kichThuocCacCanh = kichThuocCacCanh;
	}
	
	public double tinhChuVi() {
		int chuVi = 0;
		for (int i = 0; i < soCanh; i++) {
			chuVi += kichThuocCacCanh[i];
		}
		return chuVi;
	}
	
	public void inGiaTriCacCanh() {
		for (int i = 0; i < soCanh; i++) {
			System.out.print(kichThuocCacCanh[i] + " ");
		}
		System.out.println();
	}
}
