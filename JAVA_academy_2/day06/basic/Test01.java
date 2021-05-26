package day06.basic;
/*
 * < java.lang.System 클래스 >
 * - 운영체제(시스템) 관련 클래스
 * 
 * - 필드 :  
 * 	1) in : cmd(콘솔)와 연결되어있는 입력 스트림
 *  2) out : cmd와 연결되어있는 출력 스트림
 *  3) err : cmd와 연결되어있는 출력 스트림(에러 메시지를 내보내는 비상 통로)
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println("ㅋㅋㅋㅋ"); // sysout
		System.err.println("ㅎㅎㅎㅎ"); // syserr
		
		long millis = System.currentTimeMillis();
		// 1970.1.1 자정 ~ 지금까지 경과한 밀리초를 long으로 알려줌
		System.out.println(millis);
		
		for(int i = 0; i < 1000000; ++i) {
			System.out.println(i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-millis + "밀리초");
	}
}










