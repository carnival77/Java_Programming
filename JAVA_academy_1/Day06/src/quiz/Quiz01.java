package quiz;

import java.util.Scanner;

public class Quiz01 {
	// Scanner�� Math.random()�� ����Ͽ� 
	// 2�� ~ 9�� �� ������ ������ ������ 1�� ����
	// ������ �Է� �޾� "����!" Ȥ�� "��.." ��� ���
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in); 
		int n1 = (int)(Math.random() * 8) + 2; // 2 ~ 9
		int n2 = (int)(Math.random() * 9) + 1; // 1 ~ 9
		
		System.out.println(n1 + " X " + n2);
		System.out.print("�� : ");
		
		int answer = sc.nextInt();
		System.out.println( answer == n1*n2 ? "����!" : "��.." );*/
		
		// 30% Ȯ���� "������� ������ϴ�!"
		// ������ Ȯ���� "�Ϲ����� ������ϴ�.." �� �� �ϳ��� ���
		double r = Math.random();
		System.out.println(r);
		System.out.println(r < 0.3 ? "������� ������ϴ�!" : "�Ϲ����� ������ϴ�..");
	}
}












