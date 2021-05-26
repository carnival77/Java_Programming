package day14.quiz;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * - 4 X 4 으로 버튼 생성 
 * - 1 ~ 16 숫자를 랜덤하게 배치함 
 * - 사용자가 1 ~ 16까지 순서대로 버튼을 클릭해서 끝까지 다 하면 WIN!
 *   중간에 잘못된 숫자를 클릭하면 LOSE! 하고 프로그램 종료
 *   (버튼.setEnabled(false) 사용해보기) 
 * 
 */
public class Quiz01 {
	static int currentNum = 0;

	public static void main(String[] args) {
		int[] arr = new int[16];
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; ++i) {
			int rand1 = (int)(Math.random() * 16);
			int rand2 = (int)(Math.random() * 16);
			int tmp = arr[rand1];
			arr[rand1] = arr[rand2];
			arr[rand2] = tmp;
		}
		
		///////////////////////////////////////
		// 레고판
		JFrame frame = new JFrame("숫자 맞추기");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(4, 4));
			
		///////////////////////////////////////
		// 리스터 만들기
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				int clickedNum = Integer.parseInt( b.getText() );
				if(++currentNum == clickedNum) {
					b.setEnabled(false);
				}
				else {
					JOptionPane.showMessageDialog(frame, "GAME OVER..");
					System.exit(0);
				}
				if(clickedNum == 16) {
					JOptionPane.showMessageDialog(frame, "WIN!!");
					System.exit(0);
				}
			}
		};
		
		///////////////////////////////////////
		// 버튼 16개 만들기
		JButton buttons[] = new JButton[16];
		for(int i = 0; i < buttons.length; ++i) {
			JButton tmp =new JButton(String.valueOf(arr[i])); // 버튼 생성
			tmp.setFont(new Font("돋움", Font.PLAIN, 50)); // 글씨 크게
			tmp.addActionListener(listener); // 리스너 붙이기
			frame.add(tmp); // 레고판에 붙이기
		}
		frame.setVisible(true);
	}
}
