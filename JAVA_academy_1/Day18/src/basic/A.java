package basic;

public class A {
	public String pubStr = "���� public~";
	protected String proStr = "���� protected"; 
	String defStr = "���� �ƹ��͵� �Ƚ��� ��";
	private String priStr = "���� private~";
	
	public static void main(String[] args) {
		A test = new A();
		System.out.println(test.pubStr);
		System.out.println(test.proStr);
		System.out.println(test.defStr);
		System.out.println(test.priStr);
		// Ŭ���� ���ο����� ��� ��� ����
	}
}
