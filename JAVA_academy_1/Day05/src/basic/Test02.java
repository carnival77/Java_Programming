package basic;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * < 비트연산자 : 비트 단위로 연산 >
		 * ~ : NOT -> 0은 1로 1은 0으로 바꿈 
		 * ^ : XOR(Exclusive OR) -> 양 쪽 1개만 1이어야 1
		 * >> : 오른쪽으로 이동 (우측 shift 연산)
		 * << : 왼쪽으로 이동 (좌측 shift 연산)
		 * $ : AND -> 양 쪽이 모두 1이어야 1
		 * | : OR  -> 한 쪽만 1이어도 1
		 * >>> : 우측 shift연산과 같음. 단, 남은 칸은 0으로 채움
		 * 
		 */
		int a = 3;   //    11
		int b = 21;  // 10101
		System.out.println(a & b);
		System.out.println(a | b); 
		System.out.println(a ^ b);
		System.out.println(~a);
		System.out.println(a >> 2);
		System.out.println(a << 2);
		System.out.println(-5 >> 2); // 맨 앞에 1비트(부호비트)는 그대로 냅둠
		System.out.println(-5 >>> 2); // 부호비트도 0으로 채워버림
		
		// < 형변환 연산자 (=캐스팅 연산자) >
		// 데이터를 임시적으로 변경할 때 사용
		// 자동형변환 : 컴퓨터가 자동으로 해줌
		// 강제형변환 : 개발자가 '형변환 연산자'를 사용하는 것
		
		// 형식 : (자료형)
		System.out.println( (char)65 );
		System.out.println( (double)'A' );
		
		//int n1 = 3.0;
		double n1 = 3; // 3을 3.0으로 자동형변환
		// 데이터가 손실될 것 같을 때는 자동형변환 안해줌
		
		System.out.println( (int)3.99999999 ); 
		// 반올림 안해줌
		
		// < 조건연산자 >
		// 형식 :  조건식 ? True일 경우 반환값 : False일 경우 반환값
		int i1 = 10;
		int i2 = 20;
		System.out.println("큰 수 : " + ( i1 > i2 ? i1 : i2 ) );
		
	}
}








