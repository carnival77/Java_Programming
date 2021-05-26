package quiz;

public class Quiz02 {
	public static void main(String[] args) {
		Student s1, s2, s3;
		s1 = new Student();
		s1.setStudent("홍길동", 100, 80, 90);
		s1.printStudent(); // 모든 정보 출력
		s1.showStudentDialog();
		
	}
}
