/*
 * < �ڷ��� >
 * -> �����͵��� ����
 * 
 * �ڹ��� �ڷ����� 2���� 
 * 1. �����ڷ��� 
 * 2. �����ڷ��� (<- ���߿� ���)
 * 
 * < ���� �ڷ��� >
 * -> ����, �Ǽ�, ����, ���� 8���� �ڷ���
 * 
 *  1. ������
 *  	1) byte�� (1���� byte�� �����ʹ� 1byte)
 *  	2) short�� (2byte)
 *  	3) int�� (4byte) ==> �ڵ� ���� ��� ���� ��� int��
 *  	4) long�� (8byte)
 *  
 *  2. �Ǽ��� 
 *  	1) float�� (4byte)
 *  	2) double��(8byte) ==> �ڵ� ���� ��� �Ǽ� ��� double��
 *  
 *  3. ������ 
 *  	char�� (2byte)
 *     		=>���Ϲ����� �ڷ���
 *   	����) String�� : ���ڿ��� (�����ڷ��� �ƴ�)
 *   
 *  4. ���� (��/������)
 *  	boolean (1byte)
 *  		=> true, false ����� �ִ�.
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println(10000000000L);
		// int�� �ƴ� long���� ó����! 
		System.out.println(true); // ���ڿ����� �ƴ� boolean����
		
		System.out.println(1 + 1);
		System.out.println(1.0 + 1);
		System.out.println('1' + 1);
		System.out.println("1" + 1);
		// ��� ���� 1�ϱ�?
	}
}












