package quiz;

public class Student {
	// 이름, 국, 영, 수, 평균, 학점(String) 필드 선언
	String name;
	int kr, en, ma;
	double avg;
	String grade;
	
	void printData() {
		System.out.println("이름 : " + name);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);
	}
}







