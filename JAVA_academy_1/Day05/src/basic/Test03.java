package basic;

public class Test03 {
	public static void main(String[] args) {
		// Math.random() �� ����Ͽ� ������ ����
		// 1 �̸��� ���� �Ǽ��� ������
		System.out.println(Math.random());
		
		double dRandom = Math.random();
		System.out.println(dRandom);
		
		// 0 ~ 9 �� �����ϰ� 
		System.out.println( (int)(Math.random() * 10) );
		
		// 1 ~ 10 �� �����ϰ�
		System.out.println( (int)(Math.random() * 10)+1 );
		
		// 2 ~ 9 �� ����
		System.out.println( (int)(Math.random() * 8) + 2 );
		
		// (int)(Math.random() * ���� ) + ���ۼ� 
		
		// �ֻ���(1 ~ 6)
		System.out.println( (int)(Math.random() * 6) + 1 );
		
	}
}








