package day08.basic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// ArrayList : 무제한 배열 ( 초기 개수 : 10칸 --> 이후로 10칸씩 늘어나는 것이 기본 )
// LinkedList : 연결리스트 형태 

class Pokemon {
	String name;
	int level;
	Pokemon(String name, int level){
		this.name = name;
		this.level = level;
	}
	public String toString() { // Object한테 물려받음
		return "[" + name + ", lv." + level + "]";
	}
}
public class Test01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		
		// 원소 추가 : add(Object 새원소)
		
		// 원소 삽입 : add(index 위치, Object 새원소)
		
		list.add(1); 
		list.add(3.14); 
		list.add(new Pokemon("피카츄", 10));
		list.add(1, "ABC"); 
		System.out.println(list.toString());
		
		
		// 원소 보기 : Object get(int 인덱스) 
		//  = index번 원소 꺼내기 
		Integer e1 = (Integer)list.get(0);
		System.out.println(e1);
		
		Pokemon p = (Pokemon)list.get(3);
		System.out.println(p);
		
		// 원소 수정(대체) : set(int index, Object newElement)
		// index번 원소를 새 원소로 대체
		list.set(2, "ㅋㅋㅋ"); 
		System.out.println(list);
		
		// 원소 삭제 : remove(int index)  : ~번째 원소 삭제 
		// 			remove(Object element) : ~를 삭제
		
		// "ㅋㅋㅋ" 지우기 
		// 방법1. list.remove(2);
		// 방법2. list.remove("ㅋㅋㅋ"); 
		
		list.add(1000);
		System.out.println(list);
		
		list.remove( (Object)1000 ); 
		System.out.println(list);
		
		Integer i1 = new Integer(100); 
		Integer i2 = new Integer(100); 
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode()); // 포장객체들은 알맹이(Value)가 같은 같은 객체 취급)
		
		// 원소 검색 : boolean contains(Object 검색할 원소)
		boolean bool = list.contains("ABC"); 
		System.out.println(bool); // true
		
		// 다른 창고(컬렉션)랑 병합 : addAll(Collection 다른창고) 
		LinkedList list2 = new LinkedList();
		list2.add('가');
		list2.add('나');
		list2.add('다');
		
		list.addAll(list2);
		System.out.println(list); 
		// [1, ABC, ㅋㅋㅋ, [피카츄, lv.10], 가, 나, 다]

		// 원소 위치 찾기 : int indexOf(Object 원소)
		int index = list.indexOf('가'); 
		System.out.println(index); // 4
		
		System.out.println(list.size()); // 7 (현재 원소 개수)
		
		// 배열로 만들기 : Object[] toArray()
		Object[] arr = list.toArray();
		
		Object[] arr2 = new Object[ list.size() ];
		list.toArray(arr2); 
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
 		// Iterator 얻어오기 : iterator() 
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// ==> for문 보다 좋다 
		for(int i = 0; i < list.size(); ++i) {
			System.out.println( list.get(i) );
		}
		
		// 모두 삭제 : clear()
		list.clear();
		System.out.println(list); // []
	}
}










