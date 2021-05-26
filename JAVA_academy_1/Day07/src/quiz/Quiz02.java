package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 1. 구구단 5단 출력
		int n = 1;
		while (n <= 9) {
			System.out.println("5 X " + n + " = " + 5 * n);
			++n;
		}

		// 2. 30 + 31 + 32 + 33 + ... + 100 의 결과(4615)출력
		int num = 30;
		int sum = 0;
		while (num <= 100) {
			sum += num++; // sum = sum + num ==> num++
		}
		// while(num <= 100 && (sum += num++) > 0);
		System.out.println("sum : " + sum);

		// 3. 구구단 문제 내고 답을 입력 받아 "정답!" 혹은 "땡.."을 출력
		// 정답이 5번 나올 때까지 반복
		int correct = 0; // 정답 개수 세기용
		int r1 = 0, r2 = 0; // 문제 내기용
		Scanner sc = new Scanner(System.in);

		while (correct < 5) {
			r1 = (int) (Math.random() * 8) + 2;
			r2 = (int) (Math.random() * 9) + 1;
			System.out.println(r1 + " X " + r2 + " = ");
			int userAnswer = sc.nextInt();
			if (userAnswer == r1 * r2) {
				System.out.println("정답!");
				++correct;
			} else {
				System.out.println("땡...");
			}
			System.out.println("현재 정답 수 : " + correct);
		}
		// 4. 500 이하까지 피보나치 수열을 출력하라
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


// ctrl + shift + f : 자동 줄정렬
// ctrl + shift + c : 주석 처리/해제







