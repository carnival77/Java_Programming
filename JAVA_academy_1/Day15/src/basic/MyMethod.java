package basic;

public class MyMethod {
	// 메인메소드는 다른 클래스에 있으므로 
	// static 생략
	
	void greet(String name, int age) {
		if(age <= 20) {
			System.out.println(name + "(아)야, 안녕?");
		} else {
			System.out.println(name + "님, 안녕하세요!");
		}
	}
}




