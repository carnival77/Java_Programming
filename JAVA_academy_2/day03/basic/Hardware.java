package day03.basic;

/*
 * < �������̽� ���� >
 * (public) interface �������̽��� {
 * 		// ����� ���� ��� (public static final)
 * 		// �߻�޼���, static �޼���, default �޼��带 �����Ѵ�.
 *		// �Ϲݸ޼��峪 ������ ������ �� ����.  
 * }
 * 
 */
public interface Hardware {
	/*public static final*/int MAX_PRICE = 1000000;
	int MIN_PRICE = 2000;
	/*public abstract*/void run();
	void connect();
	
	default void info() { // Hardward�� �ڽ� Ŭ������ 
						  // info()�� �������̵带 �ص� �ǰ� ���ص� ��
		System.out.println("�̰��� �ϵ�����Դϴ�.");
	}
	
	static void showPolicy() {
		System.out.println("�ְ��� " + MAX_PRICE +"���̸�,");
		System.out.println("�������� " + MIN_PRICE + "���Դϴ�.");
	}
}





