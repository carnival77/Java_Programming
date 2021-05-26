package day11.basic;

import javax.swing.JOptionPane;

/*
 * < Thread >
 * - 실
 * - 하나의 프로세스(프로그램)가 처리하는 작업의 단위
 * - single-thread : <== 여태 우리가 했던 거 
 *   multi-thread : <== 여러 스레드를 동시에 병렬 처리하는 것
 *   
 * < Thread 추가 방법 1 > : java.lang.Thread 클래스를 extends
 *  1. Thread의 자식 클래스를 만든다.
 *  2. Thread로부터 물려받은 run() 오버라이드
 *     ==> 쓰레드가 해야 할 일
 *  3. Thread 객체를 생성 후(new), 쓰레드를 추가해야할 시점에 start()를 호출한다.  
 * 
 * < Thread 추가 방법 2 > : java.lang.Runnable 인터페이스를 implements
 * 
 * 
 */
class Timer extends Thread {
	
	public void run() {
		for(int i = 10; i >= 0; --i) {
			System.out.println(i + "초");
			
			try {
				Thread.sleep(1000); // 1초 대기
			} catch(Exception e) { } 
		}
	};
	
}

class Timer2 implements Runnable {
	@Override
	public void run() {
		for(int i = 10; i >= 0; --i) {
			System.out.println(i + "초 (timer2)");
			try {
				Thread.sleep(1000); // 1초 대기
			} catch(Exception e) { } 
		}
	}
}

public class Test01 {
	public static void main(String[] args) {
		// 10초 카운트 다운  + jop 아무거나 입력 -> 출력 
		
		// Thread 상속 받음 
		Timer t = new Timer();
		t.start();
		
		// Runnable 상속 받음
		Timer2 t2 = new Timer2();
		Thread th2 = new Thread(t2); // new Thread(Runnable )
		th2.start();
		
		String s = JOptionPane.showInputDialog("아무거나");
		JOptionPane.showMessageDialog(null, s);
		
	}
}


