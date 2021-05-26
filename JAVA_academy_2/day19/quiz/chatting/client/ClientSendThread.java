package day19.quiz.chatting.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientSendThread extends Thread{
	private Socket c_socket; // Ŭ���̾�Ʈ �ڽ��� ����
	private ClientMain main;
	String message;
	// ������ 
	public ClientSendThread(ClientMain main) {
		this.main = main;
		c_socket = main.cSoc;
	}
	
	// run() �������̵�
	@Override
	public void run() {
		BufferedReader br = null; // Ŭ���̾�Ʈ ����� �Է��� Scanner ���
		BufferedWriter bw = null; // c_socket ���� ���� �� �� ��Ʈ��
		try {
			bw = new BufferedWriter(new OutputStreamWriter(c_socket.getOutputStream()));
			
			while(true) {
				try { Thread.sleep(1); } catch(Exception e) {e.printStackTrace();}
				if(message != null) {
					bw.write(message); // Ŭ���̾�Ʈ ���Ͽ� ������
					bw.newLine();
					bw.flush();
					message = null;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ŭ���̾�Ʈ ����.. ");
			try {
				if(bw != null) { bw.close(); }
				if(br != null) { br.close(); }
			} catch(Exception e) { 
				e.printStackTrace();
			}
		}
	}
}
