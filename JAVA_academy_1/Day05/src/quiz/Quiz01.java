package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 나이를 입력 받고 
		// 20살 이상이면 "성인입니다" 아니면 "미성년입니다."
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		// 나이가 짝수인지 홀수인지 출력 
		String message;
		message = (age % 2 == 0) ? "짝수" : "홀수";
		System.out.println(message);
		
		// 나이가 11과 4의 공배수인지 출력
		System.out.println( age%11==0 && age%4==0 ? "11과 4의 공배수" : "공배수 아님");
		
		// 국, 영, 수 점수를 입력 받고
		System.out.println("국어 입력..");
		int kr = sc.nextInt();
		
		System.out.println("영어 입력..");
		int en = sc.nextInt();
		
		System.out.println("수학 입력..");
		int ma = sc.nextInt();
		
		double avg = (double)(kr + en + ma) / 3;
		
		// 평균이 60.5 이상이면 "합격", 아니면 "불합격"
		// 61, 61, 60 이면 합격 떠야 함
		System.out.println("평균 : " + avg + "점");
		System.out.println(avg >= 60.5 ? "합격" : "불합격");
	}
}





