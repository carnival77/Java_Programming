package basic;
/*
 * < �޼��� �������̵�(Override) >
 * 
 * ** �����ε� : �޼ҵ� ���� �� �����
 * 
 * ** �������̵� : �޼ҵ� ������
 *  -> �θ� ������ �޼��带 �ڽ��� ����� ��
 *  	�������� �޼����� ������ �״�� ���ΰ� 
 *      ����({})�� �����ϴ� ��
 *  -> ���� : �޼����� �̸� ����
 *           ������
 *           
 * < ����� ���� 2���� >
 * 1. Ȯ�� : ���߱Ⱓ�� ���̱� ����
 * 2. �׷�ȭ : �ϳ��� ī�װ��� �������
 *  Book -> ComicBook, NovelBook, TextBook
 *  Item -> Portion -> RedPortion
 *  				-> BluePortion
 *  	 -> Shoes -> LeatherShoes
 *  			  -> SpeedShoes
 */
class Pokemon {
	int hp;
	int ap;
	void greet() {
		System.out.println("���ϸ��� �λ��մϴ�.");
	}
}
class Pikachu extends Pokemon{
	String master = "����";
	void greet() {
		System.out.println("�Ǳ� �Ǳ�??");
	}
}
class Ggobuki extends Pokemon {
	String skill = "������ ����";
	void greet() {
		System.out.println("���� ����~~");
	}
}
public class Test03 {
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon();
		Pikachu p2 = new Pikachu();
		Ggobuki p3 = new Ggobuki();
		p1.greet();
		p2.greet();
		p3.greet();
	}
}



