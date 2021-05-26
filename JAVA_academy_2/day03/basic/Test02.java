package day03.basic;

class Mouse implements Hardware { // Hardware ����Ŭ����
	@Override
	public void connect() {
		System.out.println("���콺 ����Ǿ���");
	}
	@Override
	public void run() {
		System.out.println("���콺 �����Ͱ� �����δ�..");
	}
}
class Monitor implements Hardware {
	public void connect() {
		System.out.println("����� ���� ����");
	}
	public void run() {
		System.out.println("�ְ� : " + MAX_PRICE);
		System.out.println("ȭ�� ������!");
	}
}
public class Test02 {
	public static void main(String[] args) {
		Hardware h1, h2;
		h1 = new Mouse();
		h2 = new Monitor();
		
		h1.connect();
		h2.connect();
		
		h1.run();
		h2.run();
		
		Hardware h3 = new Hardware() {
			
			@Override
			public void run() {
				System.out.println("������");
			}
			
			@Override
			public void connect() {
				System.out.println("������");
			}
		};
		h3.connect();
		h3.info();
		System.out.println("��ġ ������ : " + Hardware.MIN_PRICE);
		System.out.println("��ġ �ְ� : " + Hardware.MAX_PRICE);
		Hardware.showPolicy();
	}
}


