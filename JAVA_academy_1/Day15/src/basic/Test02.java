package basic;

public class Test02 {
	public static void main(String[] args) {
		Person p1, p2;
		p1 = new Person();
		p2 = new Person();
		
		p1.setData("��ī��", 20);
		// p1.name = "��ī��";
		// p1.age = 10;
		
		p2.setData("������", 12);
		// p2.name = "������";
		// p2.age = 12;
		
		p1.printData();
		p2.printData();
	}
}
