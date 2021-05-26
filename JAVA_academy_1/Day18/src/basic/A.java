package basic;

public class A {
	public String pubStr = "나는 public~";
	protected String proStr = "나는 protected"; 
	String defStr = "나는 아무것도 안썼을 때";
	private String priStr = "나는 private~";
	
	public static void main(String[] args) {
		A test = new A();
		System.out.println(test.pubStr);
		System.out.println(test.proStr);
		System.out.println(test.defStr);
		System.out.println(test.priStr);
		// 클래스 내부에서는 모두 사용 가능
	}
}
