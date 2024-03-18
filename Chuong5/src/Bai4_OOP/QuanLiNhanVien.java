package Bai4_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiNhanVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();

		System.out.println("Nhap so luong nhan vien: ");
		int numEmployees = sc.nextInt();
		while (numEmployees <= 0) {
			System.out.println("So luong nhap phai lon hon 0! Hay thu nhap lai!");
			numEmployees = sc.nextInt();
		}
		int choice;
		for (int i = 0; i < numEmployees; i++) {
			do {
				System.out.println("Chon nhap thong tin nhan vien (0 - experience, 1 - fresher, 2 - intern): ");
				choice = sc.nextInt();
				sc.nextLine();

				if (choice < 0 || choice > 2) {
					System.out.println("Nhap thong tin khong hop le, hay chon (0 - 1 - 2): ");
					continue;
				}
				if (choice == 0) {
					System.out.println("Nhap thong tin nhan vien experience: ");
				} else if (choice == 1) {
					System.out.println("Nhap thong tin nhan vien fresher: ");
				} else if (choice == 2) {
					System.out.println("Nhap thong tin nhan vien intern: ");
				}

				Employee employee = null;
				System.out.println("Nhap ID: ");
				String iD = sc.nextLine();
				System.out.println("Nhap ho va ten: ");
				String fullName = sc.nextLine();
				System.out.println("Nhap ngay sinh: ");
				String birthDay = sc.nextLine();
				System.out.println("Nhap so dien thoai: ");
				String phone = sc.nextLine();
				System.out.println("Nhap email: ");
				String email = sc.nextLine();

				switch (choice) {
				case 0:
					System.out.println("Nhap so nam kinh nghiem: ");
					int ExpInYear = sc.nextInt();
					sc.nextLine();

					System.out.println("Nhap ky nang chuyen mon: ");
					String ProSkill = sc.nextLine();
					employee = new Experience(iD, fullName, birthDay, phone, email, ExpInYear, ProSkill);
					employee.inputCertificates(sc);
					break;
				case 1:
					System.out.println("Nhap ngay tot nghiep: ");
					String Graduation_date = sc.nextLine();
					System.out.println("Nhap xep loai tot nghiep: ");
					String Graduation_rank = sc.nextLine();
					System.out.println("Nhap truong tot nghiep: ");
					String Education = sc.nextLine();
					employee = new Fresher(iD, fullName, birthDay, phone, email, Graduation_date, Graduation_rank,
							Education);
					employee.inputCertificates(sc);
					break;
				case 2:
					System.out.println("Nhap chuyen nganh: ");
					String Majors = sc.nextLine();
					System.out.println("Nhap hoc ky: ");
					String Semester = sc.nextLine();
					System.out.println("Nhap ten truong: ");
					String University_name = sc.nextLine();
					employee = new Intern(iD, fullName, birthDay, phone, email, Majors, Semester, University_name);
					employee.inputCertificates(sc);
					break;
				default:
					System.out.println("Loai nhan vien khong hop le.");
					break;
				}
				if (employee != null) {
					System.out.println("Da nhap thong tin nhan vien!");
					employees.add(employee);
					employee.setEmployee_count(numEmployees);
					System.out.println("====================");
				}

			} while (choice < 0 || choice > 2);
		}

		ArrayList<Intern> allInterns = findAllInterns(employees);
		System.out.println("Danh sách nhân viên Intern:");
		for (Intern i : allInterns) {
			i.ShowInfo();
			System.out.println("====================");
		}

		ArrayList<Fresher> allFreshers = findAllFreshers(employees);
		System.out.println("Danh sách nhân viên Fresher:");
		for (Fresher f : allFreshers) {
			f.ShowInfo();
			System.out.println("====================");
		}

		ArrayList<Experience> allExperiences = findAllExperiences(employees);
		System.out.println("Danh sách nhân viên Experience:");
		for (Experience e : allExperiences) {
			e.ShowInfo();
			System.out.println("====================");
		}

		System.out.println("Danh sach tat ca nhan vien:");
		for (Employee emp : employees) {
			emp.ShowInfo();
			System.out.println("====================");
		}
	}

	public static ArrayList<Experience> findAllExperiences(ArrayList<Employee> employees) {
		ArrayList<Experience> experiences = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee instanceof Experience) {
				experiences.add((Experience) employee);
			}
		}
		return experiences;
	}

	public static ArrayList<Fresher> findAllFreshers(ArrayList<Employee> employees) {
		ArrayList<Fresher> freshers = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee instanceof Fresher) {
				freshers.add((Fresher) employee);
			}
		}
		return freshers;
	}

	public static ArrayList<Intern> findAllInterns(ArrayList<Employee> employees) {
		ArrayList<Intern> interns = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee instanceof Intern) {
				interns.add((Intern) employee);
			}
		}
		return interns;
	}
}