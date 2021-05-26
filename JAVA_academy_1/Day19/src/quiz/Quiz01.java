package quiz;
/*
 * �θ�Ŭ���� : Book 
 *   �ʵ� : å�̸�(title), ����(author), ����(price)
 *   
 * �ڽ�Ŭ���� : 
 * 	ComicBook 
 * 	  �߰� �ʵ� : ���ΰ�(hero) ���ǻ�(publisher)
 * 
 *  NovelBook
 *    �߰� �ʵ� : �帣(genre) 
 *    
 *  TextBook
 *    �߰� �ʵ� : ����(subject), ���ǻ�(publisher)
 *    
 *  ==> �ڽ�Ŭ������ ������ (������� ���� ��) �߰� 
 *      �޼ҵ� �߰�
 */
class Book {
	String title;
	String author;
	int price;
	void print() {
		System.out.println("���� : " + title);
		System.out.println("���� : " + author);
		System.out.println("���� : " + price + "��");
	}
}
class ComicBook extends Book {
	String hero;
	String publisher;
	void printComicBook() {
		print();
		System.out.println("���ΰ� : " + hero);
		System.out.println("���ǻ� : " + publisher);
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
		b1.hero = "���۸�"; 
		b1.title = "���۸� �ϴ��";
		b1.price = 3000;
		b1.author = "��ī��";
		b1.publisher = "�ڹ����ǻ�";
		b1.printComicBook();
	}
}








