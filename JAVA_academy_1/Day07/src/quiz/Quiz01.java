package quiz;

import javax.swing.JOptionPane;

public class Quiz01 {
	public static void main(String[] args) {
		// �� : 3, 4, 5
		// ���� : 6, 7, 8
		// ���� : 9, 10, 11
		// �ܿ� : 12, 1, 2
		int month = Integer.parseInt(JOptionPane.showInputDialog("�¾ ��"));
		String message = "�߸��� �Է��Դϴ�."; 
		switch(month) {
		case 3: case 4: case 5:
			message = "���� �¾�̱���! \n";
			break;
		case 6: case 7: case 8:
			message = "������ �¾�̱���! \n";
			break;
		case 9: case 10: case 11:
			message = "������ �¾�̱���! \n";
			break;
		case 12: case 1: case 2:
			message = "�ܿ￡ �¾�̱���! \n";
		}
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			message += month + "���� 31�ϱ��� �ֽ��ϴ�.";
			break;
		case 2:
			message += "2���� 28�ϱ��� �ֽ��ϴ�.";
			break;
		case 4: case 6: case 9: case 11:
			message += month + "���� 30�ϱ��� �ֽ��ϴ�.";
		}
		JOptionPane.showMessageDialog(null, message);
	}
}






