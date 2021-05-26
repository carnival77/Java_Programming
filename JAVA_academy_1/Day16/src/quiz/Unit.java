package quiz;

public class Unit {
	// 필드 : 이름, 공격력(ap), 체력(hp)
	String name;
	int ap;
	int hp;
	
	// 메서드 
	// 1. 생성자 : Unit() 기본 생성자 
	//           Unit("전투기") --> 공격력은 10 ~ 20 중 랜덤, 체력은 공격력의 1.5배
	//								(20%의 확률로 체력은 공격력의 2배)
	// 			 Unit("전투기", 10) --> 이름과 공격력에 각각 저장,
	//									(단, 음수가 들어오면 0을 대신 저장)  
	// 									체력은 공격력의 1.5배(20% 확률로 2배)
	//			 Unit("전투기", 10, 20) --> 이름, 공격력, 체력에 각각 저장
	//									(단, 음수가 들어오면 0을 대신 저장)
	Unit(){}
	Unit(String s){
		name = s;
		ap = (int)(Math.random() * 11) + 10; 
		setHp();
	}
	Unit(String n, int a){
		name = n;
		ap = a > 0 ? a : 0; 
		setHp();
	}
	Unit(String n, int a, int h){
		name = n;
		ap = a > 0 ? a : 0;
		hp = h > 0 ? h : 0;
	}
	
	void setHp() {
		hp = (int)(Math.random() < 0.2 ? ap * 2 : ap * 1.5);
	}
	
	// 2. printAll() : 모든 정보(이름, ap, hp)를 출력
	void printAll() {
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + ap);
		System.out.println("체력 : " + hp);
	}
	
	
	// Quiz01 클래스 --> Unit 3칸짜리 배열을 만들고 생성자 테스트 
}




