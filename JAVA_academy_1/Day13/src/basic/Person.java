package basic;

public class Person {
	public String name;
	public boolean isMale = true; // true : ���� false : ����
	public int age;
	
	public void printPerson() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + (isMale ? "����" : "����"));
		System.out.println("���� : " + age + "��");
	}
}
