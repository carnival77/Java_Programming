package quiz;

import javax.swing.JOptionPane;

public class Student {
	// ������� : �̸�, ��, ��, ��, ���, ����
	String name;
	int kr, en, ma;
	double avg;
	String grade;
			
	// ����޼ҵ� �ּ� 2�� 
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
	void printStudent(){ // �޼ҵ�� �ٸ� Ŭ������ ���յ��� ���� ���� ����.
		System.out.println(getInfo());
	}
	void showStudentDialog() {
		JOptionPane.showMessageDialog(null, getInfo());
		// jop ==> ctrl + sp
	}
	String getInfo() {
		return "�̸� : " + name + "\n" + 
				"���� : " + kr + "\n" + 
				"���� : " + en + "\n" + 
				"���� : " + ma + "\n" + 
				"��� : " + avg + "\n" + 
				"���� : " + grade;
	}
}




