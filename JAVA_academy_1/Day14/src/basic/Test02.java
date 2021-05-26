package basic;
/*
 * < method 정의 >
 * - 메서드 만들기
 * - 클래스 안에 작성 
 *   메서드 안에 메서드를 정의하면 안됨
 *    void aa(){
 *    	void bb(){
 *    
 *    	}  (X)
 *    } 
 * - 형식 
 *   (static) 리턴자료형 메서드명 (매개변수 선언) {
 *   	// 메서드의 바디 작성
 *   	return 리턴값;
 *   } 
 * 
 *  1) 리턴자료형 : 리턴값의 자료형
 *  2) 메서드명 : 맨 앞 글자 소문자 추천
 *  3) return 
 *  	ㄱ. 함수(메서드)를 종료하라
 *  	ㄴ. 호출된 코드 자리로 돌아가라
 *  	ㄷ. (리턴값이 있다면,) 리턴값을 호출된 자리에 반환하라
 *  4) 리턴값 : 메서드의 실행 결과물
 *  	있을 수도 있고 없을 수도 있음
 *   	단, 없을 경우 리턴자료형은 void ( void : 자료형이 없다는 의미의 자료형 )
 *  5) 매개변수 : 인자값(재료가 되는 값)이 들어가는 통로 역할의 변수
 *  	() 안에 선언한다. (생략가능)
 * =================================================================
 * < 메서드 호출 >
 *  : 메서드 실행 
 *  ** 메서드는 만들었다고 해서 무조건 실행되는 것은 아님 
 *    ---> '호출'을 해야 그제서야 실행됨!
 *  
 *  : 형식 
 *     메서드명( 인자값 ) 
 *     
 *     ** 인자값 (데이터) 과 매개변수 (변수)는 자료형, 개수가 일치해야 함
 */
public class Test02 {
	
	// main 메소드와 같은 클래스에 메서드 정의할 때는 
	// 맨 앞에 static을 붙이자.
	
	static void sayHello() {
		System.out.println("ㅎㅇㅎㅇ");
		return;
	}
	
	static void sayHello2(String name) {
		System.out.println(name + "님 안녕하세여");
	}
	
	static int rect(int b, int h) {
		int area = b * h;
		return area;
	}
	
	public static void main(String[] args) {
		sayHello();
		sayHello();
		sayHello();
		
		sayHello2("피카츄"); 
		sayHello2("라이츄");
		
		System.out.println(rect(10, 20));
		int rectArea = rect(100, 200); 
		System.out.println(rectArea);
		return;
	}
}



