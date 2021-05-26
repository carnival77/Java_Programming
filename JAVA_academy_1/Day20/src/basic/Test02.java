package basic;
/*
 * super : 내 안의 부모객체의 레퍼런스
 *   -> 부모가 물려준
 *   
 * this : 이 객체의 레퍼런스
 * 
 */
class Parent2 {
	String a = "Parent2의 멤버변수 a";
	void bb() {}
}
class Child2 extends Parent2 {
	String a = "Child2의 멤버변수 a";
	void aa() {
		super.bb(); // 물려받은 멤버를 호출때는 자동으로 'super.' 이 붙음
		String a = "aa() 지역변수 a";
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		// 멤버명이 중복될 경우 우선순위
		// 1. 지역변수
		// 2. 멤버변수
		// 3. 물려받은 멤버변수
	}
}
public class Test02 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.aa();
		System.out.println(c.a); // Child2의 멤버변수 a
		// System.out.println(c.super.a);
		System.out.println(   ((Parent2)c).a   );
	}
}





