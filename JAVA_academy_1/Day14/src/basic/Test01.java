package basic;
/*
 * < Method >
 * = �Լ�
 * = ��ü�� �ൿ�ϴ� ���
 * - �ܾ� ���� () --> ������ �޼���!
 * - ���� �����
 *   ==> ������ �۾��� ���� �����ؾ� �� ��
 *   
 */
public class Test01 {
	public static void main(String[] args) {
		// ��ü�� '������ ������' �ż� �Ǹ� GC�� �̸� �Ҹ��Ų��.
		Pokemon p = new Pokemon();
				//  --------------
		p = new Pokemon();
		
		System.out.println(new Pokemon());
	}
}
