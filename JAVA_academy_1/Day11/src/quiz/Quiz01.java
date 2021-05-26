package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		int[][] nums = {
				{1,   2, 	3, 	 4},   // [0]행
				{5,   6, 	7, 	 8},   // [1]행
				{9,	  10,	11,	 12},  // [2]행
				{13,  14,	15,	 16}   // [3]행
			//  [0]열   [1]열  [2]열  [3]열	
		};
		
		// 1. 15를 출력
		System.out.println(nums[3][2]);
		
		// 2. [1]행의 모든 원소 5,6,7,8 을 출력
		for(int i = 0; i < nums[1].length; ++i) {
			System.out.print(nums[1][i] + "\t");	
		}
		System.out.println();
		
		// 3. 반복문을 사용하여 1 ~ 16 모두 출력
		System.out.println("--- 문제 3 ---");
		for(int j = 0; j < nums.length; ++j) {
			for(int i = 0; i < nums[j].length; ++i) {
				System.out.print(nums[j][i] + "\t");	
			}
			System.out.println();
		}
		// 4. 세로방향으로 출력
		System.out.println("--- 문제 4 ---");
		for(int j = 0; j < nums.length; ++j) {
			for(int i = 0; i < nums[j].length; ++i) {
				System.out.print(nums[i][j] + "\t");	
			}
			System.out.println();
		}
		// 5. 행의 개수, 열의 개수를 입력 받고 해당 이차원 배열을 생성한 후 
		//    각 칸에 1, 2, 3, 4, ... 원소를 저장
		//    ㄹ 방향으로 저장
		// 예) 행:3  열:5
		//		1	2	3	4	5
		// 		10	9	8	7	6
		//		11	12	13	14	15
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int row = sc.nextInt();
		System.out.print("열 : ");
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		int data = 1;
		for(int a = 0 ; a < row; ++a) {
			if(a % 2 == 0) {
				for(int b = 0; b < col; ++b) {
					arr[a][b] = data++;
				}
			}
			else {
				for(int b = 0; b < col; ++b) {
					arr[a][col-b-1] = data++;
				}
			}
		}
		
		for(int a = 0 ; a < row; ++a) {
			for(int b = 0; b < col; ++b) {
				System.out.print(arr[a][b] + "\t");
			}
			System.out.println();
		}
		
		// 달팽이 그리기 (단, 행, 열 입력 받고, 1부터 시작)
	}
}





