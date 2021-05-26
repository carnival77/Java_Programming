package day05.basic;
/*
 * < Wrapper Classes (포장클래스) >
 * -> 원시자료형 데이터를 '객체화'할 때 사용하는 클래스들 
 *  Integer, Double, Float, Byte, Character, Boolean
 *  -------                       ---------
 *   int                            char
 *   
 *   자료형 
 *    1. 원시자료형 8가지 
 *    2. 참조자료형 (클래스, 인터페이스, 배열, ..)
 */
public class Test04 {
	public static void main(String[] args) {
		Object[] arr = { 1, 3.14, "ABC", true }; 
		
		// 1 --> new Integer(1) ---> 레퍼런스가 [0]에 저장
		// 3.14 --> new Double(3.14) ---> 레퍼런스가 [1]에 저장
		// ...
		
		System.out.println(arr[0].toString());
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.TYPE);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		/*
		 * < Boxing과 Unboxing >
		 * 1. Boxing : 원시데이터--> 포장클래스로 객체화
		 * 2. Unboxing : 포장객체의 알맹이(value)를 잠깐 꺼내기
		 * 
		 */
		Integer num = new Integer(1);
		Integer num2 = 10; // 10 -> new Integer(10)으로 오토박싱
		
		System.out.println(num + 1); // 2
		
	}
}








