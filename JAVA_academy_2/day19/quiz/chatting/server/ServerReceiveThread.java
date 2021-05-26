package day19.quiz.chatting.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerReceiveThread extends Thread {
	
	private ServerMain main;
	
	private Socket c_socket; // ��� Ŭ���̾�Ʈ�� ����

	// ������
	public ServerReceiveThread(ServerMain main) {
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

			while (true) {
				receivedMessage = br.readLine();
				if (receivedMessage == null) {
					main.textArea.append("���(Ŭ���̾�Ʈ)�� ������ �����Ͽ����ϴ�.\n");
					break;
				}
				main.textArea.append("���(Ŭ���̾�Ʈ) : " + receivedMessage + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("���� ����.. ");
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
