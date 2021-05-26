package day18.basic.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiveThread extends Thread {
	private Socket c_socket; // �ڽ��� ����
	
	// ������ 
	public ClientReceiveThread(Socket s) {
		c_socket = s; 
	}
	
	// run() �������̵�
	@Override
	public void run() {
		BufferedReader br = null; // Ŭ���̾�Ʈ�κ��� �޽����� ���� ��Ʈ��
		
		try {
			br = new BufferedReader(new InputStreamReader(c_socket.getInputStream()));
			
			String receivedMessage;
			
			while(true) {
				receivedMessage = br.readLine();
				System.out.println("���(����) : " + receivedMessage);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ŭ���̾�Ʈ ����.. ");
			try {
				if(br != null) { br.close(); }
			} catch(Exception e) { 
				e.printStackTrace();
			}
		}
	}
}
