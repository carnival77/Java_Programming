package day12.basic;
/*
 * < java.io >
 * - Input Stream : �����͸� �鿩�� �� ����ϴ� ���
 *   Output Stream : �����͸� ������ �� ����ϴ� ���
 *   
 * - ��Ʈ���� Ư¡ 
 *  1) �ܹ��� ���� : ������ ������ ����
 *  2) QUEUE ���� : ���Լ��� ���� (���� ���� �����Ͱ� ���� ������)
 * - ��Ʈ���� ���� 
 *  1. ����Ʈ ��� ��Ʈ�� 
 *   ���� : 1byte ( byte�� ) 
 *   �뵵 : �׸�, ����, mp3 ���� �ؽ�Ʈ�� �ƴ� ��� ������ ������ 
 *   ��Ʈ Ŭ���� : InputStream, OutputStream 
 *   
 *  2. ���� ��� ��Ʈ��
 *   ���� : 2byte ( char�� )
 *   �뵵 : �޸���, ����, ä�� ���� �ؽ�Ʈ ������
 *   ��Ʈ Ŭ���� : Reader, Writer 
 */

import java.io.FileWriter;
import java.io.IOException;

public class Test05 {
	
	public static void main(String[] args) {
		try {
			// aa.txt�� ��ī��, ������, ���̸� �����ϱ�
			
			// 1. aa.txt �����ϱ� 
			FileWriter fw = new FileWriter("aa.txt");
			// ���� ������ �������� �������� ���, ������ �ڵ������ȴ�.(��½�Ʈ���� ����)
			
			// 2. ���� ���� 
			fw.write("��ī��\r\n");
			fw.write("������\r\n");
			fw.write("���̸�\r\n");
			
			// 3. ���� ���� �� ����
			fw.close();
			System.out.println("���� ���� �Ϸ�!");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}









