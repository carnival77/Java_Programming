package quiz;

import java.util.Scanner;

public class BaseBallQuiz {
	public static void main(String[] args) {
		int[] array = new int[3];

		// 랜덤한 3자리수 뽑기
		for (int i = 0; i < 3; ++i) {
			// 1 ~ 9 중 1개 뽑기
			array[i] = (int) (Math.random() * 9) + 1;

			// 뽑은 수가 배열에 있는 지 확인
			for (int j = 0; j < i; ++j) {
				if (array[i] == array[j]) { // 있다면
					--i; // 다시 뽑기 위해 i를 1 감소
					break;
				}
			}
		}

		// 정답 수 만들기 ( 3칸짜리 배열 --> 세자릿수 정수 )
		int correct = (array[0] * 100) + (array[1] * 10) + array[2];

		System.out.println(correct);

		/////////////////////////////////////////////////
		// 사용자에게 입력 받기
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("답 : ");
			int userAnswer = sc.nextInt();
			if (userAnswer == correct) {
				System.out.println("정답!");
				break; // while 종료
			}
			if (userAnswer > 999 || userAnswer < 100) {
				System.out.println("3자리 정수를 입력하세요.");
			} else {
				// 정답이 아니라면
				// 사용자가 입력한 3자리 수를 배열로 만들기
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
