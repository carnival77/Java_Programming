package basic;

public class Test03 {
	public static void main(String[] args) {
		// Math.random() 을 사용하여 랜덤값 생성
		// 1 미만의 임의 실수를 돌려줌
		System.out.println(Math.random());
		
		double dRandom = Math.random();
		System.out.println(dRandom);
		
		// 0 ~ 9 중 랜덤하게 
		System.out.println( (int)(Math.random() * 10) );
		
		// 1 ~ 10 중 랜덤하게
		System.out.println( (int)(Math.random() * 10)+1 );
		
		// 2 ~ 9 중 랜덤
		System.out.println( (int)(Math.random() * 8) + 2 );
		
		// (int)(Math.random() * 개수 ) + 시작수 
		
		// 주사위(1 ~ 6)
		System.out.println( (int)(Math.random() * 6) + 1 );
		
	}
}








