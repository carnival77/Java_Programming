package basic;
/*
 * < Method >
 * = 함수
 * = 객체가 행동하는 방식
 * - 단어 끝에 () --> 무조건 메서드!
 * - 기계와 비슷함
 *   ==> 복잡한 작업을 자주 실행해야 할 때
 *   
 */
public class Test01 {
	public static void main(String[] args) {
		// 객체가 '낙동강 오리알' 신세 되면 GC가 이를 소멸시킨다.
		Pokemon p = new Pokemon();
				//  --------------
		p = new Pokemon();
		
		System.out.println(new Pokemon());
	}
}
