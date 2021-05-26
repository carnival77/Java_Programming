package day12.basic;

import javax.swing.JOptionPane;

class MyThread3 extends Thread {
	@Override
	public void run() {
		// doSomething();
		doSomething2();
	}
	
	private void doSomething() {
		while(!isInterrupted()) {
			System.out.println("Thread3이 실행중..");
		}
	}
	
	private void doSomething2() {
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread3이 실행중.. 1초단위..");
			} catch(InterruptedException e) {
				break;
			}
		}
	}
}
public class Test03 {
	public static void main(String[] args) throws Exception{
		MyThread3 th = new MyThread3();
		th.start();
		JOptionPane.showMessageDialog(null, "확인 누르면 스레드 종료");
		th.interrupt();
		
		System.out.println("스레드 종료!");
	}
}
