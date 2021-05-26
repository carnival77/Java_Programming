package day03.basic;

class Mouse implements Hardware { // Hardware 구현클래스
	@Override
	public void connect() {
		System.out.println("마우스 연결되었음");
	}
	@Override
	public void run() {
		System.out.println("마우스 포인터가 움직인당..");
	}
}
class Monitor implements Hardware {
	public void connect() {
		System.out.println("모니터 연결 성공");
	}
	public void run() {
		System.out.println("최고가 : " + MAX_PRICE);
		System.out.println("화면 켜졌다!");
	}
}
public class Test02 {
	public static void main(String[] args) {
		Hardware h1, h2;
		h1 = new Mouse();
		h2 = new Monitor();
		
		h1.connect();
		h2.connect();
		
		h1.run();
		h2.run();
		
		Hardware h3 = new Hardware() {
			
			@Override
			public void run() {
				System.out.println("ㅋㅋㅋ");
			}
			
			@Override
			public void connect() {
				System.out.println("ㅎㅎㅎ");
			}
		};
		h3.connect();
		h3.info();
		System.out.println("장치 최저가 : " + Hardware.MIN_PRICE);
		System.out.println("장치 최고가 : " + Hardware.MAX_PRICE);
		Hardware.showPolicy();
	}
}


