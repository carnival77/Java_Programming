
public class Test01 {
	public static void main(String[] args) {
		/*
		 * < sysout : 표준 출력 >
		 * 1. System.out.println( 출력할 데이터 )
		 *  - 출력 후 마지막에 엔터 침(줄바꿈)
		 *  
		 * 2. System.out.print( 출력할 데이터 )
		 *  - 출력 후 마지막에 엔터 안 침(줄바꿈 안됨)
		 * 
		 * 3. System.out.printf( "서식문자열", 데이터1, 데이터2.. )
		 *  - 서식문자( %d, %f, %c, %s 등)를 사용하여 데이터 출력
		 *  - 줄바꿈 안됨
		 */
		System.out.println("ABC");
		System.out.println(10 + 20);
		System.out.println("ABC" + 10);
		System.out.println(10 + 20 + "ABC");
		System.out.println("ABC" + 10 + 20); 
		System.out.println(10 + 20 + "ABC" + 10 + 20);
		System.out.println(10 + 20 + "ABC" + (10 + 20));
		// 단어, 문장 등의 텍스트 데이터는 ""로 표시한다.
		
		System.out.println("1.ABCDE");
		System.out.print("2.ABCDE");
		System.out.printf("3.%s", "ABCDE");
		System.out.printf("4. %d %c %f %.2f %s", 10, 'a', 1.4, 1.488, "ㅎㅇ");
		/*
		 * < 서식 문자(format character) >
		 *  1. %d (decimal) : 10진수 정수 형식으로 
		 *  2. %f (float)   : 실수 형식으로 
		 *  3. %c (character) : 단일문자(문자1개) 형식으로
		 *  					** 단일문자는 ''로 표시함
		 *  4. %s (string) : 문자열(문자 여러개) 형식으로 
		 *  					** 문자열은 ""로 표시함
		 */
		System.out.printf("\n\n이름 : %s \n평균 : %.2f점", "김피카츄", 65.3333);
		// \n : 엔터
		
	}
}









