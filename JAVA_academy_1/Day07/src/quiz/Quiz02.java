package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 1. ������ 5�� ���
		int n = 1;
		while (n <= 9) {
			System.out.println("5 X " + n + " = " + 5 * n);
			++n;
		}

		// 2. 30 + 31 + 32 + 33 + ... + 100 �� ���(4615)���
		int num = 30;
		int sum = 0;
		while (num <= 100) {
			sum += num++; // sum = sum + num ==> num++
		}
		// while(num <= 100 && (sum += num++) > 0);
		System.out.println("sum : " + sum);

		// 3. ������ ���� ���� ���� �Է� �޾� "����!" Ȥ�� "��.."�� ���
		// ������ 5�� ���� ������ �ݺ�
		int correct = 0; // ���� ���� �����
		int r1 = 0, r2 = 0; // ���� �����
		Scanner sc = new Scanner(System.in);

		while (correct < 5) {
			r1 = (int) (Math.random() * 8) + 2;
			r2 = (int) (Math.random() * 9) + 1;
			System.out.println(r1 + " X " + r2 + " = ");
			int userAnswer = sc.nextInt();
			if (userAnswer == r1 * r2) {
				System.out.println("����!");
				++correct;
			} else {
				System.out.println("��...");
			}
			System.out.println("���� ���� �� : " + correct);
		}
		// 4. 500 ���ϱ��� �Ǻ���ġ ������ ����϶�
		int a = 1;
		int b = 1;
		int c;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		while(a + b <= 500) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}
}


// ctrl + shift + f : �ڵ� ������
// ctrl + shift + c : �ּ� ó��/����







