package day06.basic;
/*
 * < java.lang.System Ŭ���� >
 * - �ü��(�ý���) ���� Ŭ����
 * 
 * - �ʵ� :  
 * 	1) in : cmd(�ܼ�)�� ����Ǿ��ִ� �Է� ��Ʈ��
 *  2) out : cmd�� ����Ǿ��ִ� ��� ��Ʈ��
 *  3) err : cmd�� ����Ǿ��ִ� ��� ��Ʈ��(���� �޽����� �������� ��� ���)
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println("��������"); // sysout
		System.err.println("��������"); // syserr
		
		long millis = System.currentTimeMillis();
		// 1970.1.1 ���� ~ ���ݱ��� ����� �и��ʸ� long���� �˷���
		System.out.println(millis);
		
		for(int i = 0; i < 1000000; ++i) {
			System.out.println(i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-millis + "�и���");
	}
}










