package day05.basic;
/*
 * < static >
 * - ������ ���������, 1���� ���������!
 *   Ŭ�����ε��� �� �̸� �����صΰ�
 *   ��ü���� ������ �ִ� ���� �ƴ϶�, static ������ 1���� ���������.
 * - static �޼ҵ� �ȿ��� static ����� ��� ����
 */
class Sample {
	String insStr = "���� �ν��Ͻ� ���"; 
	static String stsStr = "���� Ŭ���� ���";
	
	// static ��� = Ŭ���� ��� (Ŭ���� �ε� �� ����)
	// non-static ��� = �ν��Ͻ� ��� (�ν��Ͻ� ���� �� ����)
	
	void insMthd() { // �ν��Ͻ� ���
		System.out.println(insStr);
		System.out.println(stsStr);
	}
	
	static void stsMthd() { // Ŭ���� ���
		//System.out.println(insStr); // ����!
		System.out.println(stsStr);
		// static �޼ҵ�� non-static ������� �ռ� ���������.
		// ���� �������� ���� non-static�� ����� �� ����.
	}
}
public class Test01 {
	static void aa() {
		
	}
	void bb() {
		
	}
	public static void main(String[] args) {
		aa();
		
		Test01 t = new Test01();
		t.bb();
	}
}



