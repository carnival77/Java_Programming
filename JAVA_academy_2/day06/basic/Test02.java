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
		
		String s1 = null; // ��ü ����
		String s2 = "";   // ��ü ����
		
		// System.out.println( s1.equals("ABC") ); // ����!
		System.out.println("ABC".equals(s1)); // ���� �ȳ�
		System.out.println( s2.equals("ABC") );
		
		// 1. char charAt(int index) 
		// : index�� ���ڸ� char������ ��ȯ 
		char c1 = "ABCDEF".charAt(3); 
		System.out.println(c1); // D
		
		// 2. boolean contains(String another)
		// : ���ڿ��� another�� �ִ�? 
		s1 = "�޷ո޷�~~ ����������"; 
		System.out.println(s1.contains("������")); // true
		
		String email = "issell@naver.com"; 
		
		// 3. boolean endsWith(String word) : word�� ������?
		//    boolean startsWith(String word) : word�� �����ϴ�?
		System.out.println(email.endsWith(".com")); // true
		System.out.println(email.startsWith("naver")); // false
		
		
		// 4. boolean equals(String another)
		System.out.println("ABC".equals("abc")); // false
		System.out.println("ABC".equalsIgnoreCase("abc"));// true
		
		// 5. static String format(String ���Ĺ���, ���ڰ� �ƹ��ų�..)
		String str1 = String.format("%.2f %.3f", 3.333333, 1.1234567);
		System.out.println(str1); // 3.33 1.123
		
		// 6. int indexOf(String word) : word�� �� �� ���ں��� �����ϴ�? (������ -1)
		System.out.println(email.indexOf("@")); // 6
		
		String str2 = "java-A, java-B, java-C"; 
		System.out.println(str2.indexOf("java")); // 0
		System.out.println(str2.indexOf("java", 10)); // 16
		System.out.println(str2.lastIndexOf("java")); // 16
		
		// 7. boolean isEmpty() : "" �̴�?
		// 8. int length() : ���� ����
		System.out.println(str2.length()); // 22
		
		// 9. String replace(oldWord, newWord)
		System.out.println("��ü �� : " + str2);
		String str3 = str2.replace("java", "android");
		System.out.println("��ü �� : " + str3);
		
		String str4 = "aweiuo12312������asidjlqwi1123";
		// ���ĺ� �����ϱ�
		str4 = str4.replaceAll("[a-zA-Z]", "");
		System.out.println(str4);
		
		String str5 = "1������ 2�������� 3�������� 4������"; 
		String[] sArr = str5.split("[0-9]");
		System.out.println(sArr[0]);
		System.out.println(sArr[1]);
		System.out.println(sArr[2]);
		System.out.println(sArr[3]);
		
		// 10. String substring(int �����ε���)
		//     String substring(int �����ε���, int ���ε���)
		String str6 = "01234567"; 
		System.out.println(str6.substring(3)); //34567
		System.out.println(str6.substring(5, 7));//56
		
		// 11. chat[] toCharArray() 
		char[] chArr = str4.toCharArray();
		for(char c : chArr) {
			System.out.println(c);
		}
		
		// 12. String toLowerCase() : �ҹ��ڷ� �ٲٱ�  
		//     String toUpperCase() : �빮�ڷ� �ٲٱ�
		System.out.println(email.toUpperCase());
		System.out.println(email.toLowerCase());
		
		// 13. String trim() : �� ���� ���� (�� �߰� ������ ���� ����)
		String str7 = "      Ű���̸��ӳҤ��Ƥ�       ������������     ";
		str7 = str7.trim();
		System.out.println(str7);
		
		// 14. static String valueOf(�ٵ�)
		// ���ڸ� String���� ��ȯ
		String str8 = String.valueOf(3.14); // "3.14"
		// 3.14 + "" ==> "3.14"
		System.out.println(str8);
	}
	
}













