package day12.quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Quiz01 {
	public static void main(String[] args) {
		// 사용자가 exit를 입력할 때 까지 jop으로 문자열을 계속 입력 받음
		// 입력된 결과를 log.txt에 저장
		// 매 문장 앞에 시간을 기록
		
		// SimpleDateFormat 클래스
		// System.currentTimeMillis() 
		//SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		//String s = sdf.format(System.currentTimeMillis());
		
		StringBuffer log = new StringBuffer();
		String tmp;
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		FileWriter fw = null;
		
		while(true) {
			tmp = JOptionPane.showInputDialog("아무거나(종료는 exit)");
			if("exit".equalsIgnoreCase(tmp)) {
				break;
			}
			log.append(sdf.format(System.currentTimeMillis()) + ">>" + tmp + "\r\n");
		}
		
		try {
			fw = new FileWriter("C:/Users\\PC\\Desktop\\log.txt");
			fw.write(log.toString());
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
