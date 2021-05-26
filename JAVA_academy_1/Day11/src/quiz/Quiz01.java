package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		int[][] nums = {
				{1,   2, 	3, 	 4},   // [0]��
				{5,   6, 	7, 	 8},   // [1]��
				{9,	  10,	11,	 12},  // [2]��
				{13,  14,	15,	 16}   // [3]��
			//  [0]��   [1]��  [2]��  [3]��	
		};
		
		// 1. 15�� ���
		System.out.println(nums[3][2]);
		
		// 2. [1]���� ��� ���� 5,6,7,8 �� ���
		for(int i = 0; i < nums[1].length; ++i) {
			System.out.print(nums[1][i] + "\t");	
		}
		System.out.println();
		
		// 3. �ݺ����� ����Ͽ� 1 ~ 16 ��� ���
		System.out.println("--- ���� 3 ---");
		for(int j = 0; j < nums.length; ++j) {
			for(int i = 0; i < nums[j].length; ++i) {
				System.out.print(nums[j][i] + "\t");	
			}
			System.out.println();
		}
		// 4. ���ι������� ���
		System.out.println("--- ���� 4 ---");
		for(int j = 0; j < nums.length; ++j) {
			for(int i = 0; i < nums[j].length; ++i) {
				System.out.print(nums[i][j] + "\t");	
			}
			System.out.println();
		}
		// 5. ���� ����, ���� ������ �Է� �ް� �ش� ������ �迭�� ������ �� 
		//    �� ĭ�� 1, 2, 3, 4, ... ���Ҹ� ����
		//    �� �������� ����
		// ��) ��:3  ��:5
		//		1	2	3	4	5
		// 		10	9	8	7	6
		//		11	12	13	14	15
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int row = sc.nextInt();
		System.out.print("�� : ");
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
		
		// ������ �׸��� (��, ��, �� �Է� �ް�, 1���� ����)
	}
}





