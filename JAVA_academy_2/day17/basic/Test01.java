package day17.basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * < java.net >
 * 
 * - TCP : �ŷڼ� �������� 
 * 		- ����/Ŭ���̾�Ʈ�� ������ Ȯ���� �� �����͸� �����Ѵ�.
 *  	- ������ ��Ŷ ���� ���θ� Ȯ���� �� ���� ��Ŷ�� �����ϴ� ����̴�.
 *   	- ���� ��� / �ӵ� ����
 *   	- ��
 *   
 *   UDP : ��ŷڼ� �������� 
 * 		- ����Ȯ���� ���� �ʰ� �����͸� ������
 * 		- �������� ���� ���θ� Ȯ������ �ʴ´�.
 * 		- ���� ���� / �ӵ� ���� / �Ҿ���
 * 		- ��ȭ
 * 
 *  ���� IP : ��ܿ� ������ 
 *  �缳 IP : ��ũ��ũ ���γ����� ������
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			// local host : �� ��ǻ��
			
			System.out.println(address);
			
			InetAddress[] g = InetAddress.getAllByName("www.naver.com");
			for(InetAddress i : g) {
				System.out.println(i.getHostAddress());
				System.out.println(i.getHostName());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
}






