package basic;
/*
 * < final >
 * - 최후의, 변경할 수 없는
 * - 멤버변수 앞에 : 값 변경 불가
 *   지역변수 앞에 : 값 변경 불가 
 *   클래스 앞에  : 상속 불가
 *   메소드 앞에  : 오버라이드 불가 (오버로드와는 관계없음)
 */

class MyMath{
	 final double pi = 3.14;
	//final double pi; // 에러! final 필드는 반드시 선언 및 초기화 해야 함
	 
	 /*
	  * < 사용자 정의 상수 : public static final >
	  * - public : 모두 접근 가능
	  *   static : 1개만 생성 (+ 무조건 생성)
	  *   final : 값 변경 불가
	  * - 프로그램에 사용되는 고정값
	  */
	 public static final double GOLDEN_RATIO = 1.618;
}

public class Test01 {
	public static void main(String[] args) {
		final int a;
		a = 10;
		//a = 20; // 에러! 
		
		MyMath mm = new MyMath();
		System.out.println(mm.pi);
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(MyMath.GOLDEN_RATIO);
	}
}



