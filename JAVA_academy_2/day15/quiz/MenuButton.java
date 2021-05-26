package day15.quiz;

import javax.swing.JButton;

import Report5.FriendList_GUI2;

public class MenuButton extends JButton{
	String text;
	int price;
	
	public MenuButton(String t, int p) {
		super(t);
		text = t;
		price = p;
	}
}
