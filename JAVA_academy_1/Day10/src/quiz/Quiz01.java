package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 1. double형 4칸짜리 배열 만들기 
		// ==> Scanner로 실수 4개 입력 받아서 각 칸에 저장
		double[] dArr = new double[4];
					//= { 0, 0, 0, 0 };
		Scanner sc = new Scanner(System.in); 
		
//		for(double d1 : dArr) {
//			d1 = sc.nextDouble();
//		}
		
		for(int i = 0; i < dArr.length; ++i) {
			dArr[i] = sc.nextDouble();
		}
		for(double d : dArr) {
			System.out.println(d);
		}
		
		
		
		// 2. 입력 받은 실수 중 가장 큰 수 출력
		double max = dArr[0];
		for(int i = 1; i < dArr.length; ++i) {
			if(max < dArr[i]) {
				max = dArr[i];
			}
		}
		System.out.println("최댓값 : " + max);
		
		// 3. 
		char[] chs = "Hello, Java!! ^~^".toCharArray();
		//      { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'J', ..};
		// 문자열.toCharArray() ===> char형 배열로!
		
		// chs의 모든 대문자를 소문자로 변경
		System.out.println(chs); // Hello, Java!! ^~^
		
		for(int i = 0; i < chs.length; ++i) {
			if(chs[i] >= 'A' && chs[i] <= 'Z') {
				chs[i] += 32;
			}
		}
		
		System.out.println(chs); // hello, java!! ^~^
		
		// 4. 학생 6명의 국어점수를 입력 받고, 
		// 모두 출력, 총점, 평균 점수를 출력
		int[] kr = new int[6];
		int total = 0;
		for(int i = 0; i < 6; ++i) {
			System.out.print((i + 1) + "번 학생 국어 : ");
			kr[i] = sc.nextInt();
			total += kr[i];
		}
		
		for(int k : kr) {
			System.out.println(k + "점");
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + ((double)total/ kr.length));
	}
}









