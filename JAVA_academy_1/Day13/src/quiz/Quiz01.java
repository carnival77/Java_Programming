package quiz;

import basic.Person;

public class Quiz01 {
	public static void main(String[] args) {
		String[] randName = { "이푸린", "홍길동", "김피카츄", "고길동" };
		
		// Person 형 배열 10개 생성
		Person[] pArr = new Person[10]; 
		// 주소메모장 10개.. null, null, null, ...
		
		
		
		for(int i = 0; i < pArr.length; ++i) {
			pArr[i] = new Person();
			
			// for문을 통해서 이름은 randName 중 임의로 1개 (중복 상관없음)
			pArr[i].name = randName[ (int)(Math.random()*4) ];
			
			// 성별은 랜덤하게 true 혹은 false
			pArr[i].isMale = Math.random() > 0.5; 
			
			// 나이는 1 ~ 100 중 랜덤으로 저장
			pArr[i].age = (int)(Math.random() * 100) + 1;
			
			// printPerson() 을 사용하여 모든 정보 출력
			// pArr[i].printPerson();
		}
		
//		for(int i = 0; i < 10; ++i) {
//			pArr[i].name = "없음";
//		}
		
//		for(Person p : pArr) {
//			p.name = "없음"; 
//		}
		
//		for(int i = 0; i < 10; ++i) {
//			pArr[i] = new Person();
//		}
		
//		for(Person p : pArr) {
//			p = new Person();
//		}
		
		for( Person p : pArr ) {
			p.printPerson();
		}
	}
}











