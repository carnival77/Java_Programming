package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 'Scanner' + ctrl + sp 
		Scanner sc = new Scanner(System.in); 
		int num; 
		
		System.out.println("�� : ");
		num = sc.nextInt(); // �Է¹��� �����͸� int������ �ν��ϰ�, 		
							// �� ���� num�� ����
		System.out.println(num + "�ʸ� �Է��ϼ̽��ϴ�.");
		// XX�� XX���Դϴ�.
		System.out.println( num/60 + "�� " + num%60 + "��");
	
	}
}

