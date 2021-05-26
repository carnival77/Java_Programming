package day19.quiz.chatting.client;

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


public class ClientMain extends JFrame {
	JPanel panel1, panel2;
	JTextArea textArea;
	JTextField textField;
	JButton button;

	Socket cSoc;
	ClientSendThread sThread;
	ClientReceiveThread rThread;

	public ClientMain() {
		super("Client!");

		textArea = new JTextArea();
		textField = new JTextField();
		button = new JButton("전송");

		textArea.setEditable(false);
		textField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
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
			cSoc = new Socket("192.168.3.101", 3000);

			rThread = new ClientReceiveThread(this);
			rThread.start();
			sThread = new ClientSendThread(this);
			sThread.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 전송버튼이나 엔터를 누르면 실행
	synchronized private void sendMessage() {
		String message = textField.getText().trim(); // 텍스트 필드에서 텍스트 받아옴
		// 스레드에게 보내기
		sThread.message = message;
		textField.setText("");
		textArea.append("나(클라이언트) : " + message + "\n");
	}

	public static void main(String[] args) {
		new ClientMain();

	}
}
