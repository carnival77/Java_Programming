package day19.quiz.chatting.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerSendThread extends Thread {
	private Socket c_socket; // ��� Ŭ���̾�Ʈ�� ����
	private ServerMain main;
	BufferedWriter bw;
	String message;

	// ������
	public ServerSendThread(ServerMain main) {
		this.main = main;
		c_socket = main.cSoc;
	}

	// run() �������̵�
	@Override
	public void run() {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(c_socket.getOutputStream()));
			while (true) {
				try { Thread.sleep(1); } catch(Exception e) {e.printStackTrace();}
				if(message != null) {
					System.out.println("Ŭ���̾�Ʈ���� �޽��� ������");
					bw.write(message); // Ŭ���̾�Ʈ ���Ͽ� ������
					bw.newLine();
					bw.flush();
					message = null;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("���� ����.. ");
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
