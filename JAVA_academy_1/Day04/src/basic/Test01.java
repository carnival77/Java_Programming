package basic;

public class Test01 {
	public static void main(String[] args) {
		// 산술연산자 : + , - , * , / , %
		
		// / : 정수 / 정수 ==> 정수만 나옴
		
		// 10 / 4 ==> 2.5 (X)  2
		
		// 둘 중 1개가 실수면 소숫점까지 나옴
		// 10 / 4.0
		
		System.out.println(10/4);
		System.out.println(10/4.0);
		
		// % : mod (나머지 연산자)
		//   : 나머지를 반환 
		System.out.println(10 % 4); // 2
		System.out.println(10 % 3); // 1
		// 용도 : 짝/홀수 판별, 배수판별 
		//      수건돌리기 같은 회전 0 -> 1 -> 2 -> 0 -> 1 -> 2
		//      암호화 알고리즘
		
		// 대입연산자 : = += -= %= *= /= 등
		// a += b  --> a = a + b
		
		int a = 10;
		int b = 20;
		
		int score = 0;
		score += 10; // score = score + 10;
		System.out.println("점수 : " + score);
		score += 10; // score = score + 10;
		System.out.println("점수 : " + score);
		score += 10; // score = score + 10;
		System.out.println("점수 : " + score);
		
		// 증감연산자 : ++ -- 
		// a++, ++a : a += 1 
		// a--, --a : a -= 1
		
		a = 100;
		++a; // a++;
		System.out.println("a: " + a);
		a--; // --a; 
		System.out.println("a: " + a);
		
		/*
		 * < 전위연산 vs 후위연산 >
		 * 증감연산자가 변수 
		 *  앞에 있으면 : 전위연산 (=전치연산)
		 *  뒤에 있으면 : 후위연산 (=후치연산)
		 *  
		 * 차이 : 한 명령에 (...;) 여러 연산이 들어있을 경우 
		 *       전치 -> 자신을 먼저 증/감한 후, 나머지 연산들을 수행
		 *       후치 -> 나머지 연산들을 먼저 실행 후, 마지막에 자신을 증/감
		 */
		a = 10;
		//int c = ++a;   // c: 11
		int c = a++;      // c: 10
		System.out.println("c : " + c);
		System.out.println("a : " + a);
		
		int num = 10;
		System.out.println(++num); // 증가 후 출력
		System.out.println(num++); // 출력 후 증가
		System.out.println(++num); // 증가 후 출력
		System.out.println(num);  
		
		// 비교연산자 (=관계연산자) : >, >=, <, <=, ==, != 
		// == : 같다 
		// != : 다르다
		// 결과값 : boolean형 (True 혹은 False)
		boolean bool = a == 13; 
		System.out.println(bool);
		
		System.out.println(10 % 3 >= 10 % 4);
		
		
		// 논리 연산자 : && || !
		// && : 논리 AND (논리곱) : 양쪽 식(값)이 모두 true여야 최종 true 
		// || : 논리 OR (논리합)  : 양쪽 식 중 1개라도 true면 최종 true
		// !  : 논리 NOT (논리부정) : 식이 true면 false, false면 true
		int d = 10*2;
		System.out.println( 10 >= 20 && 10*2 == 20 );
		System.out.println( 10 >= 20 || d == 20 );
		System.out.println( !(10 >= 20) );
		
		
		
	}
}












