package day04.quiz;

import java.util.Scanner;

/*
 * �������� 4���� �������� �Ȱ� �ִ�.
 *  1. ���� ����
 *  2. �Ķ� ����
 *  3. ���� ����
 *  4. ���� ����
 *  
 * �� ����� �κ��丮�� �ִ� 6��
 * (������ �� 1ĭ �����Ѵ�.)
 * 
 * �޴�.
 * 	1. ���� : 1 ~ 4 �� �������� �����ϸ� �� �������� ������ sysout �� �� �κ��丮�� ����
 *  2. ��� : 
 *  	1) 0 ~ 6 �Է� �ް� �ش� ĭ�� �������� ���. null���� �ƴ� �� �Ǻ�
 *  		(use() �޼ҵ带 ȣ�� ( "ü���� ȸ���Ͽ���!" ���� ���) ) 
 *  	2) �κ��丮�� ������ ���� ==> null
 *  3. ���� : ���α׷� ����
 *  
 *  �Ź� ���� �κ��丮 ��Ȳ�� ���
 */
interface Item {
	/*public abstract*/void use();
	void showInfo();
}
class RedPortion implements Item {
	public void use() {
		System.out.println("���� ������ ����մϴ�. ü���� �����Ǿ����ϴ�.");
	}
	public void showInfo() {
		System.out.println("���� ���� : ü���� 100 ȸ���մϴ�.");
	}
}
class BluePortion implements Item {
	public void use() {
		System.out.println("�Ķ� ������ ����մϴ�. ���ŷ��� �����Ǿ����ϴ�.");
	}
	public void showInfo() {
		System.out.println("�Ķ� ���� : ���ŷ��� 100 ȸ���մϴ�.");
	}
}
class MagicRing implements Item {
	public void use() {
		System.out.println("���� ������ �����մϴ�. ������ �����Ǿ����ϴ�.");
	}
	public void showInfo() {
		System.out.println("���� ���� : �����ϴ� ���� ������ 1.2% �����մϴ�.");
	}
}

class WoodShield implements Item {
	public void use() {
		System.out.println("���� ���и� �����մϴ�. ������ �����Ǿ����ϴ�.");
	}
	public void showInfo() {
		System.out.println("���� ���� : �����ϴ� ���� ������ 20% �����մϴ�.");
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		Item[] inven = new Item[6];
		// [ null, null, null, null, null, null ]
		
		Scanner sc = new Scanner(System.in);
		String menu = "1. ���� \n"
					+ "2. ��� \n"
					+ "3. ����";
		while(true) {
			System.out.println("========== �κ��丮 ��Ȳ ==========");
			for(int i = 0; i < inven.length; ++i) {
				System.out.print(i + ". ");
				if(inven[i] == null) {
					System.out.println("��� ����");
				} 
				else {
					inven[i].showInfo();
				}
			}
			System.out.println("================================");
			System.out.println(menu);
			int select = sc.nextInt();
			if(select == 1) {
				String itemList = "�������� �����ϼ���.\n" +
									"1. ���� ����\n" + 
									"2. �Ķ� ����\n" + 
									"3. ���� ����\n" + 
									"4. ���� ����";
				System.out.println(itemList);
				System.out.print("������ ���� : ");
				int select2 = sc.nextInt();
				if(select2 < 1 || select2 > 4) {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
				else {
					
					int emptyIndex = 0; 
					
					// ��ĭ ã��
					for(  ; inven[emptyIndex]!=null ;emptyIndex++) ;
					
					// ��ĭ�� ������ �ֱ�
					switch(select2) {
					case 1:
						inven[emptyIndex] = new RedPortion();
						break;
					case 2:
						inven[emptyIndex] = new BluePortion();
						break;
					case 3:
						inven[emptyIndex] = new MagicRing();
						break;
					case 4:
						inven[emptyIndex] = new WoodShield();
						break;
					}
					inven[emptyIndex].showInfo();
					
				}
			}
			else if(select == 2) {
				System.out.println("0~5�� �� �����ϼ���.");
				int select2 = sc.nextInt();
				if(select2 < 0 || select2 > 5) {
					System.out.println("�߸��� �Է�");
				}
				else {
					if(inven[select2] == null) {
						System.out.println("�������� �����ϴ�.");
					} else {
						inven[select2].use();
						inven[select2] = null;
					}
				}
			}
			else if(select == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				return; // ���θ޼��� ����
			}
		}
	}
}



