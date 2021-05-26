package basic;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int age;
		
		System.out.println("나이를 입력하세요..");
		age = sc.nextInt();
		
		System.out.println("입력된 나이 : " + age + "세");
		
		boolean result = 14 <= age && age <= 16; //14 <= age <= 16; 
		System.out.println("중학생? " + result);
		
		
		// !a 는   a==false 와 같다
		
	}
}
