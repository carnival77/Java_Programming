package day09.quiz;

import java.util.Set;
import java.util.TreeMap;

import javax.swing.JOptionPane;

/*
 * < 단어장 만들기 >
 * - 키 : 영단어
 *   값 : 뜻
 *   
 * < 메뉴 >
 *  1. 단어 등록
 *  2. 모든 단어 보기
 *  3. 단어 검색 
 *  4. 퀴즈 
 *  	==> '뜻'을 문제로 내고, 영단어를 입력 받아 "정답!" 혹은 "땡!" 출력
 *    		예) '집'을 영어로? --> 입력 : home
 *  0. 종료
 */
public class Quiz02 {
	public static void main(String[] args) {
		TreeMap<String, String> wordbook = new TreeMap<String, String>();
		String menu = "1. 단어 등록 \n"
					+ "2. 모든 단어 보기 \n"
					+ "3. 단어 검색 \n"
					+ "4. 퀴즈 \n"
					+ "0. 종료";
		String word, meaning;
		menu: while(true) {
			switch (JOptionPane.showInputDialog(menu)) {
			case "1":
				word = JOptionPane.showInputDialog("새 단어"); 
				meaning = JOptionPane.showInputDialog("[" + word + "]의 뜻"); 
				wordbook.put(word, meaning);
				JOptionPane.showMessageDialog(null, "등록완료!");
				break;
			case "2":
				String message = "==== 단어 리스트 ====\n";
				Set<String> wordSet = wordbook.keySet();
				for(String w : wordSet) {
					message += w + " / " + wordbook.get(w) + "\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				word = JOptionPane.showInputDialog("단어를 입력하세요.");
				if(wordbook.containsKey(word)) {
					JOptionPane.showMessageDialog(null, "뜻 : " + wordbook.get(word));
				}
				else {
					JOptionPane.showMessageDialog(null, "미등록 단어");
				}
				break;
			case "4":
				int randIndex = (int)(Math.random() * wordbook.size());
				Set<String> words = wordbook.keySet();
				Object[] wordArr = words.toArray();
				String correct = (String)wordArr[randIndex]; // 영단어
				String quiz = wordbook.get(correct);
				String answer = JOptionPane.showInputDialog(quiz + "(은)는 영어로?");
				if(correct.equalsIgnoreCase(answer)) {
					JOptionPane.showMessageDialog(null, "정답!");
				}
				else {
					JOptionPane.showMessageDialog(null, "땡..");
				}
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				break menu;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
				break;
			}
		}
	}
}
