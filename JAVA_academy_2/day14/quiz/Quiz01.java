package day14.quiz;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * - 4 X 4 ���� ��ư ���� 
 * - 1 ~ 16 ���ڸ� �����ϰ� ��ġ�� 
 * - ����ڰ� 1 ~ 16���� ������� ��ư�� Ŭ���ؼ� ������ �� �ϸ� WIN!
 *   �߰��� �߸��� ���ڸ� Ŭ���ϸ� LOSE! �ϰ� ���α׷� ����
 *   (��ư.setEnabled(false) ����غ���) 
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
		// ������
		JFrame frame = new JFrame("���� ���߱�");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(4, 4));
			
		///////////////////////////////////////
		// ������ �����
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
		// ��ư 16�� �����
		JButton buttons[] = new JButton[16];
		for(int i = 0; i < buttons.length; ++i) {
			JButton tmp =new JButton(String.valueOf(arr[i])); // ��ư ����
			tmp.setFont(new Font("����", Font.PLAIN, 50)); // �۾� ũ��
			tmp.addActionListener(listener); // ������ ���̱�
			frame.add(tmp); // �����ǿ� ���̱�
		}
		frame.setVisible(true);
	}
}
