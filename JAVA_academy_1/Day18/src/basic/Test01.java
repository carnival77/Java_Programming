package basic;
/*
 * < final >
 * - ������, ������ �� ����
 * - ������� �տ� : �� ���� �Ұ�
 *   �������� �տ� : �� ���� �Ұ� 
 *   Ŭ���� �տ�  : ��� �Ұ�
 *   �޼ҵ� �տ�  : �������̵� �Ұ� (�����ε�ʹ� �������)
 */

class MyMath{
	 final double pi = 3.14;
	//final double pi; // ����! final �ʵ�� �ݵ�� ���� �� �ʱ�ȭ �ؾ� ��
	 
	 /*
	  * < ����� ���� ��� : public static final >
	  * - public : ��� ���� ����
	  *   static : 1���� ���� (+ ������ ����)
	  *   final : �� ���� �Ұ�
	  * - ���α׷��� ���Ǵ� ������
	  */
	 public static final double GOLDEN_RATIO = 1.618;
}

public class Test01 {
	public static void main(String[] args) {
		final int a;
		a = 10;
		//a = 20; // ����! 
		
		MyMath mm = new MyMath();
		System.out.println(mm.pi);
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(MyMath.GOLDEN_RATIO);
	}
}



