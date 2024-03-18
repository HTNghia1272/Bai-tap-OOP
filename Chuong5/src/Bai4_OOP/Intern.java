package Bai4_OOP;

import java.util.Scanner;

public class Intern extends Employee {
	private String Majors;
	private String Semester;
	private String University_name;

	public Intern(String iD, String fullName, String birthDay, String phone, String email, String majors,
			String semester, String university_name) {
		super(iD, fullName, birthDay, phone, email);
		Majors = majors;
		Semester = semester;
		University_name = university_name;
	}

	public Intern() {
	}

	public String getMajors() {
		return Majors;
	}

	public void setMajors(String majors) {
		Majors = majors;
	}

	public String getSemester() {
		return Semester;
	}

	public void setSemester(String semester) {
		Semester = semester;
	}

	public String getUniversity_name() {
		return University_name;
	}

	public void setUniversity_name(String university_name) {
		University_name = university_name;
	}

	@Override
	public void ShowInfo() {
		System.out.println("Intern:");
		System.out.println("ID = " + getID());
		System.out.println("Full name = " + getFullName());
		System.out.println("Birth Day = " + getBirthDay());
		System.out.println("Phone = " + getPhone());
		System.out.println("Email = " + getEmail());
		System.out.println("Majors = " + getMajors());
		System.out.println("Semester = " + getSemester());
		System.out.println("University_name = " + getUniversity_name());
	}

	@Override
	public void inputCertificates(Scanner sc) {
		super.inputCertificates(sc);
	}
}
