package basic;

public class Test01 {
	public static void main(String[] args) {
		// 사람의 정보를 저장할 객체 4개를 저장할 배열!!
		
		Person[] p; // Person형 배열의 주소를 저장할 p 참조변수
		
		p = new Person[4]; // Person형 객체의 주소를 저장할 4칸짜리 주소록
		// 주의! 객체의 배열은 엄연히 레퍼런스 배열
		//  ==> 주소값들이 여러개 있는 주소록 형태
		//  ==> 일일히 객체 생성을 해서 각 칸에 주소들을 저장해야 함!!!!!!!!!!
		// 결론 : 배열을 만든다고 해서 자동으로 객체들이 만들어지는 게 아님
		
		p[0] = new Person();
		p[1] = new Person();
		p[2] = new Person();
		p[3] = new Person();
 		
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		
		p[0].name = "홍길동"; 
		p[0].age = 10;
		p[0].isMale = true;
		
		p[1].name = "이푸린"; 
		p[1].age = 20;
		p[1].isMale = false;
		
		p[2].name = "강또도가스"; 
		p[2].age = 12;
		
		p[0].printPerson();
		p[1].printPerson();
		p[2].printPerson();
		p[3].printPerson();
	}
}
