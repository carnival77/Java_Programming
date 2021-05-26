package day08.quiz;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * < 국가 관리 프로그램 >
 * 1. Nation 
 * 	필드 : 국가명(nation), 수도(capital), 인구수(population) 
 *  메서드 : 생성자 여러 개 
 *  	   toString() 오버라이드 (마음대로)
 * 2. Quiz01
 *  메뉴>
 *  	1. 국가 등록
 *  	2. 모든 국가 보기
 *  	(3. 국가 검색-국가명 입력 받고 해당 국가의 모든 정보 출력) 
 *  	0. 종료
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
		return "국가명 : " + nation + "\n"	+ 
				"수도 : " + capital + "\n" + 
				"인구수 : 약 " + population + "명";
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		String menu = "1. 국가 등록 \n"
					+ "2. 모든 국가 보기 \n"
					+ "3. 국가 검색 \n"
					+ "0. 종료";
		String select; 
		ArrayList<Nation> list = new ArrayList<Nation>(); 
		
		while(true) {
			select = JOptionPane.showInputDialog(menu);
			switch(select) {
			case "1":
				String n = JOptionPane.showInputDialog("새 국가명").trim();
				String c = JOptionPane.showInputDialog(n + "의 수도").trim();
				int p = Integer.parseInt(JOptionPane.showInputDialog(n +"의 인구수").trim());
				Nation nation = new Nation(n, c, p);
				list.add(nation);
				break;
			case "2":
				String message = "< 국가 리스트 >\n";
//				for(int i = 0; i < list.size(); ++i) {
//					message += list.get(i) + "\n"; 
//				}
				for(Nation na : list) {
					message += na + "\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				String s = JOptionPane.showInputDialog("검색할 국가 이름").trim(); 
				String message2 = "미등록 국가"; 
				for(Nation na : list) {
					if(na.nation.equals(s)) {
						message2 = na.toString();
						break;
					}
				}
				JOptionPane.showMessageDialog(null, message2);
				break;
			case "0": // 프로그램 종료
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				return;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
			}
		}
		
	}
}




