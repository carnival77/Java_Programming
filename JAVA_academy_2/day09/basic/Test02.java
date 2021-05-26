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
		return name + "/" + age + "세";
	}
	public int compareTo(Person o) {
		// 이름 순으로 정렬하되, 이름이 같으면 나이가 많은 순
		
		// 이 객체를 o보다 앞에 두고 싶으면 : 음수 리턴
		// 이 객체를 o보다 뒤에 두고 싶으면 : 양수 리턴
		// 이 객체와 o를 같은 객체 취급하고 싶다. : 0 리턴
		
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
		set.add(new Person("김피카츄", 25));
		set.add(new Person("장라이츄", 20));
		set.add(new Person("이푸린", 10));
		set.add(new Person("김피카츄", 20));
		System.out.println(set);
	}
}
