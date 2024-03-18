package Bai5_OOP;

public class GoodStudent extends SinhVien {
	private double gpa;
	private String bestRewardName;

	public GoodStudent() {
		super();
	}

	public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
			String gradeLevel, double gpa, String bestRewardName) {
		super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
		this.gpa = gpa;
		this.bestRewardName = bestRewardName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa() {
		while (true) {
			try {
				System.out.println("Nhap GPA:");
				double Gpa = sc.nextDouble();
				if (Gpa >= 7 && Gpa <= 10) {
					this.gpa = Gpa;
					break; 
				} else {
					System.out.println("GPA phai >= 7 va <= 10. Hay thu lai.");
				}
			} catch (Exception e) {
				System.out.println("GPA phai >= 7 va <= 10. Hay thu lai.");
				sc.nextLine();
			}
		}
	}

	public String getBestRewardName() {
		return bestRewardName;
	}

	public void setBestRewardName(String bestRewardName) {
		this.bestRewardName = bestRewardName;
	}

	@Override
	public void ShowMyInfor() {
		System.out.println("Sinh vien kha gioi: ");
		System.out.println("Ho va ten: " + getFullName());
		System.out.println("Ngay sinh: " + getDoB());
		System.out.println("Gioi tinh: " + getSex());
		System.out.println("So dien thoai: " + getPhoneNumber());
		System.out.println("Truong dai hoc: " + getUniversityName());
		System.out.println("Xep loai tot nghiep: " + getGradeLevel());
		System.out.println("GPA: " + getGpa());
		System.out.println("Giai thuong cao nhat dat duoc: " + getBestRewardName());
	}

	@Override
	public void input() {
		super.input();
		setGpa();
		sc.nextLine();
		System.out.println("Giai thuong cao nhat:");
		bestRewardName = sc.nextLine();
	}

	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
