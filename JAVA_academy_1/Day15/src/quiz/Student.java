package quiz;

import javax.swing.JOptionPane;

public class Student {
	// 멤버변수 : 이름, 국, 영, 수, 평균, 학점
	String name;
	int kr, en, ma;
	double avg;
	String grade;
			
	// 멤버메소드 최소 2개 
	// setStudent()
	void setStudent(String n, int k, int e, int m){
		name = n;
		kr = k;
		en = e;
		ma = m;
		avg = (kr + en + ma) / 3.0;
		switch( (int)(avg/10) ) {
		case 10: 
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7:	grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F";
		}
	}
	
	// printStudent()
	void printStudent(){ // 메소드는 다른 클래스와 결합도가 낮을 수록 좋다.
		System.out.println(getInfo());
	}
	void showStudentDialog() {
		JOptionPane.showMessageDialog(null, getInfo());
		// jop ==> ctrl + sp
	}
	String getInfo() {
		return "이름 : " + name + "\n" + 
				"국어 : " + kr + "\n" + 
				"영어 : " + en + "\n" + 
				"수학 : " + ma + "\n" + 
				"평균 : " + avg + "\n" + 
				"학점 : " + grade;
	}
}




