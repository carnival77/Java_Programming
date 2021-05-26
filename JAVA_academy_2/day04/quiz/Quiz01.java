package day04.quiz;

import java.util.Scanner;

/*
 * 상점에서 4개의 아이템을 팔고 있다.
 *  1. 빨간 물약
 *  2. 파란 물약
 *  3. 마법 반지
 *  4. 나무 방패
 *  
 * 한 사람의 인벤토리는 최대 6개
 * (아이템 당 1칸 차지한다.)
 * 
 * 메뉴.
 * 	1. 구매 : 1 ~ 4 번 아이템을 선택하면 각 아이템의 설명을 sysout 한 후 인벤토리에 저장
 *  2. 사용 : 
 *  	1) 0 ~ 6 입력 받고 해당 칸의 아이템을 사용. null인지 아닌 지 판별
 *  		(use() 메소드를 호출 ( "체력을 회복하였다!" 등을 출력) ) 
 *  	2) 인벤토리에 아이템 삭제 ==> null
 *  3. 종료 : 프로그램 종료
 *  
 *  매번 현재 인벤토리 상황을 출력
 */
interface Item {
	/*public abstract*/void use();
	void showInfo();
}
class RedPortion implements Item {
	public void use() {
		System.out.println("빨간 물약을 사용합니다. 체력이 증가되었습니다.");
	}
	public void showInfo() {
		System.out.println("빨간 물약 : 체력을 100 회복합니다.");
	}
}
class BluePortion implements Item {
	public void use() {
		System.out.println("파란 물약을 사용합니다. 정신력이 증가되었습니다.");
	}
	public void showInfo() {
		System.out.println("파란 물약 : 정신력을 100 회복합니다.");
	}
}
class MagicRing implements Item {
	public void use() {
		System.out.println("마법 반지를 착용합니다. 마력이 증가되었습니다.");
	}
	public void showInfo() {
		System.out.println("마법 반지 : 착용하는 동안 마력이 1.2% 증가합니다.");
	}
}

class WoodShield implements Item {
	public void use() {
		System.out.println("나무 방패를 착용합니다. 방어력이 증가되었습니다.");
	}
	public void showInfo() {
		System.out.println("나무 방패 : 착용하는 동안 방어력이 20% 증가합니다.");
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		Item[] inven = new Item[6];
		// [ null, null, null, null, null, null ]
		
		Scanner sc = new Scanner(System.in);
		String menu = "1. 구매 \n"
					+ "2. 사용 \n"
					+ "3. 종료";
		while(true) {
			System.out.println("========== 인벤토리 현황 ==========");
			for(int i = 0; i < inven.length; ++i) {
				System.out.print(i + ". ");
				if(inven[i] == null) {
					System.out.println("비어 있음");
				} 
				else {
					inven[i].showInfo();
				}
			}
			System.out.println("================================");
			System.out.println(menu);
			int select = sc.nextInt();
			if(select == 1) {
				String itemList = "아이템을 선택하세요.\n" +
									"1. 빨간 물약\n" + 
									"2. 파란 물약\n" + 
									"3. 마법 반지\n" + 
									"4. 나무 방패";
				System.out.println(itemList);
				System.out.print("아이템 선택 : ");
				int select2 = sc.nextInt();
				if(select2 < 1 || select2 > 4) {
					System.out.println("잘못된 입력입니다.");
				}
				else {
					
					int emptyIndex = 0; 
					
					// 빈칸 찾기
					for(  ; inven[emptyIndex]!=null ;emptyIndex++) ;
					
					// 빈칸에 아이템 넣기
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
				System.out.println("0~5번 중 선택하세요.");
				int select2 = sc.nextInt();
				if(select2 < 0 || select2 > 5) {
					System.out.println("잘못된 입력");
				}
				else {
					if(inven[select2] == null) {
						System.out.println("아이템이 없습니다.");
					} else {
						inven[select2].use();
						inven[select2] = null;
					}
				}
			}
			else if(select == 3) {
				System.out.println("프로그램을 종료합니다.");
				return; // 메인메서드 종료
			}
		}
	}
}



