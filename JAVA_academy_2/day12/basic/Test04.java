package day12.basic;

public class Test04 {
	public static void main(String[] args) {
		MyThread3 th = new MyThread3();
		th.start();
		
		try {
			th.join(3000); // 3000�и��� ���� main�����带 �Ͻ�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th.interrupt();
		System.out.println("���ξ����� ����!!");
		
		Object o = 1;
	}
}
