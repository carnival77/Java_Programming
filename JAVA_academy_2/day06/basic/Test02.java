package day06.basic;
/*
 * < java.lang.String >
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		//String s = "ABC"; 
		char[] ch = {'A', 'B', 'C'} ;
		String s = new String(ch); 
		
		String s1 = null; // 梓端 蒸製
		String s2 = "";   // 梓端 赤製
		
		// System.out.println( s1.equals("ABC") ); // 拭君!
		System.out.println("ABC".equals(s1)); // 拭君 照害
		System.out.println( s2.equals("ABC") );
		
		// 1. char charAt(int index) 
		// : index腰 庚切研 char莫生稽 鋼発 
		char c1 = "ABCDEF".charAt(3); 
		System.out.println(c1); // D
		
		// 2. boolean contains(String another)
		// : 庚切伸拭 another亜 赤艦? 
		s1 = "五荊五荊~~ せせせせせ"; 
		System.out.println(s1.contains("せせせ")); // true
		
		String email = "issell@naver.com"; 
		
		// 3. boolean endsWith(String word) : word稽 魁蟹艦?
		//    boolean startsWith(String word) : word稽 獣拙馬艦?
		System.out.println(email.endsWith(".com")); // true
		System.out.println(email.startsWith("naver")); // false
		
		
		// 4. boolean equals(String another)
		System.out.println("ABC".equals("abc")); // false
		System.out.println("ABC".equalsIgnoreCase("abc"));// true
		
		// 5. static String format(String 辞縦庚切, 昔切葵 焼巷暗蟹..)
		String str1 = String.format("%.2f %.3f", 3.333333, 1.1234567);
		System.out.println(str1); // 3.33 1.123
		
		// 6. int indexOf(String word) : word亜 護 腰 庚切採斗 獣拙馬艦? (蒸生檎 -1)
		System.out.println(email.indexOf("@")); // 6
		
		String str2 = "java-A, java-B, java-C"; 
		System.out.println(str2.indexOf("java")); // 0
		System.out.println(str2.indexOf("java", 10)); // 16
		System.out.println(str2.lastIndexOf("java")); // 16
		
		// 7. boolean isEmpty() : "" 戚艦?
		// 8. int length() : 越切 鯵呪
		System.out.println(str2.length()); // 22
		
		// 9. String replace(oldWord, newWord)
		System.out.println("企端 穿 : " + str2);
		String str3 = str2.replace("java", "android");
		System.out.println("企端 板 : " + str3);
		
		String str4 = "aweiuo12312せせせasidjlqwi1123";
		// 硝督昏 薦暗馬奄
		str4 = str4.replaceAll("[a-zA-Z]", "");
		System.out.println(str4);
		
		String str5 = "1せせせ 2けけいし 3げじぇげ 4いしぐ"; 
		String[] sArr = str5.split("[0-9]");
		System.out.println(sArr[0]);
		System.out.println(sArr[1]);
		System.out.println(sArr[2]);
		System.out.println(sArr[3]);
		
		// 10. String substring(int 獣拙昔畿什)
		//     String substring(int 獣拙昔畿什, int 魁昔畿什)
		String str6 = "01234567"; 
		System.out.println(str6.substring(3)); //34567
		System.out.println(str6.substring(5, 7));//56
		
		// 11. chat[] toCharArray() 
		char[] chArr = str4.toCharArray();
		for(char c : chArr) {
			System.out.println(c);
		}
		
		// 12. String toLowerCase() : 社庚切稽 郊荷奄  
		//     String toUpperCase() : 企庚切稽 郊荷奄
		System.out.println(email.toUpperCase());
		System.out.println(email.toLowerCase());
		
		// 13. String trim() : 丞 因拷 肢薦 (舘 掻娃 因拷精 肢薦 照敗)
		String str7 = "      徹胡戚胡績赫じ?討?       けいしけいし     ";
		str7 = str7.trim();
		System.out.println(str7);
		
		// 14. static String valueOf(陥級嬢姶)
		// 昔切研 String生稽 痕発
		String str8 = String.valueOf(3.14); // "3.14"
		// 3.14 + "" ==> "3.14"
		System.out.println(str8);
	}
	
}













