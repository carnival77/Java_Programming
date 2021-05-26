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
			System.out.println("Thread3�� ������..");
		}
	}
	
	private void doSomething2() {
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread3�� ������.. 1�ʴ���..");
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
		JOptionPane.showMessageDialog(null, "Ȯ�� ������ ������ ����");
		th.interrupt();
		
		System.out.println("������ ����!");
	}
}
