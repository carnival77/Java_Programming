package day11.basic;

import javax.swing.JOptionPane;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("���α׷� ����!");
		
		Timer t = new Timer(); // ������� ���ν����� ���� ���ο� ������� ���������� �����
		t.setDaemon(true); // ���󽺷���� ���� (�ֽ�����(���⼱ ���ξ�����)�� ����������)
		t.start();
		
		JOptionPane.showMessageDialog(null, "������");
		System.out.println("���α׷� ����!");
	}
}
