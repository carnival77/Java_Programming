package quiz;

class Student {
	private String name;
	private int kr, en, ma;
	private double avg;
	private boolean pass;
	private char grade;

	// 1. ������ (������ ������� ���� �� �����)
	public Student() {}
	public Student(String n) {
		//name = n;
		//setName(n);
		this(n, 0,0,0);
	}
	public Student(int kr, int en, int ma) {
//		setKr(kr);
//		setEn(en); 
//		setMa(ma);
//		setAvg();
//		setPass();
//		setGrade();
		this(null, kr, en, ma);
	}
	public Student(String name, int kr, int en, int ma) {
		setName(name);
		setKr(kr);
		setEn(en); 
		setMa(ma);
		setAvg();
		setPass();
		setGrade();
	}
	
	// 2. getters (���Ŀ� �°�)
	public String getName() {return name;}

	public int getKr() { return this.kr; }

	public int getEn() { return this.en; }

	public int getMa() { return this.ma; }

	public double getAvg() { return avg;}

	public boolean isPass() {return pass;}

	public char getGrade() {return grade;}

	// 3. setters (��Ḧ ������ �˿��� ���� �ùٸ� �����͸� ��)
	// 0) name : �̸�
	// 1) kr, en, ma : 0 �� �̻� 100�� ���ϸ� ���� ����, �� �� 0��
	// 2) avg : (���ڰ� ���� �ʰ�, kr, en, ma�� ������ ���ǵ���)
	// 3) pass : 60�� �̻��̸� true
	// 4) grade : ABCDF �� 1����
	public void setName(String n) {
		name = n;
	}

	public void setKr(int k) {
		kr = k > 0 && k <= 100 ? k : 0;
		setAvg();
	}

	public void setEn(int e) {
		en = e > 0 && e <= 100 ? e : 0;
		setAvg();
	}

	public void setMa(int m) {
		ma = m > 0 && m <= 100 ? m : 0;
		setAvg();
	}

	private void setAvg() {
		avg = (kr + en + ma) / 3.0;
		setPass();
		setGrade();
	}

	private void setPass() {
		pass = avg >= 60;
	}

	private void setGrade() {
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		// Student �׽�Ʈ (�������)
		Student st =new Student("����ī��", 88, 90, -91);
		System.out.println("�̸� : " + st.getName());
		System.out.println("���� : " + st.getKr());
		System.out.println("���� : " + st.getEn());
		System.out.println("���� : " + st.getMa());
		System.out.println("�հݿ��� : " + st.isPass());
		System.out.println("���� : " + st.getGrade());
		System.out.println("��� : " + st.getAvg());
		
		st.setMa(91);
		System.out.println("�̸� : " + st.getName());
		System.out.println("���� : " + st.getKr());
		System.out.println("���� : " + st.getEn());
		System.out.println("���� : " + st.getMa());
		System.out.println("�հݿ��� : " + st.isPass());
		System.out.println("���� : " + st.getGrade());
		System.out.println("��� : " + st.getAvg());
		
		st.setKr(10);
		System.out.println("�̸� : " + st.getName());
		System.out.println("���� : " + st.getKr());
		System.out.println("���� : " + st.getEn());
		System.out.println("���� : " + st.getMa());
		System.out.println("�հݿ��� : " + st.isPass());
		System.out.println("���� : " + st.getGrade());
		System.out.println("��� : " + st.getAvg());
	}
}










