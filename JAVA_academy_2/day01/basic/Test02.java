package day01.basic;
/*
 * 1. upcasting : ���� ����ȯ   
 *    => �ڽ� ��ü�� �θ����·� ����ȯ 
 *    => �ڵ�����ȯ ����
 *    Pokemon p = new Pikachu();
 *                -------------
 *                �ڵ����� Pokemon������ ��ȯ ==> ��ĳ����
 * 
 * 2. downcasting : �Ʒ��� ����ȯ 
 *    => �θ����·� �����Ǿ��� �ڽİ�ü�� ���� ������� ���ƿ�
 *    => �ڵ�����ȯ �Ұ���
 *    (Pikachu)p
 *    
 */
class Pokemon {
	void sayHello() {
		System.out.println("���ϸ��� ���Ѵ�~");
	}
}

class Purin extends Pokemon {
	void sayHello() {
		System.out.println("ǪǪ~~��~��");
	}
}
class Pairi extends Pokemon {
	void sayHello() {
		System.out.println("����~����~~~~");
	}
}

class Pikachu extends Pokemon { 
	String master = "����"; 
	void sayHello() {
		System.out.println("��ī��ī!!");
	}
}
public class Test02 {
	public static void main(String[] args) {
		
		Pokemon pp = new Pikachu();
		pp.sayHello();
		System.out.println( ((Pikachu)pp).master );
		
		
		Pokemon p;
		p = new Pikachu();
		p.sayHello(); // ��ī��ó�� �ൿ��
		
		p = (Pokemon)new Purin();
		p.sayHello(); // Ǫ��ó�� �ൿ��
		
		p = (Pokemon)new Pairi();
		p.sayHello(); // ���̸�ó�� �ൿ��
		// �θ� ���������� ��� �ڽ� ��ü�� ��ȭ�� �� �ִ�!
		// ����! �θ��� ���������� �ڽ��� ��ü�� ����� ���
		//      �θ� ������ ���(����/�޼���)�� �������̵�� �޼��常 �ν� ����
		//      ===> �ڽ��� ������ ������ �ִ� ����� �ν� �Ұ�
	}
}










