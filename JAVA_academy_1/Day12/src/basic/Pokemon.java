package basic;

public class Pokemon {
	// 메인메소드 없어야 함!
	// 클래스에 선언된 변수 : 필드 혹은 멤버변수
	String name;
	int level;
	int hp;
	
	// (나중에 배움) 인사하는 메소드
	void greet() {
		System.out.println("안녕하세요! 저는 " + name + "이에요!");
	}
}
