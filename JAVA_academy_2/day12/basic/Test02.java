package day12.basic;
class MyThread2 implements Runnable {
	String s; 
	public MyThread2(String str) {
		s = str;
	}
	public void run() {
		for(int i = 1; i <= 1000; ++i) {
			System.out.print(s);
			if(i%10 == 0)
				System.out.println();
		}
	};
}
public class Test02 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new MyThread2("@"));
		Thread th2 = new Thread(new MyThread2("#"));
		th1.setPriority(1);
		th2.setPriority(10);
		System.out.println("th1의 우선순위 : " + th1.getPriority());
		System.out.println("th2의 우선순위 : " + th2.getPriority());
		th1.start();
		th2.start();
	}
}
