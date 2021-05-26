package day03.basic;
/*
 * < 추상화(abstract) >
 *  - 클래스 앞에 : 추상클래스 
 *    메서드 앞에 : 추상메서드
 *    
 * < 다형성의 용도 >
 *  1. 배열에 다양한 모양의 객체(레퍼런스)를 넣을 수 있다.
 *  2. 매개변수에 다양한 모양의 객체(레퍼런스)를 넣을 수 있다.
 *    (배열과 매개변수가 부모타입이면.. 모든 자식객체들을 넣을 수 있다.)
 * 
 * 
 * - Pokemon , Shape 등의 부모클래스는 객체가 될 필요가 없었다.
 *   ==> 추상클래스로 선언하면 좋다.
 *   실제로 객체화하여 사용할 것들은 '자식클래스'였다.
 *   
 * - 부모클래스의 메서드 에서... {} 영역이 필요 없더라...
 *   왜? 부모 클래스는 객체화하지 않음 + 자식들이 다 오버라이드를 했음
 *    ==> 부모클래스의 메서드를 '추상메서드'로 선언한다.
 *    
 *      추상메서드 선언 : 
 *      	abstract 접근제어자 리턴자료형 메서드명( 매개변수 선언 );
 *      ( 맨 앞에 abstract , 맨 뒤에 {} 대신 ';' ) 
 * 		주의! 추상메서드는 추상클래스 안에서만 선언 가능!
 * 
 * 		추상클래스 선언 :
 *  		abstract 접근제어자 class 클래스명 { .. }	
 * 	    ( 추상클래스는 추상메서드를 선언할 수 있는 클래스다. )
 */
abstract class Pokemon {
	String name;
	int level;
	abstract void go();
	abstract void attack();
}
class Pairi extends Pokemon {
	// 부모가 추상메서드를 가지고 있다면, 
	// 자식은 반드시 해당 메서드를 오버라이드 해야 한다.
	void go() {
		System.out.println("파이리, 걸어간다~~");
	}
	void attack() {
		System.out.println("파이리, 불꽃 공격!");
	}
}
class Pikachu extends Pokemon {
	void go() {
		System.out.println("피카츄 걸어서 이동~~");
	}
	void attack() {
		System.out.println("피카츄, 백만볼트 공격!!!");
	}
}
class Raichu extends Pokemon {
	void go() {
		System.out.println("라이츄 뛰어서 이동~~");
	}
	void attack() {
		System.out.println("라이츄, 천만볼트 공격!!!");
	}
}
class Purin extends Pokemon {
	void go() {
		System.out.println("푸린 굴러서 이동~~");
	}
	void attack() {
		System.out.println("푸린, 자장가 공격!!!");
	}
}
public class Test01 {
	public static void main(String[] args) {
		Pokemon[] p = { new Pikachu(), new Purin(), new Raichu(), new Pairi() };
		for(Pokemon pok : p) {
			pok.go();
			pok.attack();
		}
		
		Pokemon p2 = new Pokemon() { // 익명클래스
			void go() { 
				System.out.println("냐옹이, 냐옹냐옹 걸어간다");
			}
			void attack() {
				System.out.println("냐옹이, 냥냥펀치!!!");
			}
		};
		p2.go();
		p2.attack();
	}
}



