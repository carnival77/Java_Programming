package day04.basic;
/*
 * - java.lang 패키지
 * 		: 자바 개발에 필수로 사용되는 클래스들이 들어있음
 * 		: String, System, Object, Integer, Double, ...
 * 		: 자동으로 import가 됨
 * 
 *   java.util 패키지
 * 		: 사용하면 편리한 클래스들
 *   
 *   java.text 패키지
 *   	: text 처리 관련 클래스들
 *   
 *   java.io
 *   	: 입/출력 스트림 ( 파일 저장/읽기 )
 *   
 *   java.awt
 *   javax.swing
 *    	: GUI 프로그래밍
 *   
 *   java.net 
 *   	: 통신 관련
 *   
 */
class Pokemon { // extends Object
	
}
public class Test01 {
	public static void main(String[] args) {
		// Object 클래스 
		// 모든 클래스의 root 클래스 
		// => 모든 클래스(우리가 만든 클래스 포함)는 자동으로 Object를 상속 받게 되어있다.
		// => Object 변수는 모든 객체를 다 소화할 수 있다.
		
		Object o1 = new Pokemon();
		Object o2 = 1;
		Object o3 = 3.14;
		Object o4 = "ㅋㅋㅋㅋㅋ";
		Object o5 = new int[] { 1, 2, 3, 4, 5};
		
	}
}













