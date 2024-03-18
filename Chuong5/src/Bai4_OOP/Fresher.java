package Bai4_OOP;

import java.util.Scanner;

public class Fresher extends Employee {
	private String Graduation_date;
	private String Graduation_rank;
	private String Education;

	public Fresher(String iD, String fullName, String birthDay, String phone, String email, String graduation_date,
			String graduation_rank, String education) {
		super(iD, fullName, birthDay, phone, email);
		Graduation_date = graduation_date;
		Graduation_rank = graduation_rank;
		Education = education;
	}

	public Fresher() {
	}

	public String getGraduation_date() {
		return Graduation_date;
	}

	public void setGraduation_date(String graduation_date) {
		Graduation_date = graduation_date;
	}

	public String getGraduation_rank() {
		return Graduation_rank;
	}

	public void setGraduation_rank(String graduation_rank) {
		Graduation_rank = graduation_rank;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}

	@Override
	public void ShowInfo() {
		System.out.println("Fresher:");
		System.out.println("ID = " + getID());
		System.out.println("Full name = " + getFullName());
		System.out.println("Birth Day = " + getBirthDay());
		System.out.println("Phone = " + getPhone());
		System.out.println("Email = " + getEmail());
		System.out.println("Graduation_date = " + getGraduation_date());
		System.out.println("Graduation_rank = " + getGraduation_rank());
		System.out.println("Education = " + getEducation());
	}

	@Override
	public void inputCertificates(Scanner sc) {
		super.inputCertificates(sc);
	}
}
