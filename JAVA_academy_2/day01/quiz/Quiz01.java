package day01.quiz;
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
public class Quiz01 {
	public static void main(String[] args) {
		// �����ϰ�(Math.random()) ��ī��, Ǫ��, ���̸� ��ü �� 1���� �����Ͽ�
		// (int)(Math.random() * ����) + ���ۼ�
		// (int)(Math.random() * 3) + 0 ==> 0, 1, 2
		
		// sayHello() ����
		Pokemon p; 
		int rand = (int)(Math.random() * 3);
		if(rand == 0) {
			p = new Pikachu();
		} 
		else if(rand == 1) {
			p = new Purin();
		}
		else { // rand == 2
			p = new Pairi();
		}
		
		p.sayHello();
	}
}






