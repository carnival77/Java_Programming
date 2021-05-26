package day18.basic.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientSendThread extends Thread{
	private Socket c_socket; // 클라이언트 자신의 소켓
	
	// 생성자 
	public ClientSendThread(Socket s) {
		c_socket = s; 
	}
	
	// run() 오버라이드
	@Override
	public void run() {
		BufferedReader br = null; // 클라이언트 사람이 입력할 Scanner 대용
		BufferedWriter bw = null; // c_socket 측에 보낼 때 쓸 스트림
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(c_socket.getOutputStream()));
			
			String sendMessage;
			
			System.out.println("종료는 exit를 입력하세요..");
			while(true) {
				
				System.out.print("나(클라이언트) : ");
				sendMessage = br.readLine(); // 클라이언트 사람에게 입력 받기
				if(sendMessage.equals("exit")) {
					break;
				}
				bw.write(sendMessage); // 클라이언트 소켓에 보내기
				bw.newLine();
				bw.flush();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("클라이언트 종료.. ");
			try {
				if(bw != null) { bw.close(); }
				if(br != null) { br.close(); }
			} catch(Exception e) { 
				e.printStackTrace();
			}
		}
	}
}
