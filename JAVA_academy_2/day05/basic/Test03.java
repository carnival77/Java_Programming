package day05.basic;

import java.lang.reflect.Field;

class Person {
	String id; // 주민번호
	String address; // 주소
	Person(String i, String a){
		id = i;
		address = a;
	}
	
	// equals() 오버라이드
	public boolean equals(Object o) {
		if(this == o) { return true; }
		if(o instanceof Person) { // o 가 Person형이니?
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
		Person p = new Person("881123-1111111", "마포구 노고산동");
		// Object의 주요 메서드 
		// 1. boolean equals(Object another)
		// -> 이 객체와 another가 같은 레퍼런스니?
		// -> 클래스 정의 시 오버라이드 권장
		
		Person p2 = new Person("881123-1111111", "경기도 광명시");
		
		System.out.println(p.equals(p2)); 
		// 오버라이드 전 : false ( 레퍼런스로 비교 )
		// 오버라이드 후 : true ( 주민번호로 비교 )
			
		
		String s1 = "ABC"; 
		String s2 = new String("ABC");
		System.out.println(s1.equals(s2)); // true
		
		// 2. Class getClass() 
		// 이 객체의 클래스를 Class형 객체로 리턴
		// java.lang.Class 클래스 : 클래스 정보를 얻을 때 사용하는 클래스
		Class clazz = p.getClass();
		System.out.println(clazz);
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getName());
		
		// 해당 클래스(Person)의 선언된 모든 멤버변수 얻어옴(Field 클래스)
		Field[] fields = clazz.getDeclaredFields();
		for(int i = 0; i < fields.length; ++i) {
			System.out.println("자료형 : " + fields[i].getType());
			System.out.println("이름 : " + fields[i].getName());
		}
		
		// 3. String toString()
		// - 이 객체를 표현하는 한마디(String)
		// - 주소는 은닉하는 대신, 주소를 출력해야 할 때는 toString() 대신 호출됨
		// - 오버라이드 권장
		Person pp = new Person(null, null);
		System.out.println(pp);
		System.out.println(pp.toString());
		
		
		String s = pp + ""; // pp.toString() + ""
		
		System.out.println(p);
		System.out.println(p2);
		
		// 4. int hashCode() : 이 객체 해시코드
		// --> 해시코드 : 이 객체를 식별하는 식별 번호 
		//     (레퍼런스 대용으로 사용한다.) 
		// - 오버라이드 권장
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










