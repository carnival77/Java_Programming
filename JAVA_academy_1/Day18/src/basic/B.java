package basic;

public class B {
	public static void main(String[] args) {
		A test = new A();
		System.out.println(test.pubStr);
		System.out.println(test.proStr);
		System.out.println(test.defStr);
		// System.out.println(test.priStr);
		// 같은 패키지, 다른 클래스의 경우, private 은 안보임
		
	}
}
