package day08.basic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// ArrayList : ������ �迭 ( �ʱ� ���� : 10ĭ --> ���ķ� 10ĭ�� �þ�� ���� �⺻ )
// LinkedList : ���Ḯ��Ʈ ���� 

class Pokemon {
	String name;
	int level;
	Pokemon(String name, int level){
		this.name = name;
		this.level = level;
	}
	public String toString() { // Object���� ��������
		return "[" + name + ", lv." + level + "]";
	}
}
public class Test01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		
		// ���� �߰� : add(Object ������)
		
		// ���� ���� : add(index ��ġ, Object ������)
		
		list.add(1); 
		list.add(3.14); 
		list.add(new Pokemon("��ī��", 10));
		list.add(1, "ABC"); 
		System.out.println(list.toString());
		
		
		// ���� ���� : Object get(int �ε���) 
		//  = index�� ���� ������ 
		Integer e1 = (Integer)list.get(0);
		System.out.println(e1);
		
		Pokemon p = (Pokemon)list.get(3);
		System.out.println(p);
		
		// ���� ����(��ü) : set(int index, Object newElement)
		// index�� ���Ҹ� �� ���ҷ� ��ü
		list.set(2, "������"); 
		System.out.println(list);
		
		// ���� ���� : remove(int index)  : ~��° ���� ���� 
		// 			remove(Object element) : ~�� ����
		
		// "������" ����� 
		// ���1. list.remove(2);
		// ���2. list.remove("������"); 
		
		list.add(1000);
		System.out.println(list);
		
		list.remove( (Object)1000 ); 
		System.out.println(list);
		
		Integer i1 = new Integer(100); 
		Integer i2 = new Integer(100); 
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode()); // ���尴ü���� �˸���(Value)�� ���� ���� ��ü ���)
		
		// ���� �˻� : boolean contains(Object �˻��� ����)
		boolean bool = list.contains("ABC"); 
		System.out.println(bool); // true
		
		// �ٸ� â��(�÷���)�� ���� : addAll(Collection �ٸ�â��) 
		LinkedList list2 = new LinkedList();
		list2.add('��');
		list2.add('��');
		list2.add('��');
		
		list.addAll(list2);
		System.out.println(list); 
		// [1, ABC, ������, [��ī��, lv.10], ��, ��, ��]

		// ���� ��ġ ã�� : int indexOf(Object ����)
		int index = list.indexOf('��'); 
		System.out.println(index); // 4
		
		System.out.println(list.size()); // 7 (���� ���� ����)
		
		// �迭�� ����� : Object[] toArray()
		Object[] arr = list.toArray();
		
		Object[] arr2 = new Object[ list.size() ];
		list.toArray(arr2); 
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
 		// Iterator ������ : iterator() 
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// ==> for�� ���� ���� 
		for(int i = 0; i < list.size(); ++i) {
			System.out.println( list.get(i) );
		}
		
		// ��� ���� : clear()
		list.clear();
		System.out.println(list); // []
	}
}










