package basic;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
		String sNum = JOptionPane.showInputDialog(null, "���� �Է�");
		int num = Integer.parseInt(sNum); 
		
		switch(num) {
		case 1:  //  ':' => label (å���� ����. ǥ�ÿ�)
			System.out.println("1�Ӥ�");
			break; // switch���� ������
		case 2:
			System.out.println("2�׿�!");
			break;
		case 3:
			System.out.println("3�Դϴ�~");
			break;
		case 4: case 5:
			System.out.println("4 Ȥ�� 5�Դϴ�~~");
			break;
		default: // �ɼ�. ���ǰ��� ���� case�� ��� �ش����� ������ ����
			System.out.println("1 ~ 5 ���� ����!");
		}
	}
}
