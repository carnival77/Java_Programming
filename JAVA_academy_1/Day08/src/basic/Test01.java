package basic;

public class Test01 {
	public static void main(String[] args) {
		// do - while
		int n = 1; 
		do {
			System.out.println(n);
			++n;
		} while(n <= 10);
		
		while(n == -1) { // 1ȸ������ false�� ����
			System.out.println("while�� �����?");
		}
		
		do {
			System.out.println("do-while�� �����?");
		} while(n == -1);
		// do-while�� ���ǽ� ��/���� ���� ������� 
		// �ּ� 1ȸ�� ������ ����
	}
}








