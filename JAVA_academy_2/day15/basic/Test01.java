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
	
	JFrame frame; 		// 윈도우 창
	JPanel bigPanel; 	// 큰 레고판 
	JPanel smallPanel; 	// 작은 레고판
	
	JTextArea textArea; 	// 출력창 큰거 
	JTextField textField; 	// 입력창 한 줄 짜리
	JButton button; 		// 초기화 버튼 
		
	public Test01() {
		frame = new JFrame("나만의 메모장");
		bigPanel = new JPanel();
		smallPanel = new JPanel();
		
		textArea = new JTextArea();
		textField = new JTextField();
		button = new JButton("초기화");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		// textfield 설정 
		
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) { // 문자키가 눌렸을 때 반응
			}
			
			@Override
			public void keyReleased(KeyEvent e) { // 키가 떼어졌을 때 반응
			}
			char[] save_Array = new char[100];
			@Override
			public void keyPressed(KeyEvent e) { // 키가 눌렸을 때 반응
				int n=0;
				while(e.getKeyCode() == KeyEvent.VK_ENTER) {
					System.out.print(e.getKeyChar());
					save_Array[n]=e.getKeyChar();
				}
				int c=n;
				for(n=0;n<c;n++)
				System.out.println(save_Array[n]);
				
				
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) { // 엔터가 눌렸니?
					String tmp = textField.getText() + "\n";
					String log = textArea.getText();
					textArea.setText(log + tmp); // textArea에 텍스트 보내기
					textField.setText(""); // textField의 입력값 지움
				}
			}
		});
		
		
		// textarea 설정
		textArea.setEditable(false); // 입력 못하게..
		//textArea.setText("메롱메롱\nㅋㅋㅋ");
		
		// 작은 레고판 설정 
		smallPanel.setLayout(new BorderLayout());
		smallPanel.add(textField, BorderLayout.CENTER);
		smallPanel.add(button, BorderLayout.EAST);
		
		// frame 설정 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 900); // 화면 크기
		frame.setLocation(1400, 50); // 화면 위치
		frame.setLayout(new BorderLayout()); // 커다란 틀 설정
		frame.add(textArea, BorderLayout.CENTER); 
		frame.add(smallPanel, BorderLayout.SOUTH);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
