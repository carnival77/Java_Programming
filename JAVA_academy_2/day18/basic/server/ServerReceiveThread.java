package day18.basic.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerReceiveThread extends Thread {
	private Socket c_socket; // ��� Ŭ���̾�Ʈ�� ����

	// ������
	public ServerReceiveThread(Socket s) {
		c_socket = s;
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
					System.out.println("Ŭ���̾�Ʈ�� ������ �����Ͽ����ϴ�.");
					break;
				}
				System.out.println("���(Ŭ���̾�Ʈ) : " + receivedMessage);
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
