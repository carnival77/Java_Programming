package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// ���̸� �Է� �ް� 
		// 20�� �̻��̸� "�����Դϴ�" �ƴϸ� "�̼����Դϴ�."
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("���� : ");
		age = sc.nextInt();
		
		// ���̰� ¦������ Ȧ������ ��� 
		String message;
		message = (age % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(message);
		
		// ���̰� 11�� 4�� ��������� ���
		System.out.println( age%11==0 && age%4==0 ? "11�� 4�� �����" : "����� �ƴ�");
		
		// ��, ��, �� ������ �Է� �ް�
		System.out.println("���� �Է�..");
		int kr = sc.nextInt();
		
		System.out.println("���� �Է�..");
		int en = sc.nextInt();
		
		System.out.println("���� �Է�..");
		int ma = sc.nextInt();
		
		double avg = (double)(kr + en + ma) / 3;
		
		// ����� 60.5 �̻��̸� "�հ�", �ƴϸ� "���հ�"
		// 61, 61, 60 �̸� �հ� ���� ��
		System.out.println("��� : " + avg + "��");
		System.out.println(avg >= 60.5 ? "�հ�" : "���հ�");
	}
}





