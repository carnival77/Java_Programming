package day19.quiz.minesweeper;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MineSweeperMain extends JFrame {

	MyButton buttons[][] = new MyButton[15][15];
	boolean[][] mineMap = new boolean[15][15];
	boolean[][] isFlag = new boolean[15][15];

	private void setMine() {
		int count = 80;
		while (count != 0) {
			int x = (int) (Math.random() * 15);
			int y = (int) (Math.random() * 15);
			if (!mineMap[x][y]) {
				mineMap[x][y] = true;
				--count;
			}
		}
		System.out.println("---------------지뢰 현황------------");
		for (int i = 0; i < 15; ++i) {
			for (int j = 0; j < 15; ++j) {
				System.out.print((mineMap[i][j] ? "1" : "0") + "\t");
			}
			System.out.println();
		}

	}

	// MyButton 15 X 15 개 생성
	private void setButtons() {
		// 버튼 세팅 ( 지뢰니? + 주위 지뢰의 개수를 저장 )
		for (int i = 0; i < 15; ++i) {
			for (int j = 0; j < 15; ++j) {
				int count = 0;

				for (int a = (i > 0 ? i - 1 : i); a <= (i + 1 < 15 ? i + 1 : i); ++a) {
					for (int b = (j > 0 ? j - 1 : j); b <= (j + 1 < 15 ? j + 1 : j); ++b) {
						if (a == i && b == j) {
							continue;
						}
						if (mineMap[a][b]) {
							++count;
						}
					}
				}

				buttons[i][j] = new MyButton(count, mineMap[i][j]);
				buttons[i][j].rowNum = i;
				buttons[i][j].colNum = j;
			}
		}

		System.out.println("---------------주위 지뢰의 개수------------");
		for (int i = 0; i < 15; ++i) {
			for (int j = 0; j < 15; ++j) {
				System.out.print(buttons[i][j].mineAroundCount + "\t");
			}
			System.out.println();
		}
	}

	void setUI() {

		MouseListener listener = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				MyButton button = (MyButton) e.getSource();
				int r = button.rowNum;
				int c = button.colNum;
					
				if (e.getButton() == MouseEvent.BUTTON3) { // 우클릭?
					if(!isFlag[r][c] && button.isEnabled()) {
						button.setText("★");
						isFlag[r][c] = true;
						button.setFont(new Font("돋움", Font.BOLD, 20));
						if(isWin()) {
							JOptionPane.showMessageDialog(MineSweeperMain.this, "GAME WIN!");
						}
						return;
					}
					button.setText("");
					return;
				}
				isFlag[button.rowNum][button.colNum] = false;
				if (button.isMine) { // 지뢰를 클릭했니?
					for(int i = 0; i < 15; ++i) {
						for(int j = 0; j < 15; ++j) {
							buttons[i][j].setEnabled(false);
							if(mineMap[i][j]) {
								buttons[i][j].setFont(new Font("돋움", Font.BOLD, 20));
								buttons[i][j].setText("★");
							}
						}
					}
					JOptionPane.showMessageDialog(MineSweeperMain.this, "GAME OVER");
					System.exit(0);
				}
				if (button.mineAroundCount == 0) {
					spread(button.rowNum, button.colNum);
				}
				String text = button.mineAroundCount == 0 ? "" :  button.mineAroundCount+"";
				button.setText(text);
				button.setEnabled(false);
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		};

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(15, 15));
		for (MyButton[] arr : buttons) {
			for (MyButton my : arr) {
				my.setText("");
				my.setFont(new Font("돋움", Font.BOLD, 25));
				my.addMouseListener(listener);
				panel.add(my);
			}
		}

		this.add(panel);
		// jframe 에 add()
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(900, 900);
		this.setVisible(true);
		this.setTitle("나의 지뢰찾기!");
	}

	boolean isWin() {
		boolean win = true;
		for(int i = 0; i < 15; ++i) {
			for(int j = 0; j < 15; ++j) {
				if(mineMap[i][j] != isFlag[i][j]) {
					win = false;
					break;
				}
			}
		}
		return win;
	}
	void spread(int i, int j) {
		for (int a = (i > 0 ? i - 1 : i); a <= (i + 1 < 15 ? i + 1 : i); ++a) {
			for (int b = (j > 0 ? j - 1 : j); b <= (j + 1 < 15 ? j + 1 : j); ++b) {
				if (!buttons[a][b].isEnabled()) { // a행의 b열 버튼이 비활성화된 버튼이라면
					continue; // 걍 넘어가라..
				}
				
				buttons[a][b].setEnabled(false);
				buttons[a][b].setText(buttons[a][b].mineAroundCount == 0 ? "" :  buttons[a][b].mineAroundCount+"");
				if (buttons[a][b].mineAroundCount == 0) {
					spread(a, b);
				}
			}
		}
	}

	public MineSweeperMain() {
		setMine();
		setButtons();
		setUI();
	}

	public static void main(String[] args) {
		new MineSweeperMain();
	}
}
