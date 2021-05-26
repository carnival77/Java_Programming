package day06.quiz;

import javax.swing.JOptionPane;

public class Quiz01 {
	public static void main(String[] args) {
		String log = "";
		String input;
		while(true) {
			input = JOptionPane.showInputDialog("아무거나 입력(종료는exit)");
			if("exit".equalsIgnoreCase(input)) {
				break;
			}
			log += input + "\n";
		}
		System.out.println(log);
		// 1. 띄어쓰기, 줄바꿈기호를 제외한 전체 문자의 개수
		// String s = log.replace(" ", ""); 
		// s = s.replace("\n", "");
		String s = log.replaceAll(" |\n", "");
		//System.out.println(s);
		System.out.println(s.length() + "문자");
		
		// 2. 'a' 의 개수 
//		char[] ch = log.toCharArray();
//		int count = 0;
//		for(char c : ch) {
//			if(c == 'a' || c == 'A') {
//				count++;
//			}
//		}
		s = log.replaceAll("[^a,A]", "");
		//System.out.println(s);
		System.out.println(s.length() + "문자");
		
		// 3. 단어의 개수
		String[] sArr = log.split(" |\n");
		System.out.println("단어 개수 : " + sArr.length);
		
		// 4. 문장에 "abc"가 있는지 확인
		System.out.println("abc 있음 ? " + log.contains("abc"));
		
		// Quiz02
		// 1. 주민번호 앞자리 + 성별 입력 받기  ( 880123 + 1)
		// 2. 7 글자인지 확인
		// 3. 나이 생년월일
		String id = JOptionPane.showInputDialog("생년월일, 성별(YYMMDDG)");
		if(id != null) {
			id = id.trim();
			if(id.length() == 7) {
				int year = Integer.parseInt(id.substring(0, 2)); 
				int month = Integer.parseInt(id.substring(2, 4));
				int date = Integer.parseInt(id.substring(4, 6));
				// int gender = Integer.parseInt(id.substring(6, 7));
				int gender = id.charAt(6) - 48;
				String g = gender==1||gender==3 ? "남성" : "여성"; 
				year += gender==1||gender==2 ? 1900 : 2000;
				String message = "Year : " + year + "\n"
								+ "Month : " + month + "\n"
								+ "Date : " + date + "\n"
								+ "Gender : " + g;
				JOptionPane.showMessageDialog(null, message);
			}
			else {
				JOptionPane.showMessageDialog(null, "7글자를 입력하세요.");
			}
		}
	}
}




