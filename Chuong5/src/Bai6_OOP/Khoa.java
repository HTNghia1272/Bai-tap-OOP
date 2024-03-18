package Bai6_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Khoa {
	private String tenKhoa;
	private ArrayList<SinhVien> dssv;

	public Khoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
		this.dssv = new ArrayList<SinhVien>();
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public ArrayList<SinhVien> getDssv() {
		return dssv;
	}

	public void setDssv(ArrayList<SinhVien> dssv) {
		this.dssv = dssv;
	}

	public void themSinhVien(SinhVien sv) {
		dssv.add(sv);
	}

	public int demSinhVienChinhQuy() {
		int count = 0;
		for (SinhVien sinhVien : dssv) {
			if (sinhVien.laSinhVienChinhQuy()) {
				count++;
			}
		}
		return count;
	}

	public SinhVien timSinhVienDiemDauVaoCaoNhat() {
		if (dssv.isEmpty()) {
			return null;
		}

		SinhVien sinhVienDiemCaoNhat = dssv.get(0);

		for (SinhVien sinhVien : dssv) {
			if (sinhVien.getDiemDauVao() > sinhVienDiemCaoNhat.getDiemDauVao()) {
				sinhVienDiemCaoNhat = sinhVien;
			}
		}

		return sinhVienDiemCaoNhat;
	}

	public ArrayList<SinhVienTaiChuc> layDanhSachSinhVienTaiChucTheoNoiDaoTao(String noiDaoTao) {
		ArrayList<SinhVienTaiChuc> danhSachSinhVienTaiChuc = new ArrayList<>();

		for (SinhVien sinhVien : dssv) {
			if (sinhVien instanceof SinhVienTaiChuc) {
				SinhVienTaiChuc svTaiChuc = (SinhVienTaiChuc) sinhVien;
				if (svTaiChuc.getNoiLienKetDaoTao().equalsIgnoreCase(noiDaoTao)) {
					danhSachSinhVienTaiChuc.add(svTaiChuc);
				}
			}
		}

		return danhSachSinhVienTaiChuc;
	}

	public ArrayList<SinhVien> layDanhSachSinhVienDiemTBHocKyCuoiTren8() {
		ArrayList<SinhVien> danhSachSinhVienDiemTBHocKyCuoiTren8 = new ArrayList<>();

		for (SinhVien sinhVien : dssv) {
			ArrayList<KetQuaHocTap> danhSachKetQua = sinhVien.getKqht();
			if (!danhSachKetQua.isEmpty()) {
				KetQuaHocTap hocKyCuoiCung = danhSachKetQua.get(danhSachKetQua.size() - 1);
				if (hocKyCuoiCung.getDiemTrungBinh() >= 8.0) {
					danhSachSinhVienDiemTBHocKyCuoiTren8.add(sinhVien);
				}
			}
		}

		return danhSachSinhVienDiemTBHocKyCuoiTren8;
	}

	public SinhVien timSinhVienDiemTBCaoNhat() {
		SinhVien sinhVienDiemTBCaoNhat = null;
		double diemTBCaoNhat = 0.0;

		for (SinhVien sinhVien : dssv) {
			for (KetQuaHocTap ketQua : sinhVien.getKqht()) {
				if (ketQua.getDiemTrungBinh() > diemTBCaoNhat) {
					diemTBCaoNhat = ketQua.getDiemTrungBinh();
					sinhVienDiemTBCaoNhat = sinhVien;
				}
			}
		}

		return sinhVienDiemTBCaoNhat;
	}

	public void sapXepDanhSachSinhVien() {
		Collections.sort(dssv, (sv1, sv2) -> {
			int result = Boolean.compare(sv1 instanceof SinhVienTaiChuc, sv2 instanceof SinhVienTaiChuc);
			if (result != 0) {
				return result;
			}

			return Integer.compare(sv2.getNamVaoHoc(), sv1.getNamVaoHoc());
		});
	}

	public void thongKeSoLuongSinhVienTheoNamVaoHoc() {
		Map<Integer, Integer> soLuongSinhVienTheoNam = new HashMap<>();

		for (SinhVien sinhVien : dssv) {
			int namVaoHoc = sinhVien.getNamVaoHoc();
			soLuongSinhVienTheoNam.put(namVaoHoc, soLuongSinhVienTheoNam.getOrDefault(namVaoHoc, 0) + 1);
		}

		System.out.println("Thống kê số lượng sinh viên theo năm vào học:");
		for (Map.Entry<Integer, Integer> entry : soLuongSinhVienTheoNam.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
