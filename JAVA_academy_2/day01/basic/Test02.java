package day01.basic;
/*
 * 1. upcasting : 위로 형변환   
 *    => 자식 객체가 부모형태로 형변환 
 *    => 자동형변환 가능
 *    Pokemon p = new Pikachu();
 *                -------------
 *                자동으로 Pokemon형으로 변환 ==> 업캐스팅
 * 
 * 2. downcasting : 아래로 형변환 
 *    => 부모형태로 지정되었던 자식객체가 원래 모습으로 돌아옴
 *    => 자동형변환 불가능
 *    (Pikachu)p
 *    
 */
class Pokemon {
	void sayHello() {
		System.out.println("포켓몬이 말한당~");
	}
}

class Purin extends Pokemon {
	void sayHello() {
		System.out.println("푸푸~~우~린");
	}
}
class Pairi extends Pokemon {
	void sayHello() {
		System.out.println("파이~파이~~~~");
	}
}

class Pikachu extends Pokemon { 
	String master = "지우"; 
	void sayHello() {
		System.out.println("피카피카!!");
	}
}
public class Test02 {
	public static void main(String[] args) {
		
		Pokemon pp = new Pikachu();
		pp.sayHello();
		System.out.println( ((Pikachu)pp).master );
		
		
		Pokemon p;
		p = new Pikachu();
		p.sayHello(); // 피카츄처럼 행동함
		
		p = (Pokemon)new Purin();
		p.sayHello(); // 푸린처럼 행동함
		
		p = (Pokemon)new Pairi();
		p.sayHello(); // 파이리처럼 행동함
		// 부모 참조변수는 모든 자식 객체를 소화할 수 있다!
		// 주의! 부모형 참조변수에 자식형 객체가 저장된 경우
		//      부모가 물려준 멤버(변수/메서드)와 오버라이드된 메서드만 인식 가능
		//      ===> 자식이 고유로 가지고 있는 멤버는 인식 불가
	}
}










