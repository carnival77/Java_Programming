package basic;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
		// 窒径 : sysout
		// 脊径 : sc.nextInt() 
		// --> 嬬車 脊窒径
		
		// 'jop' + ctrl + sp 
		// .showm
		JOptionPane.showMessageDialog(null, "せせせせせせ");
		// ==> 五獣走 窒径遂 陥戚杖稽益
		
		String input = JOptionPane.showInputDialog(null, "蟹戚研 脊径馬室推."); 
		System.out.println(input + "詞");
		JOptionPane.showMessageDialog(null, "雁重精 " + input + "室脊艦陥.");
		// 脊径吉 蟹戚亜 "失昔" 昔走, "耕失鰍"昔走 窒径
		
		// System.out.println( ((int)input) >= 20 ? "失昔" : "耕失鰍" );
		// String莫精 莫痕発(casting) 企重 parsing聖 背醤 廃陥.
		// Parsing(姥庚歳汐) 
		//  : String聖 舛呪, 叔呪, boolean 去生稽 痕発 
		
		int age = Integer.parseInt( input ); 
		// input税 葵聖 int莫生稽 痕発馬食 益 衣引研 age拭 煽舌 
		System.out.println( age >= 20 ? "失昔" : "耕失鰍" );
		
	}
}







