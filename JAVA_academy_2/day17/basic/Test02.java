package day17.basic;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * Server-client 통신
 * 
 *  
 */
public class Test02 { // 서버 프로그램
	public static void main(String[] args) {
		System.out.println("서버 실행...");
		System.out.println("클라이언트 기다리는 중...");
		ServerSocket sSocket = null;
		
		Socket clientSocket = null; // 클라이언트 측의 소켓 보관용
		
		
		// 클라이언트에게 데이터를 내보낼 outputStream
		BufferedWriter out = null;
		
		// 클라이언트로부터 데이터를 받을 inputStream
		BufferedReader in = null;
		
		Scanner sc = new Scanner(System.in);
		try {
			sSocket = new ServerSocket(3000);
			
			// 클라이언트 수신 대기 
			clientSocket = sSocket.accept();
			
			System.out.println("클라이언트 연결 성공!!!" + clientSocket.getInetAddress());
			out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			String fromClient = null;
			while( (fromClient = in.readLine()) != null ) {
				System.out.println("from client : " + fromClient);
				System.out.print("입력 : ");
				String s = sc.next();
				
				out.write(s);
				out.newLine();
				out.flush();
				System.out.println("클라이언트에게 반사 성공!!");
			}
			System.out.println("클라이언트와 연결 끊김..");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if( in != null ) {
					in.close();
				}
				if( out != null) {
					out.close();
				}
				if(sSocket != null) {
					sSocket.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}




