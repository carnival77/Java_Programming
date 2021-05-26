package day14.basic;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/*
 * < GUI >
 * �ֿ� ��Ű�� : 
 * 	java.awt : �ü������ �������� ���Ƽ� ȣȯ ������ �־���
 * 		==> Button, Textarea, TextField, Table, ...
 * 
 *  javax.swing : �ڹٿ��� ��ü������ ����� �� ������Ʈ (�ü���ʹ� ���������� ���)
 *   	==> JButton, JTextarea, JTextField, JTable, ...
 *   
 * < GUI ���� ��� >
 * 1. Component : �����
 * 
 * 2. Container : ������
 * 
 * 3. LayoutManager : Ʋ ������
 */
public class Test03 {
	public static void main(String[] args) {
		// ������ �����
		JFrame frame = new JFrame("���� ù GUI!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X ��ư ������ ���α׷� ����
		frame.setSize(300, 400); // �ʺ� 300px, ���� 400px
		frame.setLocation(1400, 200); // x : 1400px, y : 200px 
		//frame.setLocationRelativeTo(null); // ȭ���� �� ����� ��ġ
		
		// ��ư �غ�
		JButton button1 = new JButton("��ī��");
		JButton button2 = new JButton("������");
		JButton button3 = new JButton("���̸�");
		JButton button4 = new JButton("���α�");
		JButton button5 = new JButton("����Ǯ");
		JButton button6 = new JButton("�ߵ���");
		
		// ��ư���� �����ǿ� ���̱�
		// ���̾ƿ� 1. FlowLayout : ȭ�� ũ�⿡ ��������� ������Ʈ�� ��ġ�ϴ� ���̾ƿ�
		// LayoutManager layout = new FlowLayout();
		
		// ���̾ƿ�2. GridLayout : �� X �� 2���� �迭������� ������Ʈ�� ��ġ
		//LayoutManager layout = new GridLayout(2, 3); // 2�� 3��
		//frame.setLayout(layout); // �����ǿ� ���̾ƿ� ����
		
		// ���̾ƿ�3. BorderLayout : ���������߾� ���·� ��ġ
		LayoutManager layout = new BorderLayout();
		frame.setLayout(layout);
		
		// FrameLayout / GridLayout ���� ..
		//frame.add(button1);
		//frame.add(button2);
		//frame.add(button3);
		//frame.add(button4);
		//frame.add(button5);
		//frame.add(button6);
		
		// BorderLayout
		frame.add(button1, BorderLayout.CENTER);
		frame.add(button2, BorderLayout.WEST);
		frame.add(button3, BorderLayout.SOUTH);
		
		// ���� ������ �����
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		
		frame.add(panel, BorderLayout.NORTH);
		
		// Ŭ�� �̺�Ʈ ������ ����� : ActionListener
		ActionListener listener= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource(); //�̺�Ʈ�� �߻��� ������Ʈ ��ü�� �޾ƿ�
				String text = btn.getText();
				//System.out.println(text + " Ŭ��");
				JOptionPane.showMessageDialog(frame, text + " Ŭ��");
				btn.setEnabled(false);
				
			}
		};
		button1.setFont(new Font("����", Font.BOLD, 50));
		
		// ������ ��ġ
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		frame.setVisible(true);
	}
}






