package basic;
/*
 * ����) �θ�����ڿ� �⺻�����ڰ� ���� ���
 *  �ڽ�Ŭ������ �����ڸ� �������� ������ ������ ����. 
 *  �ذ���1. �θ�Ŭ������ �⺻�����ڸ� ���� �����Ѵ�.
 *  �ذ���2. �ڽ�Ŭ������ �����ڸ� �����ϵ�, super()�� �θ�Ŭ������ �����ڰ� �� ����ǵ��� ���ڰ��� ������ �ִ´�.
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
		super("����");
	}
}

public class Test01 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("Child ��ü�� a : " + c.a);
		System.out.println("Child ��ü�� b : " + c.b);
	}
}






