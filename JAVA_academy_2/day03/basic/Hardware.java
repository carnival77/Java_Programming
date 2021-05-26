package day03.basic;

/*
 * < 인터페이스 형식 >
 * (public) interface 인터페이스명 {
 * 		// 사용자 정의 상수 (public static final)
 * 		// 추상메서드, static 메서드, default 메서드를 선언한다.
 *		// 일반메서드나 변수는 선언할 수 없다.  
 * }
 * 
 */
public interface Hardware {
	/*public static final*/int MAX_PRICE = 1000000;
	int MIN_PRICE = 2000;
	/*public abstract*/void run();
	void connect();
	
	default void info() { // Hardward의 자식 클래스는 
						  // info()를 오버라이드를 해도 되고 안해도 됨
		System.out.println("이것은 하드웨어입니다.");
	}
	
	static void showPolicy() {
		System.out.println("최고가는 " + MAX_PRICE +"원이며,");
		System.out.println("최저가는 " + MIN_PRICE + "원입니다.");
	}
}





