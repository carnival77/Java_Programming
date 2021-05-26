package quiz;

import java.util.Scanner;

public class BaseBallQuiz {
	public static void main(String[] args) {
		int[] array = new int[3];

		// ������ 3�ڸ��� �̱�
		for (int i = 0; i < 3; ++i) {
			// 1 ~ 9 �� 1�� �̱�
			array[i] = (int) (Math.random() * 9) + 1;

			// ���� ���� �迭�� �ִ� �� Ȯ��
			for (int j = 0; j < i; ++j) {
				if (array[i] == array[j]) { // �ִٸ�
					--i; // �ٽ� �̱� ���� i�� 1 ����
					break;
				}
			}
		}

		// ���� �� ����� ( 3ĭ¥�� �迭 --> ���ڸ��� ���� )
		int correct = (array[0] * 100) + (array[1] * 10) + array[2];

		System.out.println(correct);

		/////////////////////////////////////////////////
		// ����ڿ��� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�� : ");
			int userAnswer = sc.nextInt();
			if (userAnswer == correct) {
				System.out.println("����!");
				break; // while ����
			}
			if (userAnswer > 999 || userAnswer < 100) {
				System.out.println("3�ڸ� ������ �Է��ϼ���.");
			} else {
				// ������ �ƴ϶��
				// ����ڰ� �Է��� 3�ڸ� ���� �迭�� �����
				int[] user = new int[3];
				for (int i = 0; i < 3; ++i) {
					user[2 - i] = userAnswer % 10;
					userAnswer /= 10;
				}

				int strike = 0;
				int ball = 0;
				for (int i = 0; i < 3; ++i) {
					for (int j = 0; j < 3; ++j) {
						if (user[i] == array[j]) {
							if (i == j) {
								strike++;
							} else {
								ball++;
							}
						}
					}
				}
				System.out.println(strike + "strike, " + ball + "ball");
			}
		}
	}
}
