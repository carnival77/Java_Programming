package day06.quiz;

import javax.swing.JOptionPane;

public class Quiz01 {
	public static void main(String[] args) {
		String log = "";
		String input;
		while(true) {
			input = JOptionPane.showInputDialog("�ƹ��ų� �Է�(�����exit)");
			if("exit".equalsIgnoreCase(input)) {
				break;
			}
			log += input + "\n";
		}
		System.out.println(log);
		// 1. ����, �ٹٲޱ�ȣ�� ������ ��ü ������ ����
		// String s = log.replace(" ", ""); 
		// s = s.replace("\n", "");
		String s = log.replaceAll(" |\n", "");
		//System.out.println(s);
		System.out.println(s.length() + "����");
		
		// 2. 'a' �� ���� 
//		char[] ch = log.toCharArray();
//		int count = 0;
//		for(char c : ch) {
//			if(c == 'a' || c == 'A') {
//				count++;
//			}
//		}
		s = log.replaceAll("[^a,A]", "");
		//System.out.println(s);
		System.out.println(s.length() + "����");
		
		// 3. �ܾ��� ����
		String[] sArr = log.split(" |\n");
		System.out.println("�ܾ� ���� : " + sArr.length);
		
		// 4. ���忡 "abc"�� �ִ��� Ȯ��
		System.out.println("abc ���� ? " + log.contains("abc"));
		
		// Quiz02
		// 1. �ֹι�ȣ ���ڸ� + ���� �Է� �ޱ�  ( 880123 + 1)
		// 2. 7 �������� Ȯ��
		// 3. ���� �������
		String id = JOptionPane.showInputDialog("�������, ����(YYMMDDG)");
		if(id != null) {
			id = id.trim();
			if(id.length() == 7) {
				int year = Integer.parseInt(id.substring(0, 2)); 
				int month = Integer.parseInt(id.substring(2, 4));
				int date = Integer.parseInt(id.substring(4, 6));
				// int gender = Integer.parseInt(id.substring(6, 7));
				int gender = id.charAt(6) - 48;
				String g = gender==1||gender==3 ? "����" : "����"; 
				year += gender==1||gender==2 ? 1900 : 2000;
				String message = "Year : " + year + "\n"
								+ "Month : " + month + "\n"
								+ "Date : " + date + "\n"
								+ "Gender : " + g;
				JOptionPane.showMessageDialog(null, message);
			}
			else {
				JOptionPane.showMessageDialog(null, "7���ڸ� �Է��ϼ���.");
			}
		}
	}
}




