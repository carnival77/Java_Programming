package day12.basic;

public class Test04 {
	public static void main(String[] args) {
		MyThread3 th = new MyThread3();
		th.start();
		
		try {
			th.join(3000); // 3000밀리초 동안 main스레드를 일시정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th.interrupt();
		System.out.println("메인쓰레드 종료!!");
		
		Object o = 1;
	}
}
