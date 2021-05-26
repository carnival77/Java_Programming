package basic;
/*
 * < 메서드 오버로드(overload) >
 * - overload : 과잉적재
 * - 같은 메서드를 여러 개 만드는 것
 *   같은 이름, 같은 내용, 다른 매개변수 
 *   	** 매개변수는 자료형 혹은 개수가 달라야 함.
 * - 예) sysout의 println()
 * - 메서드를 사용할 다른 개발자를 위함
 * - 메소드가 호출될 때 무엇을 실행할 지 선택됨
 */
class My {
	void aa() {
		System.out.println("인자값 : 없음");
	}
	
	void aa(int a) {
		System.out.println("인자값 : 정수 " + a);
	}
	
	void aa(boolean a) {
		System.out.println("인자값 : boolean " + a);
	}
	
	void aa(int a, int b) {
		System.out.println("인자값1 : 정수 " + a);
		System.out.println("인자값2 : 정수 " + b);
	}
	
	boolean aa(String s){
		System.out.println("인자값 : " + s);
		return true;
	}
}

class Book {
	String title;
	int price;
	String author;
	
	void setData(String t) { // 제목만
		title = t;
	}
	/*void setData(String a) {
		author = a;
	}
		에러! 매개변수 이름이 다르다고 해서 무조건 오버로드 가능한 건 아님!
		호출 시 어떤 메소드를 실행해야 하는 지 알 수 없기 때문 (예 a.setData("피카츄");) 
	*/
	void setData(String t, int p) { // 제목, 가격
		title = t;
		price = p;
	}
	void setData(String t, int p, String a) {
		title = t;
		price = p;
		author = a;
	}
	
	void printData() {
		System.out.println("제목 : " + title);
		System.out.println("가격 : " + price + "원");
		System.out.println("저자 : " + author);
	}
}
public class Test01 {
	public static void main(String[] args) {
		My my = new My();
		my.aa();
		my.aa(10); 
		my.aa(true);
		
		System.out.println();
		System.out.println(10);
		System.out.println(true);
		
		Book b1 = new Book();
		b1.setData("자바의 정석", 35000, "남궁");
		Book b2 = new Book();
		b2.setData("해리포터", 12000);
		Book b3 = new Book();
		b3.setData("이것이 자바다");
		
		b1.printData();
		b2.printData();
		b3.printData();
	}
}




