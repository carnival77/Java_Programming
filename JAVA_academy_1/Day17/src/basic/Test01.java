package basic;
/*
 * < this >
 * - 이 객체의 레퍼런스 
 *   나, 저 같은 의미
 * - 객체의 멤버메서드가 실행될 때 '자동으로 들어가는 0번 인자'
 * 
 * - this() 
 *   ==> this 생성자
 *   ==> 생성자 내부에 다른 생성자를 호출
 */
class Pokemon {
	String name;
	int level;
	Pokemon(String name, int level){
		this.name = name;
		this.level = level;
	}
	void print(){
		System.out.println("이름 : " + this.name); // this.name 
		System.out.println("레벨 : " + level); // this.level
		// 메소드 안에 '멤버변수'를 지칭할 때는 앞에 자동으로 'this.'이 붙는다.
		aa(); // this.aa();
		// 멤버메소드도 마찬가지임
	}
	
	void aa() {
		
	}
}


public class Test01 {

}
