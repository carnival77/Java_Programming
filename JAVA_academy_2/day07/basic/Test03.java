package day07.basic;
/*
 * < Collection >
 * - �迭�� ��ü Ŭ���� (â�� Ŭ����) 
 *   ---
 *    ���� : 
 *    	1. ���� ���� : ������ ������ �� �� ��ȿ������ 
 *      2. ���� ���� : ���Ұ� �Ϸ� ��ġ�Ǿ�����--> �˻��� ���� �ɸ�
 *      3. ���� ���� : ���Ҹ� �߰��� ����/������ �� ������ --> ���Ḯ��Ʈ�� �ʿ�
 *      ==> �÷��� Ŭ�������� �پ��� �ڷᱸ���� ����, ���Ҹ� ���������� ������ �� �ִ�.
 * - ��� ���ҵ��� �⺻ �ڷ��� : Object (��� �ڷ��� ����)
 * - ���� 
 * 	1. List : �ε��� O, �ߺ� ���� O 
 *  2. Set : �ε��� X, �ߺ� ���� X 
 *  3. Map : K(Ű) - V(��) ������ ���Ҹ� ���� 
 *  		 Ű : �ߺ� X
 *   		 �� : Ű�� �ٸ��� �ߺ� O
 *   		--> Ű�� ���� ���� ã��
 *    
 */
import java.util.ArrayList;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // ArrayList â�� ��ü ����
		System.out.println(list);
		list.add(1); 
		list.add(true); 
		list.add(new Date());
		list.add("������"); 
		System.out.println(list);
	}
}




