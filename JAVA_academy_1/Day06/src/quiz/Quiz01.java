package quiz;

import java.util.Scanner;

public class Quiz01 {
	// Scanner와 Math.random()을 사용하여 
	// 2단 ~ 9단 중 랜덤한 구구단 문제를 1개 내고
	// 정답을 입력 받아 "정답!" 혹은 "땡.." 결과 출력
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in); 
		int n1 = (int)(Math.random() * 8) + 2; // 2 ~ 9
		int n2 = (int)(Math.random() * 9) + 1; // 1 ~ 9
		
		System.out.println(n1 + " X " + n2);
		System.out.print("답 : ");
		
		int answer = sc.nextInt();
		System.out.println( answer == n1*n2 ? "정답!" : "땡.." );*/
		
		// 30% 확률로 "희귀템을 얻었습니다!"
		// 나머지 확률로 "일반템을 얻었습니다.." 둘 중 하나를 출력
		double r = Math.random();
		System.out.println(r);
		System.out.println(r < 0.3 ? "희귀템을 얻었습니다!" : "일반템을 얻었습니다..");
	}
}












