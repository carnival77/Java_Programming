package basic;
/*
 * < 변수 (variable) >
 * - 데이터 1개를 담는 그릇 역할의 메모리 
 * - 변수 안의 값은 변경할 수 있음
 * 
 * < 변수 사용 방법 >
 * 1. 변수 만들기 => 변수 선언
 *  형식: 자료형 변수명;
 *       자료형 변수명 = 초기값; 
 *  --> 자료형은 변수의 모양 (그릇의 모양)을 나타냄 
 *      자료형이 다른 데이터는 변수에 저장 불가하므로 주의하자!
 *      
 * 2. 변수에 값 넣기 => 변수 접근
 *  형식: 변수명 = 값;
 *  --> 변수 선언 이후, 해당 변수에 최초로 값이 저장되는 경우 
 *      이 부분은 '변수 초기화'라고 한다.
 *      초기화 되지 않은 변수는 사용불가 ( 연산 X, 출력 X ) 
 *  --> = : 같다 (X)
 *  		대입하라 / 저장하라 (O)
 */
public class Test01 {
	public static void main(String[] args) {
		int r;
		double pi = 3.14;
		
		r = 5;
		double area = r * r * pi;
		
		System.out.println("반지름 : " + r);
		// 'syso' + ctrl + space ( + enter )
		System.out.println("원의 넓이 : " + area);

		r = 10;
		area = r * r * pi;
		System.out.println("반지름 : " + r);
		System.out.println("원의 넓이 : " + area);
	}
}
