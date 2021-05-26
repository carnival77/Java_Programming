package day11.quiz;

import javax.swing.JOptionPane;

// 쓰레드1 : 3초 단위로 룰루랄라~~ 30번 출력 
// 쓰레드2 : 구구단 문제 1개를 jop으로 내고, 정답/땡 출력
// 쓰레드3 : 구구단 답을 입력 받을 때까지 1초..2초.. (sysout)
//           ==> 입력 받으면 멈춘다. + "총 XX초 소요!"
class Lullu implements Runnable {
	@Override
	public void run() {
		try {
			for(int i = 0; i < 30; ++i){
				Thread.sleep(3000);
				System.out.println("룰루랄라~~~~");
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
			JOptionPane.showMessageDialog(null, "정답!");
		} 
		else {
			JOptionPane.showMessageDialog(null, "땡!");
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
				System.out.println(++sec + "초");
			}
			System.out.println("총 " + sec  + "초 소요");
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
