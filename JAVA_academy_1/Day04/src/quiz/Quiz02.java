package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// Quiz01을 참고 해서 
		// 정수 1개 입력받기
		Scanner sc = new Scanner(System.in); 
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		
		// 그 수가 홀수 인지 출력 
		// System.out.println("홀수 ? " + num % 2 == 1 );
		System.out.println("홀수 ? " + (num % 2 == 1) );
		System.out.println("입력 값 : " + num);
	}
}



