package basic2;

import basic.A;

public class C extends A{
	
	void aa() {
		System.out.println(pubStr);
		System.out.println(proStr);
//		System.out.println(defStr);
//		System.out.println(priStr);
//		A의 자식이 되는 경우, protected 사용 가능
	}
	
	public static void main(String[] args) {
		A test = new A();
		System.out.println(test.pubStr);
//		System.out.println(test.proStr);
//		System.out.println(test.defStr);
//		System.out.println(test.priStr);
		// 다른패키지에서는 public만 사용 가능
	}
}
