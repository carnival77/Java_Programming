package quiz;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int n1,n2;
		System.out.print("������ : ");
		n1 = sc.nextInt(); 
		
		QuizMethod qm = new QuizMethod();
		System.out.println( "���� ���� : " + qm.circleArea(n1) );
		
		System.out.print("����1:");
		n1 = sc.nextInt(); 
		
		System.out.print("����2:");
		n2 = sc.nextInt();
		
		System.out.println(qm.getSum(n1, n2));
		
		System.out.println(qm.getRandomName());
	}
}





