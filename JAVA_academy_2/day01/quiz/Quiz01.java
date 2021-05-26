package day01.quiz;
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
public class Quiz01 {
	public static void main(String[] args) {
		// 랜덤하게(Math.random()) 피카츄, 푸린, 파이리 객체 중 1개를 생성하여
		// (int)(Math.random() * 개수) + 시작수
		// (int)(Math.random() * 3) + 0 ==> 0, 1, 2
		
		// sayHello() 실행
		Pokemon p; 
		int rand = (int)(Math.random() * 3);
		if(rand == 0) {
			p = new Pikachu();
		} 
		else if(rand == 1) {
			p = new Purin();
		}
		else { // rand == 2
			p = new Pairi();
		}
		
		p.sayHello();
	}
}






