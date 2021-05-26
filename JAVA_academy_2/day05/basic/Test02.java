package day05.basic;
/*
 * < ���� ���(extends)�� ���� ����(implements) >
 * 
 * - Ŭ������ ���� ��� X 
 * 		class C extends A, B {} ===> �ȵ�! (���̾Ƹ�� ����-�޼ҵ� �浹)
 * 
 *   Ŭ������ ��ø ��� O
 *      class B extends A {}
 *      class C extends B {} ===> ����!
 *      
 *   Ŭ������ ���� ���� O 
 *   	class C implements A, B {} ===> ����!(��, A, B�� �������̽�)
 *   ======================================================
 *	 
 *	 �������̽��� ���߻�� ===> ����!
 *
 *   ======================================================
 *   
 *   < �������̵� >
 *   - �θ� ������ �þ�(public, protected, private)�� 
 *     �ڽ��� ���� ���� ������ ���� ���� ����. 
 *     �θ�Ŭ���� 
 *        public void aa(){}
 *        
 *     �ڽ�Ŭ���� 
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

interface D extends A, B{ // �������̽��� ���� ��� ����
	
}
public class Test02 {
	public static void main(String[] args) {
		A a = new C();
		B b = new C(); 
	}
}



