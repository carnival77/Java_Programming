package day18.basic.server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		ServerSocket sSoc = null;
		Socket cSoc = null;
		try {
			sSoc = new ServerSocket(3000);
			
			System.out.println("Ŭ���̾�Ʈ�� ��ٸ��� �ֽ��ϴ�");
			cSoc = sSoc.accept();
			System.out.println("Ŭ���̾�Ʈ ���� ����!!");
			
			// �ۼ��� ������ ����
			new ServerSendThread(cSoc).start();
			new ServerReceiveThread(cSoc).start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
