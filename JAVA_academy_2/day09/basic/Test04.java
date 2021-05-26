package day09.basic;

import java.util.Scanner;
import java.util.TreeMap;

public class Test04 {
	public static void main(String[] args) {
		TreeMap<String, Person> map = new TreeMap<String, Person>();
		map.put("±èÇÇÄ«Ãò",new Person("±èÇÇÄ«Ãò", 10));
		map.put("ÀÌÇª¸°",new Person("ÀÌÇª¸°", 12));
		map.put("±è¶óÀÌÃò",new Person("±è¶óÀÌÃò", 5));
		
		Person p = new Person("Àå¶Ñ¹÷ÃÊ", 20);
		map.put(p.name, p);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("°Ë»öÇÒ ÀÌ¸§ : ");
		String name = sc.next();
		if(map.containsKey(name)) {
			System.out.println(map.get(name));
		}
		else {
			System.out.println("¹Ìµî·Ï ÀÎ¿ø");
		}
	}
}




