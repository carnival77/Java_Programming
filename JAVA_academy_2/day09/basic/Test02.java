package day09.basic;

import java.util.HashSet;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	Person(String n, int a){
		name = n;
		age = a;
	}
	public String toString() {
		return name + "/" + age + "��";
	}
	public int compareTo(Person o) {
		// �̸� ������ �����ϵ�, �̸��� ������ ���̰� ���� ��
		
		// �� ��ü�� o���� �տ� �ΰ� ������ : ���� ����
		// �� ��ü�� o���� �ڿ� �ΰ� ������ : ��� ����
		// �� ��ü�� o�� ���� ��ü ����ϰ� �ʹ�. : 0 ����
		
		if(name != null) {
			if(name.equals(o.name)) {
				return o.age - this.age;
			}
			return name.compareTo(o.name);
		}
		
		return o.age - this.age;
	}
}
public class Test02 {
	public static void main(String[] args) {
		//HashSet<Person> set = new HashSet<Person>();
		TreeSet<Person> set = new TreeSet<Person>();
		set.add(new Person("����ī��", 25));
		set.add(new Person("�������", 20));
		set.add(new Person("��Ǫ��", 10));
		set.add(new Person("����ī��", 20));
		System.out.println(set);
	}
}
