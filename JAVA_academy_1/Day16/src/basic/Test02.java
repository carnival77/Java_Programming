package basic;

import java.util.Scanner;

/*
 * < 생성자 (constructor) >
 * - new Person();
 *       --------
 *       생성자를 호출
 * - 객체를 생성할 때 호출하는 특수 메서드
 *   객체 1개당 1번만 호출 가능
 *   new 와 함께 사용됨
 * - 형식) 
 * 		클래스명(){
 * 
 *      }
 * - 주의) 
 * 	1. 생성자는 클래스 이름과 동일해야 함
 *  2. 리턴자료형이 없음
 */

class Pokemon {
	String name;
	int level;
	int hp;
	Pokemon(){
		System.out.println("포켓몬 생성 완료!");
	}
	/*
	 * < 기본 생성자 > 
	 * - 생성자가 정의되지 않았을 경우 자동으로 정의되는 생성자 
	 * - 형식 : 
	 *  	public 클래스명(){
	 *  
	 *  	}
	 * - 개발자가 직접 생성자를 만들었다면, 기본생성자는 만들어지지 않는다.
	 */
	
	Pokemon(String n){ // 이름만 넣었을 때를 대비한 생성자
		name = n;
	}
	Pokemon(String n, int lv){ // 이름, 레벨
		name = n;
		level = lv;
	}
	Pokemon(String n, int lv, int h){ // 이름, 레벨, 체력
		name = n;
		level = lv;
		hp = h;
	}

	void printPokemon() {
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
	}
}
public class Test02 {
	public static void main(String[] args) {
		Pokemon p = new Pokemon();
		Pokemon p2 = new Pokemon("피카츄"); 
		Pokemon p3 = new Pokemon("라이츄", 10); 
		Pokemon p4 = new Pokemon("푸린", 12, 10000); 
		p.printPokemon();
		p2.printPokemon();
		p3.printPokemon();
		p4.printPokemon();
	}
}






