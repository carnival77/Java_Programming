package quiz;
/*
 * 부모클래스 : Book 
 *   필드 : 책이름(title), 저자(author), 가격(price)
 *   
 * 자식클래스 : 
 * 	ComicBook 
 * 	  추가 필드 : 주인공(hero) 출판사(publisher)
 * 
 *  NovelBook
 *    추가 필드 : 장르(genre) 
 *    
 *  TextBook
 *    추가 필드 : 과목(subject), 출판사(publisher)
 *    
 *  ==> 자식클래스에 생성자 (마음대로 여러 개) 추가 
 *      메소드 추가
 */
class Book {
	String title;
	String author;
	int price;
	void print() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price + "원");
	}
}
class ComicBook extends Book {
	String hero;
	String publisher;
	void printComicBook() {
		print();
		System.out.println("주인공 : " + hero);
		System.out.println("출판사 : " + publisher);
	}
}
class NovelBook extends Book {
	String genre;
}
class TextBook extends Book {
	String subject;
	String publisher;
}
public class Quiz01 {
	public static void main(String[] args) {
		ComicBook b1 = new ComicBook();
		b1.hero = "슈퍼맨"; 
		b1.title = "슈퍼맨 일대기";
		b1.price = 3000;
		b1.author = "피카츄";
		b1.publisher = "자바출판사";
		b1.printComicBook();
	}
}








