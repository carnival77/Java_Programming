package basic;
/*
 * < 메서드 오버라이드(Override) >
 * 
 * ** 오버로드 : 메소드 여러 개 만들기
 * 
 * ** 오버라이드 : 메소드 재정의
 *  -> 부모가 물려준 메서드를 자식이 덮어쓰는 것
 *  	물려받은 메서드의 원형은 그대로 냅두고 
 *      몸통({})만 수정하는 것
 *  -> 목적 : 메서드의 이름 통일
 *           다형성
 *           
 * < 상속의 목적 2가지 >
 * 1. 확장 : 개발기간을 줄이기 위함
 * 2. 그룹화 : 하나의 카테고리로 묶어버림
 *  Book -> ComicBook, NovelBook, TextBook
 *  Item -> Portion -> RedPortion
 *  				-> BluePortion
 *  	 -> Shoes -> LeatherShoes
 *  			  -> SpeedShoes
 */
class Pokemon {
	int hp;
	int ap;
	void greet() {
		System.out.println("포켓몬이 인사합니다.");
	}
}
class Pikachu extends Pokemon{
	String master = "지우";
	void greet() {
		System.out.println("피까 피까??");
	}
}
class Ggobuki extends Pokemon {
	String skill = "물대포 공격";
	void greet() {
		System.out.println("꼬북 꼬북~~");
	}
}
public class Test03 {
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon();
		Pikachu p2 = new Pikachu();
		Ggobuki p3 = new Ggobuki();
		p1.greet();
		p2.greet();
		p3.greet();
	}
}



