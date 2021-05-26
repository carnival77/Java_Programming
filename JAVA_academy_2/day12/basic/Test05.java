package day12.basic;
/*
 * < java.io >
 * - Input Stream : 데이터를 들여올 때 사용하는 통로
 *   Output Stream : 데이터를 내보낼 때 사용하는 통로
 *   
 * - 스트림의 특징 
 *  1) 단방향 구조 : 방향이 정해져 있음
 *  2) QUEUE 구조 : 선입선출 구조 (먼저 들어온 데이터가 먼저 나간다)
 * - 스트림의 종류 
 *  1. 바이트 기반 스트림 
 *   단위 : 1byte ( byte형 ) 
 *   용도 : 그림, 파일, mp3 등의 텍스트가 아닌 모든 형태의 데이터 
 *   루트 클래스 : InputStream, OutputStream 
 *   
 *  2. 문자 기반 스트림
 *   단위 : 2byte ( char형 )
 *   용도 : 메모장, 메일, 채팅 등의 텍스트 데이터
 *   루트 클래스 : Reader, Writer 
 */

import java.io.FileWriter;
import java.io.IOException;

public class Test05 {
	
	public static void main(String[] args) {
		try {
			// aa.txt에 피카츄, 라이츄, 파이리 저장하기
			
			// 1. aa.txt 생성하기 
			FileWriter fw = new FileWriter("aa.txt");
			// 없는 파일을 목적지로 지정했을 경우, 파일은 자동생성된다.(출력스트림에 한함)
			
			// 2. 내용 쓰기 
			fw.write("피카츄\r\n");
			fw.write("라이츄\r\n");
			fw.write("파이리\r\n");
			
			// 3. 파일 저장 후 종료
			fw.close();
			System.out.println("파일 저장 완료!");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}









