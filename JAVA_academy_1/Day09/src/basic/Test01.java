package basic;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * break : �ڽ��� ���� switch, �ݺ���(while, do-while, for)�� ����
		 * 			(�ݺ� ����)
		 * 
		 * continue : �ڽ��� ���� �ݺ��� 3�ι��� �����ִ� ���� ���� �ǳʶ�
		 * 			(�ݺ� ����)
		 * 
		 * return : �ڽ��� ���� �޼��带 ����
		 * 			(���� �޼����� return ==> ���� �޼ҵ� ���� ==> ���α׷� ����)
		 * 
		 */

		System.out.println("< break test >");
		for(int n = 10; n > 0; --n) {
			if(n % 4 == 0) {
				break;
			}
			System.out.println(n);
		}
		
		System.out.println("< continue test >");
		for(int n = 10; n > 0; --n) {
			if(n % 4 == 0) {
				continue;
			}
			System.out.println(n);
		}
		
		System.out.println("< return test >");
		for(int n = 10; n > 0; --n) {
			if(n % 4 == 0) {
				return; // �޼ҵ� ���� ( ���θ޼ҵ� ���� ==> ���α׷� ���� )
			} 
			System.out.println(n);
		}
	}
}



