package basic;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
		// ��� : sysout
		// �Է� : sc.nextInt() 
		// --> �ܼ� �����
		
		// 'jop' + ctrl + sp 
		// .showm
		JOptionPane.showMessageDialog(null, "������������");
		// ==> �޽��� ��¿� ���̾�α�
		
		String input = JOptionPane.showInputDialog(null, "���̸� �Է��ϼ���."); 
		System.out.println(input + "��");
		JOptionPane.showMessageDialog(null, "����� " + input + "���Դϴ�.");
		// �Էµ� ���̰� "����" ����, "�̼���"���� ���
		
		// System.out.println( ((int)input) >= 20 ? "����" : "�̼���" );
		// String���� ����ȯ(casting) ��� parsing�� �ؾ� �Ѵ�.
		// Parsing(�����м�) 
		//  : String�� ����, �Ǽ�, boolean ������ ��ȯ 
		
		int age = Integer.parseInt( input ); 
		// input�� ���� int������ ��ȯ�Ͽ� �� ����� age�� ���� 
		System.out.println( age >= 20 ? "����" : "�̼���" );
		
	}
}







