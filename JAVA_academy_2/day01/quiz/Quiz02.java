package day01.quiz;

/*
 * < Sniper VS Tank >
 * - 저격수, 탱크 두 캐릭터 중 아무거나 랜덤하게 2개 생성 (Math.random() 사용)
 *   (탱크 vs 탱크, 저 vs 탱, 저 vs 저)
 * - 두 객체가 서로 죽을 때까지 서로 공격을 반복
 * - 첫번째, 혹은 두번째 플레이어가 이겼는지 마지막 승자 출력! 
 *  e.g. 플레이어1(탱크)의 승리!
 */
class Unit { // 부모 클래스
	String name;
	int hp, att; // 체력, 공격력
	boolean alive; // true:아직 살아있음 (선택사항)
	
	public void attack(Unit enemy) {
		// 내용 필요 없음
	}
}

class Sniper extends Unit { // 자식 클래스
	// 객체 생성되면, 자동으로 name은 "저격수", hp는 400, att는 100
	Sniper(){
		name = "저격수"; 
		hp = 400;
		att = 100;
		alive = true;
	}
	// attack 오버라이드 
	// 1. 10% 확률로 헤드샷 (상대 즉사)
	// 2. 나머지 확률로 평타(일반 공격, 상대 hp를 100만큼 깎는다.)
	@Override
	public void attack(Unit enemy) {
		if( Math.random() < 0.1 ) {
			System.out.println("헤드샷!!! 상대 즉사!");
			enemy.hp = 0;
		} else {
			enemy.hp -= 100;
			System.out.println("일반 공격.. 상대 " + enemy.name + 
										"의 남은 체력 : " + enemy.hp);
		}
		if(enemy.hp <= 0) {
			System.out.println("상대를 물리쳤다!!");
			enemy.alive = false;
		}
	}
}

class Tank extends Unit {
	// 객체 생성되면, 자동으로 name은 "탱크", hp는 4000, att는 50
	Tank(){
		name = "탱크"; 
		hp = 4000;
		att = 50;
		alive = true;
	}
	// attack 오버라이드 
	// 1. 30% 확률로 상대의 hp 30% 감소
	// 2. 나머지 확률로 평타(일반 공격, 상대 hp를 50만큼 깎는다.)
	@Override
	public void attack(Unit enemy) {
		if( Math.random() < 0.3 ) {
			System.out.println("상대 체력 30% 감소!");
			//enemy.hp = (int)(enemy.hp * 0.7);
			enemy.hp *= 0.7;
		} else {
			enemy.hp -= 100;
			System.out.println("일반 공격.. 상대 " + enemy.name + 
										"의 남은 체력 : " + enemy.hp);
		}
		if(enemy.hp <= 0) {
			System.out.println("상대를 물리쳤다!!");
			enemy.alive = false;
		}
	}
}
public class Quiz02 {
	
	public static void main(String[] args) {
		// 두 타입의 객체를 랜덤하게 2개 생성
		// 무한 반복문을 사용하여 둘 중 하나가 죽을 때까지 서로를 공격
		// 단, 죽은 객체가 공격하면 안됨
		Unit u1 = (Math.random() > 0.5) ? new Tank() : new Sniper();
		Unit u2 = (Math.random() > 0.5) ? new Tank() : new Sniper();
		
		System.out.println("u1 : " + u1.getClass().getSimpleName());
		System.out.println("u2 : " + u2.getClass().getSimpleName());
		
		System.out.println("=========== GAME START ============");
		while(u1.alive && u2.alive) {
			if(u1.alive) {
				System.out.print("u1 : ");
				u1.attack(u2); 
			}
			if(u2.alive) {
				System.out.print("u2 : ");
				u2.attack(u1);
			}
		}
		
		
		if(u1.alive) {
			System.out.println("u1 승리!");
		} else {
			System.out.println("u2 승리!");
		}
	}
}









