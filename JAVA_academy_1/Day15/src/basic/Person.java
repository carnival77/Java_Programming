package basic;

public class Person {
	String name;
	int age;
	
	// 객체는 스스로 행동할 수 있어야 한다.
	// 해당 객체에 관련된 모든 일은 그 클래스 안에 정의되어야 한다.
	void setData(String n, int a){
		name = n;
		age = a;
	}	
	void printData() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

