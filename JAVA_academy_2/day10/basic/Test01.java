package day10.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * < ���� >
 * - ���߻�Ȳ 
 * - runtime ���� (���� �� ����)
 * - Exception Ŭ�������� ��Ʈ Ŭ���� : java.lang.Exception Ŭ����
 * 
 * 
 * < try-catch >
 * try {
 * 
 * 		// ���ܰ� �߻��� (���ܰ�ü�� throw��) ���ɼ��� �ִ� �ڵ�
 * }
 * catch(����Ŭ����1 ������) {
 * 		// ���ܰ�ü1�� �߻����� �� ���� �ڵ�
 * }
 * catch(����Ŭ����2 ������) {
 * 		// ���ܰ�ü2�� �߻����� �� ���� �ڵ�
 * }
 * finally { // ���û���
 * 		// try ���� ���������� ������, ���ܰ� �߰��� �߻��ߵ� ������� ������ �������� ����
 * 		// ������ �۾� �뵵
 * }
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("����1:");
			n1 = sc.nextInt(); // InputMismatchException
			System.out.print("����2:");
			n2 = sc.nextInt(); // InputMismatchException
			System.out.println("�� : " + n1 / n2);// ArithmeticException
		} 
		/*catch(InputMismatchException e) {
			System.out.println("������ �Է��ϼž� �մϴ�.");
			e.printStackTrace();
		} 
		catch(ArithmeticException e) {
			System.out.println("0���� ���� ���� �����ϴ�.");
		} */
		catch(Exception e) {
			System.out.println("����ġ ���� ������ ������ϴ�.");
		}
		finally {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
}





