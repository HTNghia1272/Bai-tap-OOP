package Bai2;

public class DiemSo {
	private double diemMonChuyenNganh, diemMonTuChon, diemTB;
	private String diemTBChu;

	public DiemSo(double diemMonChuyenNganh, double diemMonTuChon) {
		this.diemMonChuyenNganh = diemMonChuyenNganh;
		this.diemMonTuChon = diemMonTuChon;
	}

	public double getDiemMonChuyenNganh() {
		return diemMonChuyenNganh;
	}

	public void setDiemMonChuyenNganh(double diemMonChuyenNganh) {
		this.diemMonChuyenNganh = diemMonChuyenNganh;
	}

	public double getDiemMonTuChon() {
		return diemMonTuChon;
	}

	public void setDiemMonTuChon(double diemMonTuChon) {
		this.diemMonTuChon = diemMonTuChon;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public String getDiemTBChu() {
		return diemTBChu;
	}

	public void setDiemTBChu(String diemTBChu) {
		this.diemTBChu = diemTBChu;
	}

	@Override
	public String toString() {
		return "diem Mon Chuyen Nganh = " + diemMonChuyenNganh + ", diem Mon Tu Chon = " + diemMonTuChon + ", diem TB = "
				+ diemTB + ", diemTBChu = " + diemTBChu;
	}

}
