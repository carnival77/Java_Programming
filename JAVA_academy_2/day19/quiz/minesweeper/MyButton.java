package day19.quiz.minesweeper;

import javax.swing.JButton;

public class MyButton extends JButton {
	boolean isMine; // ���ڴ�?
	int mineAroundCount; // ���� ������ ����
	int rowNum, colNum;
	
	public MyButton(int count, boolean mine) {
		mineAroundCount = count;
		isMine = mine;
	}
}
