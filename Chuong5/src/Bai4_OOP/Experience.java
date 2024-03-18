package Bai4_OOP;

import java.util.Scanner;

public class Experience extends Employee {
	private int ExpInYear;
	private String ProSkill;

	public Experience() {
		super();
	}

	public Experience(String iD, String fullName, String birthDay, String phone, String email, int ExpInYear,
			String ProSkill) {
		super(iD, fullName, birthDay, phone, email);
		this.ExpInYear = (ExpInYear >= 0) ? ExpInYear : 0;
		this.ProSkill = (ProSkill != null) ? ProSkill : "Undefined";
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	public String getProSkill() {
		return ProSkill;
	}

	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}

	@Override
	public void ShowInfo() {
		System.out.println("Experience:");
		System.out.println("ID = " + getID());
		System.out.println("Full name = " + getFullName());
		System.out.println("Birth Day = " + getBirthDay());
		System.out.println("Phone = " + getPhone());
		System.out.println("Email = " + getEmail());
		System.out.println("ExpInYear = " + getExpInYear());
		System.out.println("ProSkill = " + getProSkill());
		System.out.println("~Bang Cap~");
		System.out.println("Certificate: " + super.certificates);
	}

	@Override
	public void inputCertificates(Scanner sc) {
		super.inputCertificates(sc);
	}

}
