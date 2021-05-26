package quiz;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int n1,n2;
		System.out.print("반지름 : ");
		n1 = sc.nextInt(); 
		
		QuizMethod qm = new QuizMethod();
		System.out.println( "원의 넓이 : " + qm.circleArea(n1) );
		
		System.out.print("정수1:");
		n1 = sc.nextInt(); 
		
		System.out.print("정수2:");
		n2 = sc.nextInt();
		
		System.out.println(qm.getSum(n1, n2));
		
		System.out.println(qm.getRandomName());
	}
}





