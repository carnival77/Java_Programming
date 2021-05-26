package basic;

public class Test01 {
	public static void main(String[] args) {
		// do - while
		int n = 1; 
		do {
			System.out.println(n);
			++n;
		} while(n <= 10);
		
		while(n == -1) { // 1회차부터 false가 나옴
			System.out.println("while문 실행됨?");
		}
		
		do {
			System.out.println("do-while문 실행됨?");
		} while(n == -1);
		// do-while은 조건식 참/거짓 여부 상관없이 
		// 최소 1회는 무조건 실행
	}
}








