package day07.basic;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/*
 * java.util ��Ű�� 
 *  1. Date Ŭ���� : ��¥ ����
 *    --> ��� : Calendar
 *    
 *  2. Calendar ( ���� X )
 *  
 *  3. GregorianCalendar ( ���� O )
 *  
 *  (4. SimpleDateFormat (java.text ��Ű��)) 
 * ---------------------------------------------
 *  5. Collections 
 */

import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d);
		
		System.out.println(d.getTime());// == System.current..()
		System.out.println(d.getDay());
		System.out.println(d.getHours());
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		
		
		//Calendar cal = Calendar.getInstance(); // Calendar ��ü �޾ƿ�
		// ==> �̱��� ��ü (��ü�� 1���� �����ؼ� ���)
		
		GregorianCalendar cal = new GregorianCalendar();
		
		cal.set(Calendar.YEAR, 2004);
		cal.set(Calendar.MONTH, 1);
		System.out.println(cal.get( Calendar.YEAR ) );
		System.out.println(cal.get( Calendar.MONTH ) );
		System.out.println(cal.get( Calendar.DATE ) );
		System.out.println(cal.get( Calendar.DAY_OF_WEEK ) );
		System.out.println(cal.get( Calendar.HOUR ) );
		System.out.println(cal.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss G a E");
		String date = sdf.format(System.currentTimeMillis());
		System.out.println(date); // 2019/03/21 19:21:37 ���� ����
	}
}













