package basic;
/*
 * < 객체 지향 프로그래밍 (Object Oriented Programming) >
 * - 객체 ==> 부품
 * - 부품을 미리 만들어 놓은 뒤 필요할 때 조립하여 프로그램을 완성하는 프로그래밍 패러다임
 * - 재사용이 용이 ==> 개발 기간이 짧아진다.
 *   무한한 확장성 ==> 유지 보수/개발기간이 짧아진다.
 *     >> 상속
 *   프로그램 수정이 용이 ==> 유지 보수 기간이 짧다
 *     >> 다형성  
 * - 단점 : 무겁다 ( 확장만 가능하기 때문에 불필요한 기능도 포함된다.) 
 * 
 * < 객체 지향 용어 >
 * 1. 참조( reference )
 * 	-> 인스턴스(=객체)가 위치한 주소
 * 
 * 2. 참조 자료형 ( reference type )
 *  -> 인스턴스의 모양 ( ~~ 모양객체의 주소 )
 *  
 * 3. 클래스 
 * 	-> 설계도
 * 
 * 4. 인스턴스(instance)
 *  -> 객체 (주인공!) 
 *  -> 클래스의 내용을 참고하여 실제 메모리에 할당됨
 *     이곳에 각종 정보를 저장
 *     
 * 5. 객체화
 *  -> 클래스를 사용하영 인스턴스를 생성 ( new 연산자 ) 
 *  
 * 6. 참조변수 ( reference 변수 )
 *  -> 주소를 저장하는 메모장
 *     인스턴스 형태와 상관없이 무조건 4byte 
 *     ( 주소의 길이가 32bit )
 *     
 *  메인메소드 O : 메인클래스
 *  메인메소드 X : 클래스 ( 객체 설계도 )
 */
public class Test01 {
	public static void main(String[] args) {
		// 참조 변수 p1, p2 선언
		Pokemon p1, p2; 
		
		// Pokemon 객체화 + 그 주소를 p1에 저장
		p1 = new Pokemon(); //  () 주의!
		
		// Pokemon 객체화 + 그 주소를 p2에 저장
		p2 = new Pokemon();
		
		p1.name = "피카츄"; 
		p1.hp = 1000;
		p1.level = 10;
		
		p2.name = "라이츄"; 
		p2.hp = 2000;
		p2.level = 20;
		
		p1.greet();
		p2.greet();
		
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.hp);
		System.out.println(p1.level);
		
		
		System.out.println(p2.name);
		System.out.println(p2.hp);
		System.out.println(p2.level);
		
		p1 = p2;
		p2.name = "푸린"; 
		
		System.out.println(p1.name); // 푸린
		System.out.println(p2.name); // 푸린
		
		Pokemon p3 = null; 
		// null : 없다! (객체가 없다) 
		// 참조변수에서 0을 의미
		p3.name = "라이츄"; 
	}
}





