package basic;

class ATeam {
	static boolean win;
	String name;
	int level;
}
public class Test04 {
	public static void main(String[] args) {
		ATeam a1 = new ATeam();
		a1.name = "��ī��";
		
		ATeam a2 = new ATeam();
		a2.name = "������";
		
		ATeam a3 = new ATeam();
		a3.name = "���̸�";
		
		// �̰��!
		//a1.win = true;
		//a2.win = true;
		//a3.win = true;
		// win�� �Ϲ� ��������� ���, ��ü���� ���� ������ �ǹǷ� 
		//  ���¸� �����ؾ� �ϴ� ��� ��� ��ü�� �� �� �� �ǵ������
		
		System.out.println("���� �� a1.win : " + a1.win);
		System.out.println("���� �� a2.win : " + a2.win);
		System.out.println("���� �� a3.win : " + a3.win);
		ATeam.win = true;
		System.out.println("���� �� a1.win : " + a1.win);
		System.out.println("���� �� a2.win : " + a2.win);
		System.out.println("���� �� a3.win : " + a3.win);
	}
}











