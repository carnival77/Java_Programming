package day05.basic;

import java.lang.reflect.Field;

class Person {
	String id; // �ֹι�ȣ
	String address; // �ּ�
	Person(String i, String a){
		id = i;
		address = a;
	}
	
	// equals() �������̵�
	public boolean equals(Object o) {
		if(this == o) { return true; }
		if(o instanceof Person) { // o �� Person���̴�?
			Person another = (Person)o;
			if(id != null) {
				return id.equals(another.id); 
			}
		}
		return false;
	}
	
	public String toString() {
		return "[" + id + "/" + address + "]";
	}
}
public class Test03 {
	public static void main(String[] args) {
		Person p = new Person("881123-1111111", "������ ���굿");
		// Object�� �ֿ� �޼��� 
		// 1. boolean equals(Object another)
		// -> �� ��ü�� another�� ���� ���۷�����?
		// -> Ŭ���� ���� �� �������̵� ����
		
		Person p2 = new Person("881123-1111111", "��⵵ �����");
		
		System.out.println(p.equals(p2)); 
		// �������̵� �� : false ( ���۷����� �� )
		// �������̵� �� : true ( �ֹι�ȣ�� �� )
			
		
		String s1 = "ABC"; 
		String s2 = new String("ABC");
		System.out.println(s1.equals(s2)); // true
		
		// 2. Class getClass() 
		// �� ��ü�� Ŭ������ Class�� ��ü�� ����
		// java.lang.Class Ŭ���� : Ŭ���� ������ ���� �� ����ϴ� Ŭ����
		Class clazz = p.getClass();
		System.out.println(clazz);
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getName());
		
		// �ش� Ŭ����(Person)�� ����� ��� ������� ����(Field Ŭ����)
		Field[] fields = clazz.getDeclaredFields();
		for(int i = 0; i < fields.length; ++i) {
			System.out.println("�ڷ��� : " + fields[i].getType());
			System.out.println("�̸� : " + fields[i].getName());
		}
		
		// 3. String toString()
		// - �� ��ü�� ǥ���ϴ� �Ѹ���(String)
		// - �ּҴ� �����ϴ� ���, �ּҸ� ����ؾ� �� ���� toString() ��� ȣ���
		// - �������̵� ����
		Person pp = new Person(null, null);
		System.out.println(pp);
		System.out.println(pp.toString());
		
		
		String s = pp + ""; // pp.toString() + ""
		
		System.out.println(p);
		System.out.println(p2);
		
		// 4. int hashCode() : �� ��ü �ؽ��ڵ�
		// --> �ؽ��ڵ� : �� ��ü�� �ĺ��ϴ� �ĺ� ��ȣ 
		//     (���۷��� ������� ����Ѵ�.) 
		// - �������̵� ����
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		
		Integer num1 = 1;
		System.out.println(num1.hashCode()); // 1
		
		Character ch = 'A'; 
		System.out.println(ch.hashCode()); // 65
		
		Integer a = new Integer(1);
		Integer b = new Integer(1); 
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
	}
}










