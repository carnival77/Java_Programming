package day17.basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * < java.net >
 * 
 * - TCP : 신뢰성 프로토콜 
 * 		- 서버/클라이언트의 연결을 확인한 후 데이터를 전송한다.
 *  	- 상대방의 패킷 수신 여부를 확인한 후 다음 패킷을 전송하는 방식이다.
 *   	- 보안 우수 / 속도 느림
 *   	- 웹
 *   
 *   UDP : 비신뢰성 프로토콜 
 * 		- 연결확인을 하지 않고 데이터를 전송함
 * 		- 수신자의 수신 여부를 확인하지 않는다.
 * 		- 보안 낮음 / 속도 빠름 / 불안정
 * 		- 통화
 * 
 *  공인 IP : 대외용 아이피 
 *  사설 IP : 네크워크 내부끼리의 아이피
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			// local host : 내 컴퓨터
			
			System.out.println(address);
			
			InetAddress[] g = InetAddress.getAllByName("www.naver.com");
			for(InetAddress i : g) {
				System.out.println(i.getHostAddress());
				System.out.println(i.getHostName());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
}






