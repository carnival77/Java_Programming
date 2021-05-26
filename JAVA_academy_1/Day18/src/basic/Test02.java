package basic;

//import basic2.Book;
import basic2.*; // basic2�� ��� Ŭ����(*)

/*
 * < ��Ű�� > 
 * - Ŭ�������� ����ִ� ���丮
 * - all �ҹ��ڷ� ǥ�� 
 * - Ŭ���� �ߺ��� ����
 * - ��� Ŭ������ �Ҽ� ��Ű���� �־�� �Ѵ�.
 * 
 *  --> basic.Test01
 *  	basic.Person
 *  	java.lang.String
 *  
 * < ���������� / ���������� (access modifiers) >
 * 
 * 					�ٸ���Ű��		������Ű�� �ٸ�Ŭ����		Ŭ��������
 * 1. public  			O			O					O
 * 2. protected			X(�ڽ���O)	O					O
 * 3. 					X			O					O
 * 4. private 			X			X					O
 * 
 *  1. public 
 *  	- ��ΰ� ���� ����
 *  	- Ŭ����, �޼ҵ�, ������� 
 *  2. protected 
 *  	- �ڽ�Ŭ������ ������ �ܺ� ��Ű���� Ŭ������ ���� �Ұ� 
 *  	- ���� ��Ű���� Ŭ�������� ���� ���� 
 *  	- �޼ҵ�, �������
 *  3. 
 *  	- default ���������� Ȥ�� package ���������� 
 *  	- ���� ��Ű�� �ȿ����� ���� ����
 *  	- Ŭ����, �޼ҵ�, �������
 *  4. private 
 *  	- Ŭ���� ���ο����� ��밡��
 *  	- �ٸ� Ŭ�������� �Ⱥ�����!
 *  	- �޼ҵ�, �������
 *  
 *  ************************ �߿�! ************************
 *  �������(�ʵ�)�� private ���� �����ϰ� 
 *  �׵��� getter, setter�� �����.
 *  ******************************************************
 */
public class Test02 {
	public static void main(java.lang.String[] args) {
	//	Book bk1 = new Book(); 
	//   �ٸ� ��Ű���� Ŭ������ ����ϴ� ��� 2����
	// ��� 1. ��Ű�� ��ü�̸� ����
		basic2.Book bk1 = new basic2.Book();
		
	// ��� 2. import ����
		Book bk2 = new Book();
		bk2.title = "�ڹ��� ����"; 
		// The field Book.title is not visible
		
	}
}








