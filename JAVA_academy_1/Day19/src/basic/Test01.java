package basic;
class Person {
	String name;
	int age;
	boolean isMale;
	String contact;
	
	// getter setter 자동완성 : 우클릭 -> source -> generate getters and setters..
	// 생성자 자동완성                  : 우클릭 -> source -> generate constructor using fields..
	public Person(String name, int age, boolean isMale, String contact) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
		this.contact = contact;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

}

class Test01 {
	public static void main(String[] args) {
		System.out.println("aa");
		// Math m = new Math();
		
		System.out.println(Math.PI);
		System.out.println(Math.random());
		System.out.println(Math.round(0.8));
	}
}








