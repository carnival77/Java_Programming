package quiz;

public class Quiz01 {
	public static void main(String[] args) {
		// 이름, 나이, 연락처, 키(실수)를 저장할 변수 4개 선언
		String name;
		name = "김피카츄";
		
		int age;
		age = 10;
		
		String contact = "010-1111-1111"; 
		// float tall = 110.4f;
		double tall = 110.4; 
		
		// 올바른 값을 저장 후 출력 (println())
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("연락처 : " + contact);
		System.out.println("키 : " + tall + "cm");
	}
}
