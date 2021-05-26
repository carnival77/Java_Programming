package basic;

public class Test02 {
	public static void main(String[] args) {
		// 레퍼런스(reference) : 메모리의 주소  
		// 1byte 당 1번지
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










