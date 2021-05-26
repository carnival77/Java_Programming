package basic;
/*
 * 자식 클래스가 객체화 될 때, 부모모양의 객체가 먼저 만들어진 후 자식의 고유 필드가 생성된다.
 * 	--> new 자식생성자() ======> 1) (자동으로) 부모생성자() 실행 =====> 2) 자식 필드 생성
 * 
 */
class Parent {
	
}

class Child extends Parent {
	 // 자식클래스에 자동으로 생성되는 생성자 모양
	public Child() {
		super(); // <---- 부모생성자 호출
	}
}
public class Test02 {

}
