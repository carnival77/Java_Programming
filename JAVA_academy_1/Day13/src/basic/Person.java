package basic;

public class Person {
	public String name;
	public boolean isMale = true; // true : 남성 false : 여성
	public int age;
	
	public void printPerson() {
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + (isMale ? "남성" : "여성"));
		System.out.println("나이 : " + age + "세");
	}
}
