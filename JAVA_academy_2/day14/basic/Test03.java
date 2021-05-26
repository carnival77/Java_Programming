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
 * 주요 패키지 : 
 * 	java.awt : 운영체제와의 의존도가 높아서 호환 문제가 있었음
 * 		==> Button, Textarea, TextField, Table, ...
 * 
 *  javax.swing : 자바에서 자체적으로 만들어 낸 컴포넌트 (운영체제와는 독립적으로 운영됨)
 *   	==> JButton, JTextarea, JTextField, JTable, ...
 *   
 * < GUI 구성 요소 >
 * 1. Component : 레고블럭
 * 
 * 2. Container : 레고판
 * 
 * 3. LayoutManager : 틀 관리자
 */
public class Test03 {
	public static void main(String[] args) {
		// 레고판 만들기
		JFrame frame = new JFrame("나의 첫 GUI!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X 버튼 누르면 프로그램 종료
		frame.setSize(300, 400); // 너비 300px, 높이 400px
		frame.setLocation(1400, 200); // x : 1400px, y : 200px 
		//frame.setLocationRelativeTo(null); // 화면의 한 가운데에 배치
		
		// 버튼 준비
		JButton button1 = new JButton("피카츄");
		JButton button2 = new JButton("라이츄");
		JButton button3 = new JButton("파이리");
		JButton button4 = new JButton("꼬부기");
		JButton button5 = new JButton("버터풀");
		JButton button6 = new JButton("야도란");
		
		// 버튼들을 레고판에 붙이기
		// 레이아웃 1. FlowLayout : 화면 크기에 상대적으로 컴포넌트를 배치하는 레이아웃
		// LayoutManager layout = new FlowLayout();
		
		// 레이아웃2. GridLayout : 행 X 열 2차원 배열모양으로 컴포넌트를 배치
		//LayoutManager layout = new GridLayout(2, 3); // 2행 3열
		//frame.setLayout(layout); // 레고판에 레이아웃 적용
		
		// 레이아웃3. BorderLayout : 동서남북중앙 형태로 배치
		LayoutManager layout = new BorderLayout();
		frame.setLayout(layout);
		
		// FrameLayout / GridLayout 에는 ..
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
		
		// 작은 레고판 만들기
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		
		frame.add(panel, BorderLayout.NORTH);
		
		// 클릭 이벤트 리스너 만들기 : ActionListener
		ActionListener listener= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource(); //이벤트가 발생한 컴포넌트 객체를 받아옴
				String text = btn.getText();
				//System.out.println(text + " 클릭");
				JOptionPane.showMessageDialog(frame, text + " 클릭");
				btn.setEnabled(false);
				
			}
		};
		button1.setFont(new Font("돋움", Font.BOLD, 50));
		
		// 리스너 배치
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		frame.setVisible(true);
	}
}






