package Bai5_OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class SinhVien implements Comparable<SinhVien> {

	private String fullName;
	private String doB;
	private String sex;
	private String phoneNumber;
	private String universityName;
	private String gradeLevel;
	private double gpa;
	private int englishScore;

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public SinhVien(String fullName, String doB, String sex, String phoneNumber, String universityName,
			String gradeLevel) {
		this.fullName = fullName;
		this.doB = doB;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.universityName = universityName;
		this.gradeLevel = gradeLevel;
	}

	public SinhVien() {
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDoB() {
		return doB;
	}

	public void setDoB(String doB) {
		this.doB = doB;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public abstract void ShowMyInfor();

	Scanner sc = new Scanner(System.in);

	public String nhapNgaySinh() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);

		while (true) {
			try {
				String input = sc.nextLine();

				if (input.matches("\\d{0,2}/\\d{0,2}/\\d{4}")) {
					Date date = dateFormat.parse(input);
					return this.doB = dateFormat.format(date);
				} else {
					throw new ParseException("Year must have 4 digits (yyyy)", 0);
				}
			} catch (ParseException e) {
				System.out.println("Dinh dang ngay khong dung hoac nam phai co 4 chu so, hay nhap lai!");
			}
		}
	}

	public String nhapSDT() {
		String PatternPhone = "^(090|098|091|031|035|038)\\d{7}$";

		while (true) {
			try {
				String sdt = sc.nextLine();
				if (sdt.matches(PatternPhone)) {
					return this.phoneNumber = sdt;
				} else {
					throw new Exception("So dien thoai khong hop le! Hay nhap lai!");
				}
			} catch (Exception e) {
				System.out.println(
						"Số điện thoại phải là chuỗi số có chiều dài 10 ký tự và phải bắt đầu bằng: 090, 098, 091, 031, 035 hoặc 038.");
			}
		}
	}

	public String nhapHoTen() {
		String hoTen = sc.nextLine();
		while (true) {
			try {
				if (hoTen.length() >= 10 && hoTen.length() <= 50) {
					return this.fullName = hoTen;
				} else {
					throw new Exception("Họ tên sinh viên có chiều dài tối đa là 50 ký tự và tổi thiểu là 10 ký tự.");

				}

			} catch (Exception e) {
				System.out.println("Họ tên sinh viên có chiều dài tối đa là 50 ký tự và tổi thiểu là 10 ký tự.");
				hoTen = sc.nextLine();
			}
		}
	}

	public void input() {
		System.out.println("Ho va ten:");
		fullName = nhapHoTen();
		System.out.println("Ngay sinh:");
		doB = nhapNgaySinh();
		System.out.println("Gioi tinh:");
		sex = sc.nextLine();
		System.out.println("So dien thoai:");
		phoneNumber = nhapSDT();
		System.out.println("Ten truong tot nghiep:");
		universityName = sc.nextLine();
		System.out.println("Xep loai tot nghiep:");
		gradeLevel = sc.nextLine();
	}

	public String getName() {
		String s = this.getFullName().trim();
		if (s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);
		} else {
			return s;
		}
	}

}
