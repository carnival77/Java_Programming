package basic;

public class Person {
	String name;
	int age;
	
	// ��ü�� ������ �ൿ�� �� �־�� �Ѵ�.
	// �ش� ��ü�� ���õ� ��� ���� �� Ŭ���� �ȿ� ���ǵǾ�� �Ѵ�.
	void setData(String n, int a){
		name = n;
		age = a;
	}	
	void printData() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}

