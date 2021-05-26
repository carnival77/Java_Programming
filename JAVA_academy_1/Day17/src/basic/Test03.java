package basic;

import javax.swing.JOptionPane;

/*
 * < static >
 * - ������, ������
 * - 1. ������ ���������. (new ���� ����� �� �ִ�.)
 * 		: Ŭ���� �ε� �� ���������. 
 * 			** Ŭ���� �ε��? ==> ���α׷��� �ʿ��� Ŭ�������� RAM�� �����ϴ� �� 
 * 				(Ŭ���� �ε尡 ������ main()�� ���۵�)
 * 		: static���� ����� ����/�޼ҵ�� ���α׷� ���� ���� ���������.
 * 
 * 	 2. 1���� ���������. (��ü�� 100������ static ����� 1���� �ִ�)
 * 	 3. 'Ŭ������.�����'���� �����Ѵ�.
 * 				-----
 * 				static�� ���
 */
class MyMath {
	static double getCircleArea(int r) {
		return r * r * 3.14;
	}
}
public class Test03 {
	public static void main(String[] args) {
		//MyMath mm = new MyMath();	
		//System.out.println(mm.getCircleArea(10));
		
		// getCircleArea()�� static���� �����ϸ� new�� ���ص���
		System.out.println(MyMath.getCircleArea(10));
		
		Math.random();
		JOptionPane.showMessageDialog(null, "����");
		Integer.parseInt("10");
		// ���� �ִ� random(), showM..(), parseInt(), out�� static���� ����Ǿ�����
		// ==> new ���� ����� �� �־��� ����
	}
}







