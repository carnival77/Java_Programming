package day19.quiz.chatting.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.sound.sampled.ReverbType;

public class ClientReceiveThread extends Thread {
	private Socket c_socket; // �ڽ��� ����
	private ClientMain main;
	// ������ 
	public ClientReceiveThread(ClientMain main) {
		this.main = main;
		c_socket = main.cSoc; 
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
				if(receivedMessage != null) {
					System.out.println("���(����) : " + receivedMessage);
					main.textArea.append("���(����) : " + receivedMessage + "\n");
				}
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
