package basic;
/*
 * super : �� ���� �θ�ü�� ���۷���
 *   -> �θ� ������
 *   
 * this : �� ��ü�� ���۷���
 * 
 */
class Parent2 {
	String a = "Parent2�� ������� a";
	void bb() {}
}
class Child2 extends Parent2 {
	String a = "Child2�� ������� a";
	void aa() {
		super.bb(); // �������� ����� ȣ�⶧�� �ڵ����� 'super.' �� ����
		String a = "aa() �������� a";
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		// ������� �ߺ��� ��� �켱����
		// 1. ��������
		// 2. �������
		// 3. �������� �������
	}
}
public class Test02 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.aa();
		System.out.println(c.a); // Child2�� ������� a
		// System.out.println(c.super.a);
		System.out.println(   ((Parent2)c).a   );
	}
}





