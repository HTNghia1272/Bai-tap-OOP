package Bai4_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Employee {
	private String ID;
	private String FullName;
	private String BirthDay;
	private String Phone;
	private String Email;
	private int Employee_type;
	private int Employee_count;
	protected ArrayList<Certificate> certificates;

	public Employee(String iD, String fullName, String birthDay, String phone, String email) {
		this.ID = iD;
		this.FullName = fullName;
		this.BirthDay = birthDay;
		this.Phone = phone;
		this.Email = email;
		this.Employee_type = getEmployee_type();
		this.Employee_count = getEmployee_count();
		this.certificates = new ArrayList<>();
	}

	public Employee() {
	}	

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getBirthDay() {
		return BirthDay;
	}

	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getEmployee_type() {
		return Employee_type;
	}

	public int setEmployeeType(int type) {
		if (type >= 0 && type <= 2) {
			return this.Employee_type = type;
		} else {
			System.out.println("Invalid employee type. Setting default to 0 (Experience).");
			return this.Employee_type = 0;
		}
	}

	public int getEmployee_count() {
		return Employee_count;
	}

	public void setEmployee_count(int employee_count) {
		Employee_count = employee_count;
	}

	public ArrayList<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(ArrayList<Certificate> certificates) {
		this.certificates = certificates;
	}

	public abstract void ShowInfo();

	public void inputCertificates(Scanner sc) {
		System.out.println("Nhap so luong bang cap: ");
		int numCertificates = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numCertificates; i++) {
			System.out.println("Nhap thong tin bang cap thu " + (i + 1) + ":");
			System.out.println("CertificateID: ");
			String certificateID = sc.nextLine();
			System.out.println("CertificateName: ");
			String certificateName = sc.nextLine();
			System.out.println("CertificateRank: ");
			String certificateRank = sc.nextLine();
			System.out.println("CertificateDate: ");
			String certificateDate = sc.nextLine();

			Certificate certificate = new Certificate(certificateID, certificateName, certificateRank, certificateDate);
			certificates.add(certificate);
		}
	}

}
