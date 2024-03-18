package Bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SinhVien extends DiemSo {
	private String MaSV, hoTen, email, soDT, khoaQL, khoaDT, lop;
	private int namSinh;

	public SinhVien(String maSV, String hoTen, String email, String soDT, String khoaQL, String khoaDT, String lop,
			int namSinh, double diemMonChuyenNganh, double diemMonTuChon) {
		super(diemMonChuyenNganh, diemMonTuChon);
		MaSV = maSV;
		this.hoTen = hoTen;
		this.email = email;
		this.soDT = soDT;
		this.khoaQL = khoaQL;
		this.khoaDT = khoaDT;
		this.lop = lop;
		this.namSinh = namSinh;
	}

	public String getMaSV() {
		return MaSV;
	}

	public void setMaSV(String maSV) {
		MaSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getKhoaQL() {
		return khoaQL;
	}

	public void setKhoaQL(String khoaQL) {
		this.khoaQL = khoaQL;
	}

	public String getKhoaDT() {
		return khoaDT;
	}

	public void setKhoaDT(String khoaDT) {
		this.khoaDT = khoaDT;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	@Override
	public String toString() {
		return "SinhVien [Ma SV = " + MaSV + ", ho Ten = " + hoTen + ", email = " + email + ", so DT = " + soDT
				+ ", khoa QL = " + khoaQL + ", khoa DT = " + khoaDT + ", lop = " + lop + ", nam Sinh = " + namSinh
				+ ", " + super.toString() + "]";
	}

	public boolean ktraSVTenCoChuA() {
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher(hoTen);

		return m.find();
	}

	public boolean ktraSVCoSDT026() {
		Pattern p = Pattern.compile("026$");
		Matcher m = p.matcher(getSoDT());

		return m.find();
	}

	public boolean ktraSVCNTTCoChuD() {
		Pattern p = Pattern.compile("d");
		Matcher m = p.matcher(hoTen);

		if ("CNTT".equals(khoaQL)) {
			return m.find();
		}
		return false;
	}

	public boolean ktraSVDiemTBDuoi75() {
		if (getDiemTB() < 7.5) {
			return true;
		} else
			return false;
	}

	public boolean ktraSVDiemChuBCong() {
		if (getDiemTB() >= 8) {
			return true;
		} else
			return false;
	}

}
