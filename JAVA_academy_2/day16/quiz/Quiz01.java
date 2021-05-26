package day16.quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Quiz01 {
	class TimerThread extends Thread {
		boolean check = true;

		public void stopTimer() {
			check = false;
		}

		@Override
		public void run() {
			while (check) {
				long nowTime = System.currentTimeMillis() - initTime;
				timeText.setText(String.format("%02d:%02d:%02d", (nowTime / 1000) / 60, (nowTime / 1000) % 60,
						(nowTime / 10) % 100));
			}
		}
	}

	class MyButton extends JButton {
		int hiddenNum;

		public MyButton(int hNum) {
			super(String.valueOf(hNum));
			hiddenNum = hNum;
		}
	}

	int lastSelectedNum = 0;
	int completeCount = 0;
	MyButton lastClickedButton = null;

	JPanel rootPanel;
	JPanel timePanel;
	JPanel mainPanel;
	JLabel timeText;
	JFrame frame;

	long initTime = System.currentTimeMillis();
	TimerThread th;

	public Quiz01() {

		// 타이머 레고판
		timeText = new JLabel("00:00:00");
		timeText.setFont(new Font("돋움", Font.BOLD, 40));
		timeText.setForeground(new Color(0x18, 0x35, 0x7c));
		timeText.setHorizontalAlignment(JLabel.CENTER);
		timeText.setVerticalAlignment(JLabel.CENTER);
		timeText.setPreferredSize(new Dimension(300, 100));

		timePanel = new JPanel();
		timePanel.setBackground(new Color(0x42, 0xc2, 0xf4));
		timePanel.add(timeText);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MyButton b = (MyButton) e.getSource();
				b.setText(String.valueOf(b.hiddenNum));
				b.setEnabled(false);
				if (lastSelectedNum == 0) {
					lastSelectedNum = b.hiddenNum;
					lastClickedButton = b;
				} else {
					if (lastSelectedNum != b.hiddenNum) {
						try { Thread.sleep(1000); } catch (Exception e2) {
							// TODO: handle exception
						}
						lastClickedButton.setText("");
						lastClickedButton.setEnabled(true);
						b.setText("");
						b.setEnabled(true);
					} else {
						++completeCount;
						if (completeCount == 8) {
							th.stopTimer();
							JOptionPane.showMessageDialog(frame, "WIN!");
						}
					}
					lastClickedButton = null;
					lastSelectedNum = 0;
				}
			}
		};

		// 메인 레고판
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(4, 4));
		mainPanel.setPreferredSize(new Dimension(300, 300));
		MyButton[] buttons = new MyButton[16];
		for (int i = 0, j = 1; i < buttons.length; i += 2, ++j) {
			buttons[i] = new MyButton(j);
			buttons[i + 1] = new MyButton(j);
		}
		for (int i = 0; i < 20; ++i) {
			int a = (int) (Math.random() * buttons.length);
			int b = (int) (Math.random() * buttons.length);
			MyButton tmp = buttons[a];
			buttons[a] = buttons[b];
			buttons[b] = tmp;
		}
		for (MyButton j : buttons) {
			mainPanel.add(j);
			j.addActionListener(listener);
		}

		rootPanel = new JPanel();
		rootPanel.setLayout(new BorderLayout());
		rootPanel.add(timePanel, BorderLayout.NORTH);
		rootPanel.add(mainPanel, BorderLayout.CENTER);

		frame = new JFrame("짝꿍 맞추기!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 400);
		frame.add(rootPanel);
		frame.setVisible(true);

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}

		for (MyButton b : buttons) {
			b.setText("");
		}
		JOptionPane.showMessageDialog(frame, "게임 시작!");
		// 타이머 실행
		th = new TimerThread();
		th.start();
	}

	public static void main(String[] args) {
		new Quiz01();
	}
}
