package basic;

public class Test01 {
	public static void main(String[] args) {
		// ����� ������ ������ ��ü 4���� ������ �迭!!
		
		Person[] p; // Person�� �迭�� �ּҸ� ������ p ��������
		
		p = new Person[4]; // Person�� ��ü�� �ּҸ� ������ 4ĭ¥�� �ּҷ�
		// ����! ��ü�� �迭�� ������ ���۷��� �迭
		//  ==> �ּҰ����� ������ �ִ� �ּҷ� ����
		//  ==> ������ ��ü ������ �ؼ� �� ĭ�� �ּҵ��� �����ؾ� ��!!!!!!!!!!
		// ��� : �迭�� ����ٰ� �ؼ� �ڵ����� ��ü���� ��������� �� �ƴ�
		
		p[0] = new Person();
		p[1] = new Person();
		p[2] = new Person();
		p[3] = new Person();
 		
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		
		p[0].name = "ȫ�浿"; 
		p[0].age = 10;
		p[0].isMale = true;
		
		p[1].name = "��Ǫ��"; 
		p[1].age = 20;
		p[1].isMale = false;
		
		p[2].name = "���ǵ�����"; 
		p[2].age = 12;
		
		p[0].printPerson();
		p[1].printPerson();
		p[2].printPerson();
		p[3].printPerson();
	}
}
