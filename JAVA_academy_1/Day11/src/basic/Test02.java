package basic;

public class Test02 {
	public static void main(String[] args) {
		// ���۷���(reference) : �޸��� �ּ�  
		// 1byte �� 1����
		int[][] nums = {
				{1, 2, 3, 4, 5},
				{10, 20},
				{-1, -2, -3}
		};
		
		for(int a = 0;     ;   ) {
			for( int b = 0;    ;   ) {
				System.out.println(nums[a][b]);
			}
		}
		
	}
}










