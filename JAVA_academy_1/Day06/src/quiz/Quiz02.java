package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// ���� 1���� �Է� �ް� ���� ���
		// 90 �̻� : A
		// 80 �̻� 90 �̸� : B
		// 70 ~ 80 : C
		// 60 ~ 70 : D
		// 60 �̸� : F
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else if(score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		// ��� �Է� ���� ������ 2, 3, 5 ����� �� �Ǻ�
		// 6 --> 2�� ��� 3�� ���
		// 93 --> 3�� ���
		// 71 --> 2, 3, 5�� ��� ��� �ƴ�
		if( score % 2 == 0) {
			System.out.println("2�� ���");
		}
		if( score % 3 == 0) {
			System.out.println("3�� ���");
		}
		if( score % 5 == 0) {
			System.out.println("5�� ���");
		}
		if( score % 2 != 0 && score % 3 != 0 && score % 5 != 0) {
			System.out.println("2, 3, 5�� ��� ��� �ƴ�");
		}
	}
}






