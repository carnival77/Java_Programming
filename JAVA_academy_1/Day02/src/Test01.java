
public class Test01 {
	public static void main(String[] args) {
		/*
		 * < sysout : ǥ�� ��� >
		 * 1. System.out.println( ����� ������ )
		 *  - ��� �� �������� ���� ħ(�ٹٲ�)
		 *  
		 * 2. System.out.print( ����� ������ )
		 *  - ��� �� �������� ���� �� ħ(�ٹٲ� �ȵ�)
		 * 
		 * 3. System.out.printf( "���Ĺ��ڿ�", ������1, ������2.. )
		 *  - ���Ĺ���( %d, %f, %c, %s ��)�� ����Ͽ� ������ ���
		 *  - �ٹٲ� �ȵ�
		 */
		System.out.println("ABC");
		System.out.println(10 + 20);
		System.out.println("ABC" + 10);
		System.out.println(10 + 20 + "ABC");
		System.out.println("ABC" + 10 + 20); 
		System.out.println(10 + 20 + "ABC" + 10 + 20);
		System.out.println(10 + 20 + "ABC" + (10 + 20));
		// �ܾ�, ���� ���� �ؽ�Ʈ �����ʹ� ""�� ǥ���Ѵ�.
		
		System.out.println("1.ABCDE");
		System.out.print("2.ABCDE");
		System.out.printf("3.%s", "ABCDE");
		System.out.printf("4. %d %c %f %.2f %s", 10, 'a', 1.4, 1.488, "����");
		/*
		 * < ���� ����(format character) >
		 *  1. %d (decimal) : 10���� ���� �������� 
		 *  2. %f (float)   : �Ǽ� �������� 
		 *  3. %c (character) : ���Ϲ���(����1��) ��������
		 *  					** ���Ϲ��ڴ� ''�� ǥ����
		 *  4. %s (string) : ���ڿ�(���� ������) �������� 
		 *  					** ���ڿ��� ""�� ǥ����
		 */
		System.out.printf("\n\n�̸� : %s \n��� : %.2f��", "����ī��", 65.3333);
		// \n : ����
		
	}
}









