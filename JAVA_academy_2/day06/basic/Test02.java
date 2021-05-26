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
		
		String s1 = null; // 객체 없음
		String s2 = "";   // 객체 있음
		
		// System.out.println( s1.equals("ABC") ); // 에러!
		System.out.println("ABC".equals(s1)); // 에러 안남
		System.out.println( s2.equals("ABC") );
		
		// 1. char charAt(int index) 
		// : index번 문자를 char형으로 반환 
		char c1 = "ABCDEF".charAt(3); 
		System.out.println(c1); // D
		
		// 2. boolean contains(String another)
		// : 문자열에 another가 있니? 
		s1 = "메롱메롱~~ ㅋㅋㅋㅋㅋ"; 
		System.out.println(s1.contains("ㅋㅋㅋ")); // true
		
		String email = "issell@naver.com"; 
		
		// 3. boolean endsWith(String word) : word로 끝나니?
		//    boolean startsWith(String word) : word로 시작하니?
		System.out.println(email.endsWith(".com")); // true
		System.out.println(email.startsWith("naver")); // false
		
		
		// 4. boolean equals(String another)
		System.out.println("ABC".equals("abc")); // false
		System.out.println("ABC".equalsIgnoreCase("abc"));// true
		
		// 5. static String format(String 서식문자, 인자값 아무거나..)
		String str1 = String.format("%.2f %.3f", 3.333333, 1.1234567);
		System.out.println(str1); // 3.33 1.123
		
		// 6. int indexOf(String word) : word가 몇 번 문자부터 시작하니? (없으면 -1)
		System.out.println(email.indexOf("@")); // 6
		
		String str2 = "java-A, java-B, java-C"; 
		System.out.println(str2.indexOf("java")); // 0
		System.out.println(str2.indexOf("java", 10)); // 16
		System.out.println(str2.lastIndexOf("java")); // 16
		
		// 7. boolean isEmpty() : "" 이니?
		// 8. int length() : 글자 개수
		System.out.println(str2.length()); // 22
		
		// 9. String replace(oldWord, newWord)
		System.out.println("대체 전 : " + str2);
		String str3 = str2.replace("java", "android");
		System.out.println("대체 후 : " + str3);
		
		String str4 = "aweiuo12312ㅋㅋㅋasidjlqwi1123";
		// 알파벳 제거하기
		str4 = str4.replaceAll("[a-zA-Z]", "");
		System.out.println(str4);
		
		String str5 = "1ㅋㅋㅋ 2ㅁㅁㄴㅇ 3ㅂㅈㄷㅂ 4ㄴㅇㅀ"; 
		String[] sArr = str5.split("[0-9]");
		System.out.println(sArr[0]);
		System.out.println(sArr[1]);
		System.out.println(sArr[2]);
		System.out.println(sArr[3]);
		
		// 10. String substring(int 시작인덱스)
		//     String substring(int 시작인덱스, int 끝인덱스)
		String str6 = "01234567"; 
		System.out.println(str6.substring(3)); //34567
		System.out.println(str6.substring(5, 7));//56
		
		// 11. chat[] toCharArray() 
		char[] chArr = str4.toCharArray();
		for(char c : chArr) {
			System.out.println(c);
		}
		
		// 12. String toLowerCase() : 소문자로 바꾸기  
		//     String toUpperCase() : 대문자로 바꾸기
		System.out.println(email.toUpperCase());
		System.out.println(email.toLowerCase());
		
		// 13. String trim() : 양 공백 삭제 (단 중간 공백은 삭제 안함)
		String str7 = "      키먼이먼임넙ㅈ댣ㄱ       ㅁㄴㅇㅁㄴㅇ     ";
		str7 = str7.trim();
		System.out.println(str7);
		
		// 14. static String valueOf(다들어감)
		// 인자를 String으로 변환
		String str8 = String.valueOf(3.14); // "3.14"
		// 3.14 + "" ==> "3.14"
		System.out.println(str8);
	}
	
}













