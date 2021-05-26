package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 학생 인스턴스 3개 생성
		// 3명의 이름, 국, 영, 수를 Scanner로 입력 받기 
		// 평균과 학점을 구하여 각 인스턴스의 필드 저장되도록
		// 이후 3 학생의 이름, 평균, 학점을 출력
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("1번 학생 이름 : ");
		s1.name = sc.next();
		System.out.println("국 : ");
		s1.kr = sc.nextInt();
		System.out.println("영 : ");
		s1.en = sc.nextInt();
		System.out.println("수 : ");
		s1.ma = sc.nextInt();
		
		s1.avg = (s1.kr + s1.en + s1.ma) / 3.0;
		if(s1.avg >= 90) { s1.grade = "A"; }
		else if(s1.avg >= 80) { s1.grade = "B"; }
		else if(s1.avg >= 70) { s1.grade = "C"; }
		else if(s1.avg >= 60) { s1.grade = "D"; }
		else { s1.grade = "F"; } 
		
		System.out.print("2번 학생 이름 : ");
		s2.name = sc.next();
		System.out.println("국 : ");
		s2.kr = sc.nextInt();
		System.out.println("영 : ");
		s2.en = sc.nextInt();
		System.out.println("수 : ");
		s2.ma = sc.nextInt();
		
		s2.avg = (s2.kr + s2.en + s2.ma) / 3.0;
		if(s2.avg >= 90) { s2.grade = "A"; }
		else if(s2.avg >= 80) { s2.grade = "B"; }
		else if(s2.avg >= 70) { s2.grade = "C"; }
		else if(s2.avg >= 60) { s2.grade = "D"; }
		else { s2.grade = "F"; } 
		
		System.out.print("3번 학생 이름 : ");
		s3.name = sc.next();
		System.out.println("국 : ");
		s3.kr = sc.nextInt();
		System.out.println("영 : ");
		s3.en = sc.nextInt();
		System.out.println("수 : ");
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








