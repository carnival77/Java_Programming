package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// Quiz01�� ���� �ؼ� 
		// ���� 1�� �Է¹ޱ�
		Scanner sc = new Scanner(System.in); 
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		
		// �� ���� Ȧ�� ���� ��� 
		// System.out.println("Ȧ�� ? " + num % 2 == 1 );
		System.out.println("Ȧ�� ? " + (num % 2 == 1) );
		System.out.println("�Է� �� : " + num);
	}
}



