package day05.basic;
/*
 * < Wrapper Classes (����Ŭ����) >
 * -> �����ڷ��� �����͸� '��üȭ'�� �� ����ϴ� Ŭ������ 
 *  Integer, Double, Float, Byte, Character, Boolean
 *  -------                       ---------
 *   int                            char
 *   
 *   �ڷ��� 
 *    1. �����ڷ��� 8���� 
 *    2. �����ڷ��� (Ŭ����, �������̽�, �迭, ..)
 */
public class Test04 {
	public static void main(String[] args) {
		Object[] arr = { 1, 3.14, "ABC", true }; 
		
		// 1 --> new Integer(1) ---> ���۷����� [0]�� ����
		// 3.14 --> new Double(3.14) ---> ���۷����� [1]�� ����
		// ...
		
		System.out.println(arr[0].toString());
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.TYPE);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		/*
		 * < Boxing�� Unboxing >
		 * 1. Boxing : ���õ�����--> ����Ŭ������ ��üȭ
		 * 2. Unboxing : ���尴ü�� �˸���(value)�� ��� ������
		 * 
		 */
		Integer num = new Integer(1);
		Integer num2 = 10; // 10 -> new Integer(10)���� ����ڽ�
		
		System.out.println(num + 1); // 2
		
	}
}








