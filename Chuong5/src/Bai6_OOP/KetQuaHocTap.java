package Bai6_OOP;

public class KetQuaHocTap {
	private String tenHocKy;
	private double diemTrungBinh;

	public KetQuaHocTap(String tenHocKy, double diemTrungBinh) {
		this.tenHocKy = tenHocKy;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getTenHocKy() {
		return tenHocKy;
	}

	public void setTenHocKy(String tenHocKy) {
		this.tenHocKy = tenHocKy;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		return "tenHocKy = " + tenHocKy + ", diemTrungBinh = " + diemTrungBinh + "";
	}

}
