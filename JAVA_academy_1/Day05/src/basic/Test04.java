package basic;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		/*
		 * < Scanner >
		 * - 입력스트림의 데이터를 Scan하는 용도
		 * - 키보드 입력 받는 용도 
		 * 
		 */
		
		// 입력된 데이터를 가져올 심부름꾼 sc 생성
		Scanner sc = new Scanner(System.in); 
		// main에서 1줄만 있으면 됨
		
		System.out.println("이름..");
		String name = sc.next(); 
		// String 입력은 sc.next() 
		
		System.out.println("나이..");
		int age = sc.nextInt(); 
		// int 입력은 sc.nextInt()
		
		System.out.println("키..");
		double height = sc.nextDouble(); 
		// double 입력은 sc.nextDouble()
		
		// 주의! 문자 1개 입력 받는 nextChar() 이런건 없다.
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		// 노란줄 거슬리면 
		sc.close(); // 심부름꾼 종료
		
		// 문자열 입력 할 때 띄어쓰기 ㄴㄴ
		// sc.nextLine() ==> 띄어쓰기 가능한 문자열 입력
	}
}







