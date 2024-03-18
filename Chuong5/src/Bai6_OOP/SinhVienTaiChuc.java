package Bai6_OOP;

import java.util.Scanner;

public class SinhVienTaiChuc extends SinhVien {
	private String noiLienKetDaoTao;

	public SinhVienTaiChuc() {

	}

	public SinhVienTaiChuc(int maSinhVien, String hoVaTen, String ngayThangNamSinh, int namVaoHoc, double diemDauVao,
			String noiLienKetDaoTao) {
		super(maSinhVien, hoVaTen, ngayThangNamSinh, namVaoHoc, diemDauVao);
		this.noiLienKetDaoTao = noiLienKetDaoTao;
	}

	public String getNoiLienKetDaoTao() {
		return noiLienKetDaoTao;
	}

	public void setNoiLienKetDaoTao(String noiLienKetDaoTao) {
		this.noiLienKetDaoTao = noiLienKetDaoTao;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập nơi liên kết đào tạo: ");
		noiLienKetDaoTao = scanner.nextLine();
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Nơi liên kết đào tạo: " + noiLienKetDaoTao);
	}

	@Override
	public String toString() {
		return "SinhVienTaiChuc [getMaSinhVien()=" + getMaSinhVien() + ", getHoVaTen()=" + getHoVaTen()
				+ ", getNgayThangNamSinh()=" + getNgayThangNamSinh() + ", getNamVaoHoc()=" + getNamVaoHoc()
				+ ", getDiemDauVao()=" + getDiemDauVao() + ", getKqht()=" + getKqht() + ", laSinhVienChinhQuy()="
				+ laSinhVienChinhQuy() + ", toString()=" + super.toString() + "]";
	}

}
