package basic;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * < ��� (Control statements) >
		 * - ���α׷� �帧�� �����ϴ� Ű����
		 * - ���ǹ� : if��, switch��
		 *   �ݺ��� : while��, do-while��, for��
		 *   �б⹮ : break, continue, return Ű����
		 *   
		 *   
		 * < if�� >
		 * - '���ǽ�'�� ����� True�� '���ӹ���'�� ���� 
		 *   False�� ���� ����
		 * - ����: 
		 *    if( ���ǽ� ) {
		 *    	���ӹ����...
		 *    }
		 *    
		 * - ����) ���ӹ����� 1���� {} ���� ����
		 */
		Scanner sc = new Scanner(System.in); 
		System.out.print("���� : ");
		int age = sc.nextInt();
		if(age >= 20) {
			System.out.println("�����Դϴ�.");
		} 
		
		else { // �׷��� ������ (¦�� if�� '���ǽ�'�� False�� �����϶�!)
			System.out.println("�̼����Դϴ�.");
		}
		
		if(age <= 7) { System.out.println("������ �Ƶ�"); }
		else if(age <= 13) { System.out.println("�ʵ��л�"); }
		else if(age <= 16) { System.out.println("���л�"); }
		else if(age <= 19) { System.out.println("����л�"); }
		else { System.out.println("���л� Ȥ�� ����"); }
		
		/*if(age <= 7) { 
			System.out.println("������ �Ƶ�"); 
		} 
		else {
			if(age <= 13) { 
				System.out.println("�ʵ��л�"); 
			}
			else {
				if(age <= 16) { 
					System.out.println("���л�"); 
				}
				else {
					if (age <= 19) {
						System.out.println("����л�");
					} else {
						System.out.println("���л� Ȥ�� ����");
					}
				}
			}
		}*/
		
	}
}




