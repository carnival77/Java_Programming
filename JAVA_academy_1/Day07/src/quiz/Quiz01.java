package quiz;

import javax.swing.JOptionPane;

public class Quiz01 {
	public static void main(String[] args) {
		// 봄 : 3, 4, 5
		// 여름 : 6, 7, 8
		// 가을 : 9, 10, 11
		// 겨울 : 12, 1, 2
		int month = Integer.parseInt(JOptionPane.showInputDialog("태어난 달"));
		String message = "잘못된 입력입니다."; 
		switch(month) {
		case 3: case 4: case 5:
			message = "봄에 태어나셨군요! \n";
			break;
		case 6: case 7: case 8:
			message = "여름에 태어나셨군요! \n";
			break;
		case 9: case 10: case 11:
			message = "가을에 태어나셨군요! \n";
			break;
		case 12: case 1: case 2:
			message = "겨울에 태어나셨군요! \n";
		}
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			message += month + "월은 31일까지 있습니다.";
			break;
		case 2:
			message += "2월은 28일까지 있습니다.";
			break;
		case 4: case 6: case 9: case 11:
			message += month + "월은 30일까지 있습니다.";
		}
		JOptionPane.showMessageDialog(null, message);
	}
}






