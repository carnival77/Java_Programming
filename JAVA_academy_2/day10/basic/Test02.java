package day10.basic;
/*
 * ���� �޼���/������ ���� '�ݵ�� ����ó��'�ؾ� ����� �� �ִ�!
 * 
 * ����ó�� ���
 *  1. try - catch : �Ｎ���� ����ó��
 *  2. throws ���� (���ܴ�����) : ���� �ۼ����� �޼��带 ȣ���� ���� �޼��忡�� 
 *  						  try-catch �� ���� ����
 *  	: �޼���(������ ����)������ ������ �� �ִ�. 
 *        main()�� throws ���� ���� 
 *          ==> ���� Ÿ�ڰ� ����
 */
public class Test02 {
	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 10; i > 0; --i) {
			System.out.println(i + "��");
//			try {
//				Thread.sleep(1000); // 1�� ����
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
			Thread.sleep(1000); 
		}
		
	}
}
