package basic;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int age;
		
		System.out.println("���̸� �Է��ϼ���..");
		age = sc.nextInt();
		
		System.out.println("�Էµ� ���� : " + age + "��");
		
		boolean result = 14 <= age && age <= 16; //14 <= age <= 16; 
		System.out.println("���л�? " + result);
		
		
		// !a ��   a==false �� ����
		
	}
}
