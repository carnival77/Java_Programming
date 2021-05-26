package day11.basic;

import javax.swing.JOptionPane;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작!");
		
		Timer t = new Timer(); // 스레드는 메인스레드 종료 여부와 상관없이 독립적으로 수행됨
		t.setDaemon(true); // 데몬스레드로 설정 (주스레드(여기선 메인쓰레드)의 보조스레드)
		t.start();
		
		JOptionPane.showMessageDialog(null, "ㅋㅋㅋ");
		System.out.println("프로그램 종료!");
	}
}
