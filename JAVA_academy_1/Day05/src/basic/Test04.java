package basic;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		/*
		 * < Scanner >
		 * - �Է½�Ʈ���� �����͸� Scan�ϴ� �뵵
		 * - Ű���� �Է� �޴� �뵵 
		 * 
		 */
		
		// �Էµ� �����͸� ������ �ɺθ��� sc ����
		Scanner sc = new Scanner(System.in); 
		// main���� 1�ٸ� ������ ��
		
		System.out.println("�̸�..");
		String name = sc.next(); 
		// String �Է��� sc.next() 
		
		System.out.println("����..");
		int age = sc.nextInt(); 
		// int �Է��� sc.nextInt()
		
		System.out.println("Ű..");
		double height = sc.nextDouble(); 
		// double �Է��� sc.nextDouble()
		
		// ����! ���� 1�� �Է� �޴� nextChar() �̷��� ����.
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		// ����� �Ž����� 
		sc.close(); // �ɺθ��� ����
		
		// ���ڿ� �Է� �� �� ���� ����
		// sc.nextLine() ==> ���� ������ ���ڿ� �Է�
	}
}







