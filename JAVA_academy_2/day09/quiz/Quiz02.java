package day09.quiz;

import java.util.Set;
import java.util.TreeMap;

import javax.swing.JOptionPane;

/*
 * < �ܾ��� ����� >
 * - Ű : ���ܾ�
 *   �� : ��
 *   
 * < �޴� >
 *  1. �ܾ� ���
 *  2. ��� �ܾ� ����
 *  3. �ܾ� �˻� 
 *  4. ���� 
 *  	==> '��'�� ������ ����, ���ܾ �Է� �޾� "����!" Ȥ�� "��!" ���
 *    		��) '��'�� �����? --> �Է� : home
 *  0. ����
 */
public class Quiz02 {
	public static void main(String[] args) {
		TreeMap<String, String> wordbook = new TreeMap<String, String>();
		String menu = "1. �ܾ� ��� \n"
					+ "2. ��� �ܾ� ���� \n"
					+ "3. �ܾ� �˻� \n"
					+ "4. ���� \n"
					+ "0. ����";
		String word, meaning;
		menu: while(true) {
			switch (JOptionPane.showInputDialog(menu)) {
			case "1":
				word = JOptionPane.showInputDialog("�� �ܾ�"); 
				meaning = JOptionPane.showInputDialog("[" + word + "]�� ��"); 
				wordbook.put(word, meaning);
				JOptionPane.showMessageDialog(null, "��ϿϷ�!");
				break;
			case "2":
				String message = "==== �ܾ� ����Ʈ ====\n";
				Set<String> wordSet = wordbook.keySet();
				for(String w : wordSet) {
					message += w + " / " + wordbook.get(w) + "\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				word = JOptionPane.showInputDialog("�ܾ �Է��ϼ���.");
				if(wordbook.containsKey(word)) {
					JOptionPane.showMessageDialog(null, "�� : " + wordbook.get(word));
				}
				else {
					JOptionPane.showMessageDialog(null, "�̵�� �ܾ�");
				}
				break;
			case "4":
				int randIndex = (int)(Math.random() * wordbook.size());
				Set<String> words = wordbook.keySet();
				Object[] wordArr = words.toArray();
				String correct = (String)wordArr[randIndex]; // ���ܾ�
				String quiz = wordbook.get(correct);
				String answer = JOptionPane.showInputDialog(quiz + "(��)�� �����?");
				if(correct.equalsIgnoreCase(answer)) {
					JOptionPane.showMessageDialog(null, "����!");
				}
				else {
					JOptionPane.showMessageDialog(null, "��..");
				}
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
				break menu;
			default:
				JOptionPane.showMessageDialog(null, "�߸��� �Է��Դϴ�.");
				break;
			}
		}
	}
}
