package quiz;

public class Quiz01 {
	public static void main(String[] args) {
		// 1. 1000 ~ 1 �� Ȧ�� ��� 
		//   999 997 995 .... 1
//		for(int n = 1000; n > 0; --n) {
//			if(n %2 != 0) {
//				System.out.println(n);
//			}
//		}
//		for(int n = 999; n > 0; n -= 2) {
//			System.out.println(n);
//		}
		
		
		// 2. 187 ~ 1000 �� 11�� 17�� ������� ���
//		for(int n = 187; n <= 1000; ++n) {
//			if(n % 11 == 0 && n % 17 == 0) {
//				System.out.println("11�� 17�� ����� : " + n);
//			}
//		}
		for(int n = 187; n <= 1000; n += 11*17) {
			System.out.println(n);
		}
		
		
		// 3. �̹� �� �޷� ��� 
		System.out.print("��\t��\tȭ\t��\t��\t��\t��\n\t\t\t\t\t");
		for(int d = 1; d <= 28; ++d) {
			System.out.print(d + "\t");
			if(d % 7 == 2) {
				System.out.println();
			}
		}
		System.out.println();
		// 4. ������ 2�� ~ 19�� ���� ���
		for(int dan = 2; dan <= 19; ++dan) {
			
			System.out.println("< " + dan + "�� >");
			
			for(int n = 1; n <= 9; ++n) {
				System.out.println(dan + " X " + n + " = " + dan*n);
			}
			
		}
		
	}
}






