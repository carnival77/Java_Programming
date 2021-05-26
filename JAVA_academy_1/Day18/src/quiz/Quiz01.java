package quiz;

class Student {
	private String name;
	private int kr, en, ma;
	private double avg;
	private boolean pass;
	private char grade;

	// 1. 생성자 (여러분 마음대로 여러 개 만들기)
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
	
	// 2. getters (형식에 맞게)
	public String getName() {return name;}

	public int getKr() { return this.kr; }

	public int getEn() { return this.en; }

	public int getMa() { return this.ma; }

	public double getAvg() { return avg;}

	public boolean isPass() {return pass;}

	public char getGrade() {return grade;}

	// 3. setters (재료를 넣으면 검열을 거쳐 올바른 데이터만 들어감)
	// 0) name : 이름
	// 1) kr, en, ma : 0 점 이상 100점 이하만 저장 가능, 그 외 0점
	// 2) avg : (인자값 받지 않고, kr, en, ma만 가지고 계산되도록)
	// 3) pass : 60점 이상이면 true
	// 4) grade : ABCDF 중 1개로
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
		// Student 테스트 (마음대로)
		Student st =new Student("김피카츄", 88, 90, -91);
		System.out.println("이름 : " + st.getName());
		System.out.println("국어 : " + st.getKr());
		System.out.println("영어 : " + st.getEn());
		System.out.println("수학 : " + st.getMa());
		System.out.println("합격여부 : " + st.isPass());
		System.out.println("학점 : " + st.getGrade());
		System.out.println("평균 : " + st.getAvg());
		
		st.setMa(91);
		System.out.println("이름 : " + st.getName());
		System.out.println("국어 : " + st.getKr());
		System.out.println("영어 : " + st.getEn());
		System.out.println("수학 : " + st.getMa());
		System.out.println("합격여부 : " + st.isPass());
		System.out.println("학점 : " + st.getGrade());
		System.out.println("평균 : " + st.getAvg());
		
		st.setKr(10);
		System.out.println("이름 : " + st.getName());
		System.out.println("국어 : " + st.getKr());
		System.out.println("영어 : " + st.getEn());
		System.out.println("수학 : " + st.getMa());
		System.out.println("합격여부 : " + st.isPass());
		System.out.println("학점 : " + st.getGrade());
		System.out.println("평균 : " + st.getAvg());
	}
}










