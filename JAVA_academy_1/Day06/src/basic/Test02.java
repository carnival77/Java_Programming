package basic;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * < 제어문 (Control statements) >
		 * - 프로그램 흐름을 제어하는 키워드
		 * - 조건문 : if문, switch문
		 *   반복문 : while문, do-while문, for문
		 *   분기문 : break, continue, return 키워드
		 *   
		 *   
		 * < if문 >
		 * - '조건식'의 결과가 True면 '종속문장'을 실행 
		 *   False면 실행 안함
		 * - 형식: 
		 *    if( 조건식 ) {
		 *    	종속문장들...
		 *    }
		 *    
		 * - 참고) 종속문장이 1개면 {} 생략 가능
		 */
		Scanner sc = new Scanner(System.in); 
		System.out.print("나이 : ");
		int age = sc.nextInt();
		if(age >= 20) {
			System.out.println("성인입니다.");
		} 
		
		else { // 그렇지 않으면 (짝꿍 if의 '조건식'이 False면 실행하라!)
			System.out.println("미성년입니다.");
		}
		
		if(age <= 7) { System.out.println("미취학 아동"); }
		else if(age <= 13) { System.out.println("초등학생"); }
		else if(age <= 16) { System.out.println("중학생"); }
		else if(age <= 19) { System.out.println("고등학생"); }
		else { System.out.println("대학생 혹은 성인"); }
		
		/*if(age <= 7) { 
			System.out.println("미취학 아동"); 
		} 
		else {
			if(age <= 13) { 
				System.out.println("초등학생"); 
			}
			else {
				if(age <= 16) { 
					System.out.println("중학생"); 
				}
				else {
					if (age <= 19) {
						System.out.println("고등학생");
					} else {
						System.out.println("대학생 혹은 성인");
					}
				}
			}
		}*/
		
	}
}




