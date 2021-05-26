package day05.basic;
/*
 * < 다중 상속(extends)과 다중 구현(implements) >
 * 
 * - 클래스의 다중 상속 X 
 * 		class C extends A, B {} ===> 안됨! (다이아몬드 문제-메소드 충돌)
 * 
 *   클래스의 중첩 상속 O
 *      class B extends A {}
 *      class C extends B {} ===> 가능!
 *      
 *   클래스의 다중 구현 O 
 *   	class C implements A, B {} ===> 가능!(단, A, B는 인터페이스)
 *   ======================================================
 *	 
 *	 인터페이스의 다중상속 ===> 가능!
 *
 *   ======================================================
 *   
 *   < 오버라이드 >
 *   - 부모가 물려준 시야(public, protected, private)는 
 *     자식이 넓힐 수는 있지만 좁힐 수는 없다. 
 *     부모클래스 
 *        public void aa(){}
 *        
 *     자식클래스 
 *     	  private void aa(){}  (X)
 */

interface A {
	void aa();
	default void cc() {}
}
interface B {
	void aa();
	void bb();
	//default void cc() {}
}
class C implements A, B{
	public void aa() {}
	public void bb() {}
}

interface D extends A, B{ // 인터페이스는 다중 상속 가능
	
}
public class Test02 {
	public static void main(String[] args) {
		A a = new C();
		B b = new C(); 
	}
}



