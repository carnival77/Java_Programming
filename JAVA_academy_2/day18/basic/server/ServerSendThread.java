package day18.basic.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerSendThread extends Thread{
	private Socket c_socket; // ��� Ŭ���̾�Ʈ�� ����
	
	// ������ 
	public ServerSendThread(Socket s) {
		c_socket = s; 
	}
	
	// run() �������̵�
	@Override
	public void run() {
		BufferedReader br = null; // ���� ����� �Է��� Scanner ���
		BufferedWriter bw = null; // c_socket ���� ���� �� �� ��Ʈ��
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(c_socket.getOutputStream()));
			
			String sendMessage;
			
			while(true) {
				System.out.print("��(����) : ");
				sendMessage = br.readLine(); // ���� ������� �Է� �ޱ�
				bw.write(sendMessage); // Ŭ���̾�Ʈ ���Ͽ� ������
				bw.newLine();
				bw.flush();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("���� ����.. ");
			try {
				if(bw != null) { bw.close(); }
				if(br != null) { br.close(); }
			} catch(Exception e) { 
				e.printStackTrace();
			}
		}
	}
}




