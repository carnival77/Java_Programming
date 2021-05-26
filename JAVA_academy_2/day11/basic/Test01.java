package day11.basic;

import javax.swing.JOptionPane;

/*
 * < Thread >
 * - ��
 * - �ϳ��� ���μ���(���α׷�)�� ó���ϴ� �۾��� ����
 * - single-thread : <== ���� �츮�� �ߴ� �� 
 *   multi-thread : <== ���� �����带 ���ÿ� ���� ó���ϴ� ��
 *   
 * < Thread �߰� ��� 1 > : java.lang.Thread Ŭ������ extends
 *  1. Thread�� �ڽ� Ŭ������ �����.
 *  2. Thread�κ��� �������� run() �������̵�
 *     ==> �����尡 �ؾ� �� ��
 *  3. Thread ��ü�� ���� ��(new), �����带 �߰��ؾ��� ������ start()�� ȣ���Ѵ�.  
 * 
 * < Thread �߰� ��� 2 > : java.lang.Runnable �������̽��� implements
 * 
 * 
 */
class Timer extends Thread {
	
	public void run() {
		for(int i = 10; i >= 0; --i) {
			System.out.println(i + "��");
			
			try {
				Thread.sleep(1000); // 1�� ���
			} catch(Exception e) { } 
		}
	};
	
}

class Timer2 implements Runnable {
	@Override
	public void run() {
		for(int i = 10; i >= 0; --i) {
			System.out.println(i + "�� (timer2)");
			try {
				Thread.sleep(1000); // 1�� ���
			} catch(Exception e) { } 
		}
	}
}

public class Test01 {
	public static void main(String[] args) {
		// 10�� ī��Ʈ �ٿ�  + jop �ƹ��ų� �Է� -> ��� 
		
		// Thread ��� ���� 
		Timer t = new Timer();
		t.start();
		
		// Runnable ��� ����
		Timer2 t2 = new Timer2();
		Thread th2 = new Thread(t2); // new Thread(Runnable )
		th2.start();
		
		String s = JOptionPane.showInputDialog("�ƹ��ų�");
		JOptionPane.showMessageDialog(null, s);
		
	}
}


