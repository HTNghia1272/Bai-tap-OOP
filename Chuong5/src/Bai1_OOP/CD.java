package Bai1_OOP;

public class CD {
	private int maCD;
	private String tenCD;
	private String tenCaSy;
	private int soBaiHat;
	private double giaThanh;

	public CD(int maCD, String tenCD, String tenCaSy, int soBaiHat, double giaThanh) {
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.tenCaSy = tenCaSy;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}

	public String getTenCD() {
		return tenCD;
	}

	public void setTenCD(String tenCD) {
		this.tenCD = tenCD;
	}

	public String getTenCaSy() {
		return tenCaSy;
	}

	public void setTenCaSy(String tenCaSy) {
		this.tenCaSy = tenCaSy;
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}

	@Override
	public String toString() {
		return "CD [maCD = " + maCD + ", tenCD = " + tenCD + ", tenCaSy = " + tenCaSy + ", soBaiHat = " + soBaiHat
				+ ", giaThanh = " + giaThanh + "]";
	}

}
