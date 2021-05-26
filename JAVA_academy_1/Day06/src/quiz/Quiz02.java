package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 점수 1개를 입력 받고 학점 출력
		// 90 이상 : A
		// 80 이상 90 미만 : B
		// 70 ~ 80 : C
		// 60 ~ 70 : D
		// 60 미만 : F
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
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
		
		// 방금 입력 받은 점수가 2, 3, 5 배수인 지 판별
		// 6 --> 2의 배수 3의 배수
		// 93 --> 3의 배수
		// 71 --> 2, 3, 5의 배수 모두 아님
		if( score % 2 == 0) {
			System.out.println("2의 배수");
		}
		if( score % 3 == 0) {
			System.out.println("3의 배수");
		}
		if( score % 5 == 0) {
			System.out.println("5의 배수");
		}
		if( score % 2 != 0 && score % 3 != 0 && score % 5 != 0) {
			System.out.println("2, 3, 5의 배수 모두 아님");
		}
	}
}






