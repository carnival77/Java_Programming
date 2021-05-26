package basic;

public class Test01 {
	
	public static void main(String[] args) {
		
	
		String[] names = {"피카츄", "라이츄", "파이리", "푸린" };
		String[] names2 = new String[4];
		String[] names3 = new String[] {"피카츄", "라이츄", "파이리", "푸린" };
	
		System.out.println(names2[0]);
		System.out.println(names2[1]);
		System.out.println(names2[2]);
		System.out.println(names2[3]);
		
		int[] nums = new int[3]; 
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		boolean[] bools = new boolean[3];
		System.out.println(bools[0]);
		System.out.println(bools[1]);
		System.out.println(bools[2]);
		// 원소가 없는 배열은 null, 0, false로 자동 초기화!
		
		for(int i = 0; i < names.length; ++i) {
			System.out.println(names[i]);
		}
//		System.out.println(names[4]);
		
		for(String s: names ) {
			System.out.println(s);
		}
		/*
		 * < 확장된 for문(extended for) >
		 * 형식 : 
		 *  for( 임시변수 선언    : 배열명   ){
		 *  	// 임시변수를 사용하여 반복할 문장들
		 *  }
		 *  
		 * 처리 : 해당 배열의 모든 원소를 한 번 씩 임시변수에 대입(복사)
		 *       (복사 + 종속문장 실행)을 반복
		 */
		
		char[] chs = {'P', 'o','K', 'E','m', 'o', 'N'};
		for(char c: chs) {
			// chs의 모든 문자를 출력 (단, 소문자는 대문자로 출력)
			// 'a' 이상 'z' 이하
			// 97 이상 122 이하
			if(c >= 'a' && c <= 'z') {
				System.out.println( (char)(c - 32) );
			} else {
				System.out.println(c);
			}
		}
	}
}




