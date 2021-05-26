package day15.quiz;

import java.awt.BorderLayout;
import java.awt.GradientPaint;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.nio.channels.Pipe;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Quiz01 {
	
	int total;
	int today;
	JButton[] navButtons = new JButton[4]; 
	JPanel navPanel;
	
	
	//////////////////////////////////
	// 네비게이션 버튼 레고판
	private void setNavPanel() {
		 navPanel = new JPanel();
		 setNavButtons();
	}
	private void setNavButtons() {
		for(int i = 0; i < navButtons.length;++i) {
			navButtons[i] = new JButton("btn" + (i+1));
			navPanel.add(navButtons[i]);
		}
	}
	
	/////////////////////////////
	// 커피 메뉴 레고판 
	final String[] MENU = {"아메리카노", "카페라떼", "카페모카", "에스프레소"};
	final int[] PRICE = {2000, 3000, 3500, 1500};
	MenuButton[] menuButtons = new MenuButton[MENU.length];
	JPanel menuPanel;
	private void setMenuButtons() {
		MouseListener listener = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) { }
			
			@Override
			public void mousePressed(MouseEvent e) { }
			
			@Override
			public void mouseExited(MouseEvent e) { }
			
			@Override
			public void mouseEntered(MouseEvent e) { }
			
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuButton btn = (MenuButton)e.getSource();
				StringBuilder s = new StringBuilder(textArea.getText());
				s.append(new SimpleDateFormat("YYYY/MM/dd HH:mm:ss").format(System.currentTimeMillis()));
				s.append(" "); 
				s.append(btn.text);
				s.append("\n");
				textArea.setText(s.toString());
				total += btn.price;
				totalTextField.setText("TOTAL : " + new DecimalFormat("###,###").format(total) + "원");
			}
		};
		for(int i = 0; i < MENU.length; ++i) {
			menuButtons[i] = new MenuButton(MENU[i], PRICE[i]);
			menuButtons[i].addMouseListener(listener);
			menuPanel.add(menuButtons[i]);
		}
	}
	private void setMenuPanel() {
		menuPanel = new JPanel();
		menuPanel.setLayout(new GridLayout(4, 1));
		setMenuButtons();
	}
	
	
	/////////////////////////////
	// 메인 레고판 
	JPanel mainPanel;
	JTextArea textArea;
	JPanel totalPanel;
	JTextField totalTextField;
	JButton totalButton;
	private void setMainPanel() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		setMainTextArea();
		mainPanel.add(textArea, BorderLayout.CENTER);
		
		setTotalPanel();
		mainPanel.add(totalPanel, BorderLayout.SOUTH);
	}
	private void setMainTextArea() {
		textArea = new JTextArea();

		textArea.setEditable(false);
	}
	private void setTotalPanel() {
		totalPanel = new JPanel();
		totalPanel.setLayout(new BorderLayout());
		totalTextField = new JTextField("TOTAL : 0원");
		totalTextField.setEditable(false);
		totalButton = new JButton("결제");
		totalButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				today += total;
				JOptionPane.showMessageDialog(mainPanel, total + "원 결제하였습니다.\n오늘 매출 " + today + "원");
				total = 0;
				textArea.setText("");
			}
		});
		totalPanel.add(totalTextField, BorderLayout.CENTER);
		totalPanel.add(totalButton, BorderLayout.EAST);
		
	}
	
	public Quiz01() {
		setNavPanel();
		setMenuPanel();
		setMainPanel();
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 600); 
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		frame.add(navPanel, BorderLayout.NORTH);
		frame.add(menuPanel, BorderLayout.WEST);
		frame.add(mainPanel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Quiz01();
	}
}
