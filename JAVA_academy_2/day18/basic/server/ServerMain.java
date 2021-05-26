package day18.basic.server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		ServerSocket sSoc = null;
		Socket cSoc = null;
		try {
			sSoc = new ServerSocket(3000);
			
			System.out.println("클라이언트를 기다리고 있습니당");
			cSoc = sSoc.accept();
			System.out.println("클라이언트 연결 성공!!");
			
			// 송수신 스레드 실행
			new ServerSendThread(cSoc).start();
			new ServerReceiveThread(cSoc).start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
