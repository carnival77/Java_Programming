package basic;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
		String sNum = JOptionPane.showInputDialog(null, "정수 입력");
		int num = Integer.parseInt(sNum); 
		
		switch(num) {
		case 1:  //  ':' => label (책갈피 역할. 표시용)
			System.out.println("1임ㅋ");
			break; // switch문을 끝내라
		case 2:
			System.out.println("2네여!");
			break;
		case 3:
			System.out.println("3입니당~");
			break;
		case 4: case 5:
			System.out.println("4 혹은 5입니당~~");
			break;
		default: // 옵션. 조건값이 위의 case에 모두 해당하지 않으면 실행
			System.out.println("1 ~ 5 외의 숫자!");
		}
	}
}
