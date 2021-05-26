package day07.basic;

public class Test01 {
	public static void main(String[] args) {
		String s1 = "ABC"; 
		String s2 = "DEF";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s1 = s1 + s2;
		System.out.println(s1.hashCode());
		
		StringBuffer s3 = new StringBuffer("ABC");
		System.out.println("s3 : " + s3.hashCode());
		
		s3.append("DEF");
		System.out.println("s3 : " + s3.hashCode());
		System.out.println(s3.toString());
	}
}




