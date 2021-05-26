package day08.quiz;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * < ���� ���� ���α׷� >
 * 1. Nation 
 * 	�ʵ� : ������(nation), ����(capital), �α���(population) 
 *  �޼��� : ������ ���� �� 
 *  	   toString() �������̵� (�������)
 * 2. Quiz01
 *  �޴�>
 *  	1. ���� ���
 *  	2. ��� ���� ����
 *  	(3. ���� �˻�-������ �Է� �ް� �ش� ������ ��� ���� ���) 
 *  	0. ����
 */
class Nation {
	String nation;
	String capital;
	int population;
	Nation(){}
	Nation(String nation, String capital, int population){
		this.nation = nation;
		this.capital = capital;
		this.population = population;
	}
	public String toString() {
		return "������ : " + nation + "\n"	+ 
				"���� : " + capital + "\n" + 
				"�α��� : �� " + population + "��";
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		String menu = "1. ���� ��� \n"
					+ "2. ��� ���� ���� \n"
					+ "3. ���� �˻� \n"
					+ "0. ����";
		String select; 
		ArrayList<Nation> list = new ArrayList<Nation>(); 
		
		while(true) {
			select = JOptionPane.showInputDialog(menu);
			switch(select) {
			case "1":
				String n = JOptionPane.showInputDialog("�� ������").trim();
				String c = JOptionPane.showInputDialog(n + "�� ����").trim();
				int p = Integer.parseInt(JOptionPane.showInputDialog(n +"�� �α���").trim());
				Nation nation = new Nation(n, c, p);
				list.add(nation);
				break;
			case "2":
				String message = "< ���� ����Ʈ >\n";
//				for(int i = 0; i < list.size(); ++i) {
//					message += list.get(i) + "\n"; 
//				}
				for(Nation na : list) {
					message += na + "\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				String s = JOptionPane.showInputDialog("�˻��� ���� �̸�").trim(); 
				String message2 = "�̵�� ����"; 
				for(Nation na : list) {
					if(na.nation.equals(s)) {
						message2 = na.toString();
						break;
					}
				}
				JOptionPane.showMessageDialog(null, message2);
				break;
			case "0": // ���α׷� ����
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
				return;
			default:
				JOptionPane.showMessageDialog(null, "�߸��� �Է��Դϴ�.");
			}
		}
		
	}
}




