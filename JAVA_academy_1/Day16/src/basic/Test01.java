package basic;
/*
 * < �޼��� �����ε�(overload) >
 * - overload : ��������
 * - ���� �޼��带 ���� �� ����� ��
 *   ���� �̸�, ���� ����, �ٸ� �Ű����� 
 *   	** �Ű������� �ڷ��� Ȥ�� ������ �޶�� ��.
 * - ��) sysout�� println()
 * - �޼��带 ����� �ٸ� �����ڸ� ����
 * - �޼ҵ尡 ȣ��� �� ������ ������ �� ���õ�
 */
class My {
	void aa() {
		System.out.println("���ڰ� : ����");
	}
	
	void aa(int a) {
		System.out.println("���ڰ� : ���� " + a);
	}
	
	void aa(boolean a) {
		System.out.println("���ڰ� : boolean " + a);
	}
	
	void aa(int a, int b) {
		System.out.println("���ڰ�1 : ���� " + a);
		System.out.println("���ڰ�2 : ���� " + b);
	}
	
	boolean aa(String s){
		System.out.println("���ڰ� : " + s);
		return true;
	}
}

class Book {
	String title;
	int price;
	String author;
	
	void setData(String t) { // ����
		title = t;
	}
	/*void setData(String a) {
		author = a;
	}
		����! �Ű����� �̸��� �ٸ��ٰ� �ؼ� ������ �����ε� ������ �� �ƴ�!
		ȣ�� �� � �޼ҵ带 �����ؾ� �ϴ� �� �� �� ���� ���� (�� a.setData("��ī��");) 
	*/
	void setData(String t, int p) { // ����, ����
		title = t;
		price = p;
	}
	void setData(String t, int p, String a) {
		title = t;
		price = p;
		author = a;
	}
	
	void printData() {
		System.out.println("���� : " + title);
		System.out.println("���� : " + price + "��");
		System.out.println("���� : " + author);
	}
}
public class Test01 {
	public static void main(String[] args) {
		My my = new My();
		my.aa();
		my.aa(10); 
		my.aa(true);
		
		System.out.println();
		System.out.println(10);
		System.out.println(true);
		
		Book b1 = new Book();
		b1.setData("�ڹ��� ����", 35000, "����");
		Book b2 = new Book();
		b2.setData("�ظ�����", 12000);
		Book b3 = new Book();
		b3.setData("�̰��� �ڹٴ�");
		
		b1.printData();
		b2.printData();
		b3.printData();
	}
}




