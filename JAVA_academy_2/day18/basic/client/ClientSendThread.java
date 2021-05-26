package day18.basic.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientSendThread extends Thread{
	private Socket c_socket; // Ŭ���̾�Ʈ �ڽ��� ����
	
	// ������ 
	public ClientSendThread(Socket s) {
		c_socket = s; 
	}
	
	// run() �������̵�
	@Override
	public void run() {
		BufferedReader br = null; // Ŭ���̾�Ʈ ����� �Է��� Scanner ���
		BufferedWriter bw = null; // c_socket ���� ���� �� �� ��Ʈ��
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(c_socket.getOutputStream()));
			
			String sendMessage;
			
			System.out.println("����� exit�� �Է��ϼ���..");
			while(true) {
				
				System.out.print("��(Ŭ���̾�Ʈ) : ");
				sendMessage = br.readLine(); // Ŭ���̾�Ʈ ������� �Է� �ޱ�
				if(sendMessage.equals("exit")) {
					break;
				}
				bw.write(sendMessage); // Ŭ���̾�Ʈ ���Ͽ� ������
				bw.newLine();
				bw.flush();
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
