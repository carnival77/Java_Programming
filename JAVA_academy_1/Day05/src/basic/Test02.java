package basic;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * < ��Ʈ������ : ��Ʈ ������ ���� >
		 * ~ : NOT -> 0�� 1�� 1�� 0���� �ٲ� 
		 * ^ : XOR(Exclusive OR) -> �� �� 1���� 1�̾�� 1
		 * >> : ���������� �̵� (���� shift ����)
		 * << : �������� �̵� (���� shift ����)
		 * $ : AND -> �� ���� ��� 1�̾�� 1
		 * | : OR  -> �� �ʸ� 1�̾ 1
		 * >>> : ���� shift����� ����. ��, ���� ĭ�� 0���� ä��
		 * 
		 */
		int a = 3;   //    11
		int b = 21;  // 10101
		System.out.println(a & b);
		System.out.println(a | b); 
		System.out.println(a ^ b);
		System.out.println(~a);
		System.out.println(a >> 2);
		System.out.println(a << 2);
		System.out.println(-5 >> 2); // �� �տ� 1��Ʈ(��ȣ��Ʈ)�� �״�� ����
		System.out.println(-5 >>> 2); // ��ȣ��Ʈ�� 0���� ä������
		
		// < ����ȯ ������ (=ĳ���� ������) >
		// �����͸� �ӽ������� ������ �� ���
		// �ڵ�����ȯ : ��ǻ�Ͱ� �ڵ����� ����
		// ��������ȯ : �����ڰ� '����ȯ ������'�� ����ϴ� ��
		
		// ���� : (�ڷ���)
		System.out.println( (char)65 );
		System.out.println( (double)'A' );
		
		//int n1 = 3.0;
		double n1 = 3; // 3�� 3.0���� �ڵ�����ȯ
		// �����Ͱ� �սǵ� �� ���� ���� �ڵ�����ȯ ������
		
		System.out.println( (int)3.99999999 ); 
		// �ݿø� ������
		
		// < ���ǿ����� >
		// ���� :  ���ǽ� ? True�� ��� ��ȯ�� : False�� ��� ��ȯ��
		int i1 = 10;
		int i2 = 20;
		System.out.println("ū �� : " + ( i1 > i2 ? i1 : i2 ) );
		
	}
}








