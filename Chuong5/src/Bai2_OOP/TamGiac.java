package Bai2_OOP;

import java.util.Arrays;

public class TamGiac extends DaGiac {

	public TamGiac(double[] kichThuocCacCanh) {
		super(3, kichThuocCacCanh);
	}

	public double tinhChuVi() {
		double chuVi = 0;
		for (int i = 0; i < soCanh; i++) {
			chuVi += kichThuocCacCanh[i];
		}
		return chuVi;
	}

	public double tinhDienTichTamGiac() {
		double p = tinhChuVi() / 2;
		return Math.sqrt(p * (p - kichThuocCacCanh[0]) * (p - kichThuocCacCanh[1]) * (p - kichThuocCacCanh[2]));
	}

	public void inCacCanhTamGiac() {
		System.out.print("Cac canh cua tam giac: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(kichThuocCacCanh[i] + " ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "TamGiac [soCanh = " + soCanh + ", kichThuocCacCanh = " + Arrays.toString(kichThuocCacCanh)
				+ ", ChuVi() = " + tinhChuVi() + ", DienTichTamGiac() = " + tinhDienTichTamGiac() + "]";
	}

}
