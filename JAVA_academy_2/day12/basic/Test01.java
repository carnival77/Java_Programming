package day12.basic;
class Sample {
	static int i;
	synchronized static void test(String tag) {
		for(i = 0; i <= 20; ++i) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
			System.out.println(tag + "�� ����, i :" + i);
		}
	}
}
class MyThread implements Runnable {
	String tag;
	public void run() {
		Sample.test(tag);
	}
} 
public class Test01 {
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		m1.tag = "������1"; 
		MyThread m2 = new MyThread();
		m2.tag = "������2"; 
		
		new Thread(m1).start();
		new Thread(m2).start();
	}
}
