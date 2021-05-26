package day10.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * < 예외 >
 * - 돌발상황 
 * - runtime 에러 (실행 중 에러)
 * - Exception 클래스들의 루트 클래스 : java.lang.Exception 클래스
 * 
 * 
 * < try-catch >
 * try {
 * 
 * 		// 예외가 발생할 (예외객체가 throw될) 가능성이 있는 코드
 * }
 * catch(예외클래스1 변수명) {
 * 		// 예외객체1이 발생했을 때 실행 코드
 * }
 * catch(예외클래스2 변수명) {
 * 		// 예외객체2이 발생했을 때 실행 코드
 * }
 * finally { // 선택사항
 * 		// try 문이 정상적으로 끝나든, 예외가 중간에 발생했든 상관없이 무조건 마지막에 실행
 * 		// 마무리 작업 용도
 * }
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("정수1:");
			n1 = sc.nextInt(); // InputMismatchException
			System.out.print("정수2:");
			n2 = sc.nextInt(); // InputMismatchException
			System.out.println("몫 : " + n1 / n2);// ArithmeticException
		} 
		/*catch(InputMismatchException e) {
			System.out.println("정수를 입력하셔야 합니다.");
			e.printStackTrace();
		} 
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수는 없습니다.");
		} */
		catch(Exception e) {
			System.out.println("예기치 못한 에러가 생겼습니다.");
		}
		finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}
}





