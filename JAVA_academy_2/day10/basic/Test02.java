package day10.basic;
/*
 * 많은 메서드/생성자 들은 '반드시 예외처리'해야 사용할 수 있다!
 * 
 * 예외처리 방법
 *  1. try - catch : 즉석에서 예외처리
 *  2. throws 선언 (예외던지기) : 지금 작성중인 메서드를 호출할 다음 메서드에게 
 *  						  try-catch 할 것을 위임
 *  	: 메서드(생성자 포함)에서만 선언할 수 있다. 
 *        main()은 throws 선언 ㄴㄴ 
 *          ==> 다음 타자가 없다
 */
public class Test02 {
	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 10; i > 0; --i) {
			System.out.println(i + "초");
//			try {
//				Thread.sleep(1000); // 1초 정지
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
			Thread.sleep(1000); 
		}
		
	}
}
