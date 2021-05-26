package basic;

public class Test01 {
	public static void main(String[] args) {
		// MyMethod의 greet() 호출 
		// 다른 클래스의 메서드 실행하려면 new로 객체화해야 한다.
		MyMethod m = new MyMethod();
		m.greet("홍길동", 40);
		m.greet("홍길동", 4);
		
	}
}

