package basic;

//import basic2.Book;
import basic2.*; // basic2의 모든 클래스(*)

/*
 * < 패키지 > 
 * - 클래스들이 들어있는 디렉토리
 * - all 소문자로 표기 
 * - 클래스 중복을 방지
 * - 모든 클래스는 소속 패키지가 있어야 한다.
 * 
 *  --> basic.Test01
 *  	basic.Person
 *  	java.lang.String
 *  
 * < 접근제어자 / 접근제한자 (access modifiers) >
 * 
 * 					다른패키지		같은패키지 다른클래스		클래스내부
 * 1. public  			O			O					O
 * 2. protected			X(자식은O)	O					O
 * 3. 					X			O					O
 * 4. private 			X			X					O
 * 
 *  1. public 
 *  	- 모두가 접근 가능
 *  	- 클래스, 메소드, 멤버변수 
 *  2. protected 
 *  	- 자식클래스를 제외한 외부 패키지의 클래스는 접근 불가 
 *  	- 같은 패키지의 클래스들은 접근 가능 
 *  	- 메소드, 멤버변수
 *  3. 
 *  	- default 접근제어자 혹은 package 접근제어자 
 *  	- 같은 패키지 안에서만 접근 가능
 *  	- 클래스, 메소드, 멤버변수
 *  4. private 
 *  	- 클래스 내부에서만 사용가능
 *  	- 다른 클래스에게 안보여줌!
 *  	- 메소드, 멤버변수
 *  
 *  ************************ 중요! ************************
 *  멤버변수(필드)는 private 으로 선언하고 
 *  그들의 getter, setter를 만든다.
 *  ******************************************************
 */
public class Test02 {
	public static void main(java.lang.String[] args) {
	//	Book bk1 = new Book(); 
	//   다른 패키지의 클래스를 사용하는 방법 2가지
	// 방법 1. 패키지 전체이름 쓰기
		basic2.Book bk1 = new basic2.Book();
		
	// 방법 2. import 선언
		Book bk2 = new Book();
		bk2.title = "자바의 정석"; 
		// The field Book.title is not visible
		
	}
}








