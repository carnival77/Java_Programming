package day07.basic;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/*
 * java.util 패키지 
 *  1. Date 클래스 : 날짜 관련
 *    --> 대용 : Calendar
 *    
 *  2. Calendar ( 윤년 X )
 *  
 *  3. GregorianCalendar ( 윤년 O )
 *  
 *  (4. SimpleDateFormat (java.text 패키지)) 
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
		
		
		//Calendar cal = Calendar.getInstance(); // Calendar 객체 받아옴
		// ==> 싱글톤 객체 (객체를 1개만 생성해서 사용)
		
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
		System.out.println(date); // 2019/03/21 19:21:37 서기 오후
	}
}













