package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// �л� �ν��Ͻ� 3�� ����
		// 3���� �̸�, ��, ��, ���� Scanner�� �Է� �ޱ� 
		// ��հ� ������ ���Ͽ� �� �ν��Ͻ��� �ʵ� ����ǵ���
		// ���� 3 �л��� �̸�, ���, ������ ���
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("1�� �л� �̸� : ");
		s1.name = sc.next();
		System.out.println("�� : ");
		s1.kr = sc.nextInt();
		System.out.println("�� : ");
		s1.en = sc.nextInt();
		System.out.println("�� : ");
		s1.ma = sc.nextInt();
		
		s1.avg = (s1.kr + s1.en + s1.ma) / 3.0;
		if(s1.avg >= 90) { s1.grade = "A"; }
		else if(s1.avg >= 80) { s1.grade = "B"; }
		else if(s1.avg >= 70) { s1.grade = "C"; }
		else if(s1.avg >= 60) { s1.grade = "D"; }
		else { s1.grade = "F"; } 
		
		System.out.print("2�� �л� �̸� : ");
		s2.name = sc.next();
		System.out.println("�� : ");
		s2.kr = sc.nextInt();
		System.out.println("�� : ");
		s2.en = sc.nextInt();
		System.out.println("�� : ");
		s2.ma = sc.nextInt();
		
		s2.avg = (s2.kr + s2.en + s2.ma) / 3.0;
		if(s2.avg >= 90) { s2.grade = "A"; }
		else if(s2.avg >= 80) { s2.grade = "B"; }
		else if(s2.avg >= 70) { s2.grade = "C"; }
		else if(s2.avg >= 60) { s2.grade = "D"; }
		else { s2.grade = "F"; } 
		
		System.out.print("3�� �л� �̸� : ");
		s3.name = sc.next();
		System.out.println("�� : ");
		s3.kr = sc.nextInt();
		System.out.println("�� : ");
		s3.en = sc.nextInt();
		System.out.println("�� : ");
		s3.ma = sc.nextInt();
		
		s3.avg = (s3.kr + s3.en + s3.ma) / 3.0;
		if(s3.avg >= 90) { s3.grade = "A"; }
		else if(s3.avg >= 80) { s3.grade = "B"; }
		else if(s3.avg >= 70) { s3.grade = "C"; }
		else if(s3.avg >= 60) { s3.grade = "D"; }
		else { s3.grade = "F"; } 
		
		s1.printData();
		s2.printData();
		s3.printData();
	}
}








