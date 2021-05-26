/*
 * < 자료형 >
 * -> 데이터들의 형태
 * 
 * 자바의 자료형은 2가지 
 * 1. 원시자료형 
 * 2. 참조자료형 (<- 나중에 배움)
 * 
 * < 원시 자료형 >
 * -> 정수, 실수, 문자, 논리의 8가지 자료형
 * 
 *  1. 정수형
 *  	1) byte형 (1개의 byte형 데이터는 1byte)
 *  	2) short형 (2byte)
 *  	3) int형 (4byte) ==> 코드 상의 모든 정수 상수 int형
 *  	4) long형 (8byte)
 *  
 *  2. 실수형 
 *  	1) float형 (4byte)
 *  	2) double형(8byte) ==> 코드 상의 모든 실수 상수 double형
 *  
 *  3. 문자형 
 *  	char형 (2byte)
 *     		=>단일문자의 자료형
 *   	참고) String형 : 문자열형 (원시자료형 아님)
 *   
 *  4. 논리형 (참/거짓형)
 *  	boolean (1byte)
 *  		=> true, false 상수가 있다.
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println(10000000000L);
		// int가 아닌 long으로 처리해! 
		System.out.println(true); // 문자열형이 아닌 boolean형임
		
		System.out.println(1 + 1);
		System.out.println(1.0 + 1);
		System.out.println('1' + 1);
		System.out.println("1" + 1);
		// 모두 같은 1일까?
	}
}












