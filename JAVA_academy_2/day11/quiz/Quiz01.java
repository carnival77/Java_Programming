package day11.quiz;

import javax.swing.JOptionPane;

// ������1 : 3�� ������ ������~~ 30�� ��� 
// ������2 : ������ ���� 1���� jop���� ����, ����/�� ���
// ������3 : ������ ���� �Է� ���� ������ 1��..2��.. (sysout)
//           ==> �Է� ������ �����. + "�� XX�� �ҿ�!"
class Lullu implements Runnable {
	@Override
	public void run() {
		try {
			for(int i = 0; i < 30; ++i){
				Thread.sleep(3000);
				System.out.println("������~~~~");
			}
		} catch(Exception e) { }
	}
}
class Gugudan implements Runnable {
	@Override
	public void run() {
		int r1 = (int)(Math.random() * 8) + 2;
		int r2 = (int)(Math.random() * 8) + 2;
		
		GugudanTimer gt = new GugudanTimer();
		Thread th = new Thread(gt);
		th.start();
		
		int answer = Integer.parseInt(JOptionPane.showInputDialog(r1 + "X" + r2));
		gt.isRun = false;
		if(r1*r2 == answer) {
			JOptionPane.showMessageDialog(null, "����!");
		} 
		else {
			JOptionPane.showMessageDialog(null, "��!");
		}
		
	}
}
class GugudanTimer implements Runnable {
	int sec;
	boolean isRun = true;
	@Override
	public void run() {
		try {
			while(isRun) {
				Thread.sleep(1000);
				System.out.println(++sec + "��");
			}
			System.out.println("�� " + sec  + "�� �ҿ�");
		} catch(Exception e) { }
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Lullu());
		Thread th2 = new Thread(new Gugudan());
		
		th1.start();
		th2.start();
	}
}
