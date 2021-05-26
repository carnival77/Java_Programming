package basic;

import javax.swing.JOptionPane;

/*
 * < static >
 * - 정적인, 고정된
 * - 1. 무조건 만들어진다. (new 없이 사용할 수 있다.)
 * 		: 클래스 로드 시 만들어진다. 
 * 			** 클래스 로드란? ==> 프로그램에 필요한 클래스들을 RAM에 복사하는 것 
 * 				(클래스 로드가 끝나면 main()이 시작됨)
 * 		: static으로 선언된 변수/메소드는 프로그램 실행 전에 만들어진다.
 * 
 * 	 2. 1개만 만들어진다. (객체가 100개여도 static 멤버는 1개만 있다)
 * 	 3. '클래스명.멤버명'으로 접근한다.
 * 				-----
 * 				static일 경우
 */
class MyMath {
	static double getCircleArea(int r) {
		return r * r * 3.14;
	}
}
public class Test03 {
	public static void main(String[] args) {
		//MyMath mm = new MyMath();	
		//System.out.println(mm.getCircleArea(10));
		
		// getCircleArea()를 static으로 선언하면 new를 안해도됨
		System.out.println(MyMath.getCircleArea(10));
		
		Math.random();
		JOptionPane.showMessageDialog(null, "ㅋㅋ");
		Integer.parseInt("10");
		// 위에 있는 random(), showM..(), parseInt(), out이 static으로 선언되어있음
		// ==> new 없이 사용할 수 있었던 이유
	}
}







