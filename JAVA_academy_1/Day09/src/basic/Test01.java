package basic;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * break : 자신이 속한 switch, 반복문(while, do-while, for)을 종료
		 * 			(반복 종료)
		 * 
		 * continue : 자신이 속한 반복문 3인방의 남아있는 종속 문장 건너뜀
		 * 			(반복 유지)
		 * 
		 * return : 자신이 속한 메서드를 종료
		 * 			(메인 메서드의 return ==> 메인 메소드 종료 ==> 프로그램 종료)
		 * 
		 */

		System.out.println("< break test >");
		for(int n = 10; n > 0; --n) {
			if(n % 4 == 0) {
				break;
			}
			System.out.println(n);
		}
		
		System.out.println("< continue test >");
		for(int n = 10; n > 0; --n) {
			if(n % 4 == 0) {
				continue;
			}
			System.out.println(n);
		}
		
		System.out.println("< return test >");
		for(int n = 10; n > 0; --n) {
			if(n % 4 == 0) {
				return; // 메소드 종료 ( 메인메소드 종료 ==> 프로그램 종료 )
			} 
			System.out.println(n);
		}
	}
}



