package basic;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
		// 출력 : sysout
		// 입력 : sc.nextInt() 
		// --> 콘솔 입출력
		
		// 'jop' + ctrl + sp 
		// .showm
		JOptionPane.showMessageDialog(null, "ㅋㅋㅋㅋㅋㅋ");
		// ==> 메시지 출력용 다이얼로그
		
		String input = JOptionPane.showInputDialog(null, "나이를 입력하세요."); 
		System.out.println(input + "살");
		JOptionPane.showMessageDialog(null, "당신은 " + input + "세입니다.");
		// 입력된 나이가 "성인" 인지, "미성년"인지 출력
		
		// System.out.println( ((int)input) >= 20 ? "성인" : "미성년" );
		// String형은 형변환(casting) 대신 parsing을 해야 한다.
		// Parsing(구문분석) 
		//  : String을 정수, 실수, boolean 등으로 변환 
		
		int age = Integer.parseInt( input ); 
		// input의 값을 int형으로 변환하여 그 결과를 age에 저장 
		System.out.println( age >= 20 ? "성인" : "미성년" );
		
	}
}







