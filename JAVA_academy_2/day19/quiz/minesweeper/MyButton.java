package day19.quiz.minesweeper;

import javax.swing.JButton;

public class MyButton extends JButton {
	boolean isMine; // 지뢰니?
	int mineAroundCount; // 주위 지뢰의 개수
	int rowNum, colNum;
	
	public MyButton(int count, boolean mine) {
		mineAroundCount = count;
		isMine = mine;
	}
}
