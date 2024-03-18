package Bai5_OOP;

public class NormalStudent extends SinhVien {
	private int englishScore;
	private double entryTestScore;

	public NormalStudent() {
		super();
	}

	public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
			String gradeLevel, int englishScore, double entryTestScore) {
		super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
		this.englishScore = englishScore;
		this.entryTestScore = entryTestScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore() {

		while (true) {
			try {
				System.out.println("Nhap diem TOEIC: ");
				int englishScore = sc.nextInt();
				if (englishScore >= 0 && englishScore <= 990) {
					this.englishScore = englishScore;
					break;
				} else {
					System.out.println("Diem toeic phai >= 0 hoac <= 990!");
				}
			} catch (Exception e) {
				System.out.println("Diem toeic phai >= 0 hoac <= 990!");
				sc.nextLine();
			}
		}
	}

	public double getEntryTestScore() {
		return entryTestScore;
	}

	public void setEntryTestScore() {

		while (true) {
			try {
				System.out.println("Nhap diem dau vao: ");
				double entryScore = sc.nextDouble();
				if (entryScore >= 0 || entryScore <= 10) {
					this.entryTestScore = entryScore;
					break;
				}

				else {
					System.out.println("Diem dau vao phai >= 0 hoac <= 10! Hay nhap lai.");
				}
			} catch (Exception e) {
				System.out.println("Diem toeic phai >= 0 hoac <= 10! Hay nhap lai.");
				sc.nextLine();
			}
		}
		super.setEnglishScore(englishScore);
	}

	@Override
	public void ShowMyInfor() {
		System.out.println("Sinh vien trung binh:");
		System.out.println("Ho va ten: " + getFullName());
		System.out.println("Ngay sinh: " + getDoB());
		System.out.println("Gioi tinh: " + getSex());
		System.out.println("So dien thoai: " + getPhoneNumber());
		System.out.println("Truong dai hoc: " + getUniversityName());
		System.out.println("Xep loai tot nghiep: " + getGradeLevel());
		System.out.println("Diem TOEIC: " + getEnglishScore());
		System.out.println("Diem dau vao: " + getEntryTestScore());
	}

	@Override
	public void input() {
		super.input();
		setEnglishScore();
		sc.nextLine();
		setEntryTestScore();
		sc.nextLine();
	}

	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
