package day19.quiz.chatting.server;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerMain extends JFrame {
	JPanel panel1, panel2;
	JTextArea textArea;
	JTextField textField;
	JButton button;
	
	StringBuffer text = new StringBuffer();
	
	ServerSocket sSoc;
	Socket cSoc;
	ServerSendThread sThread;
	ServerReceiveThread rThread;
	
	public ServerMain() {
		super("Server!");
		
		textArea = new JTextArea();
		textField = new JTextField();
		button = new JButton("����");
		
		textArea.setEditable(false);
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) { }
			
			@Override
			public void keyReleased(KeyEvent e) { }
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(textField, BorderLayout.CENTER); 
		panel2.add(button, BorderLayout.EAST);
		
		
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		panel1.add(textArea, BorderLayout.CENTER);
		panel1.add(panel2, BorderLayout.SOUTH);
		
		add(panel1);
		setSize(400, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(1200, 30);
		setVisible(true);
		
		
		
		try {
			sSoc = new ServerSocket(3000);
			
			textArea.setText("Ŭ���̾�Ʈ�� ��ٸ��� �ֽ��ϴ�..\n");
			cSoc = sSoc.accept();
			textArea.append("Ŭ���̾�Ʈ ���� ����!!\n");
			
			// �ۼ��� ������ ����
			
			rThread = new ServerReceiveThread(this);
			rThread.start();
			
			sThread = new ServerSendThread(this);
			sThread.start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// ���۹�ư�̳� ���͸� ������ ����
	synchronized private void sendMessage() {
		String message = textField.getText().trim(); // �ؽ�Ʈ �ʵ忡�� �ؽ�Ʈ �޾ƿ�
		// �����忡�� ������
		sThread.message = message;
		textField.setText("");
		textArea.append("��(����) : " + message + "\n");
	}
	
	public static void main(String[] args) {
		new ServerMain();
		
	}
}
