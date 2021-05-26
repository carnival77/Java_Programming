package basic;

public class Test01 {
	public static void main(String[] args) {
		// 이차원배열 (배열 X 배열)
		String[][] s = new String[3][2];
		
		s[0][0] = "가나다";
		s[0][1] = "라마바";
		
		s[1][0] = "ABC"; 
		s[1][1] = "DEF"; 
		
		s[2][0] = "ㅋㅋㅋ";
		s[2][1] = "ㅎㅎㅎㅎ";
		
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[0][0]);
		System.out.println(s[0][1]);
		System.out.println(s[1][0]);
		System.out.println(s[1][1]);
		System.out.println(s[2][0]);
		System.out.println(s[2][1]);
		
		int[][] arr = { {1,2,3,4}, {1,2,3,4}, {1,2,3,4} };
		/*
		 * < 이차원 배열 >
		 *  - 행 X 열 구조로 배치된 면 형태의 배열
		 *  - 선언방법 : 
		 *     자료형[][] 배열명 = 이차원배열
		 *     				 = new 자료형[행의 개수][열의 개수];
		 *     				 = { {배열1}, {배열2}, {배열3}, ... };
		 *  - 행(row) : 가로줄 
		 *    열(column) : 세로줄
		 */
	}
}








