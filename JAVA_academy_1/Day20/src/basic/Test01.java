package basic;
/*
 * 주의) 부모생성자에 기본생성자가 없을 경우
 *  자식클래스에 생성자를 정의하지 않으면 에러가 난다. 
 *  해결방법1. 부모클래스에 기본생성자를 직접 정의한다.
 *  해결방법2. 자식클래스에 생성자를 정의하되, super()에 부모클래스의 생성자가 잘 실행되도록 인자값을 적절히 넣는다.
 * 
 */
class Parent {
	String a;
	Parent(String a){
		this.a = a;
	}
}
class Child extends Parent {
	String b;
	Child(){
		super("없음");
	}
}

public class Test01 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("Child 객체의 a : " + c.a);
		System.out.println("Child 객체의 b : " + c.b);
	}
}






