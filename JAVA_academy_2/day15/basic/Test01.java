package day15.basic;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test01 {
	
	JFrame frame; 		// ������ â
	JPanel bigPanel; 	// ū ������ 
	JPanel smallPanel; 	// ���� ������
	
	JTextArea textArea; 	// ���â ū�� 
	JTextField textField; 	// �Է�â �� �� ¥��
	JButton button; 		// �ʱ�ȭ ��ư 
		
	public Test01() {
		frame = new JFrame("������ �޸���");
		bigPanel = new JPanel();
		smallPanel = new JPanel();
		
		textArea = new JTextArea();
		textField = new JTextField();
		button = new JButton("�ʱ�ȭ");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		// textfield ���� 
		
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) { // ����Ű�� ������ �� ����
			}
			
			@Override
			public void keyReleased(KeyEvent e) { // Ű�� �������� �� ����
			}
			char[] save_Array = new char[100];
			@Override
			public void keyPressed(KeyEvent e) { // Ű�� ������ �� ����
				int n=0;
				while(e.getKeyCode() == KeyEvent.VK_ENTER) {
					System.out.print(e.getKeyChar());
					save_Array[n]=e.getKeyChar();
				}
				int c=n;
				for(n=0;n<c;n++)
				System.out.println(save_Array[n]);
				
				
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) { // ���Ͱ� ���ȴ�?
					String tmp = textField.getText() + "\n";
					String log = textArea.getText();
					textArea.setText(log + tmp); // textArea�� �ؽ�Ʈ ������
					textField.setText(""); // textField�� �Է°� ����
				}
			}
		});
		
		
		// textarea ����
		textArea.setEditable(false); // �Է� ���ϰ�..
		//textArea.setText("�޷ո޷�\n������");
		
		// ���� ������ ���� 
		smallPanel.setLayout(new BorderLayout());
		smallPanel.add(textField, BorderLayout.CENTER);
		smallPanel.add(button, BorderLayout.EAST);
		
		// frame ���� 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 900); // ȭ�� ũ��
		frame.setLocation(1400, 50); // ȭ�� ��ġ
		frame.setLayout(new BorderLayout()); // Ŀ�ٶ� Ʋ ����
		frame.add(textArea, BorderLayout.CENTER); 
		frame.add(smallPanel, BorderLayout.SOUTH);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
