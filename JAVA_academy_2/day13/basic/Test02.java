package day13.basic;

import java.io.File;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * < File >
		 * ���Ͻý����� ����/���丮�� ����/����/��ȸ �� �� �� 
		 * ����ϴ� Ŭ����
		 * 
		 */
		File f1 = new File("/");
		System.out.println(f1);
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		
		File[] files = f1.listFiles();
		for(File ff : files) {
			System.out.print( ff.isFile() ? "���� : " : "���丮 : ");
			System.out.println( ff.getName());
		}
		
		// ���� ���� : mkdir
		File f2 = new File("/�޷�");
		if(f2.mkdir()) {
			System.out.println("���� ���� �Ϸ�!");
		}
		else {
			System.out.println("���� ���� ����..");
		}
		
		
		if(f2.delete()) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("���� ����");
		}
		// ����! ���丮 delete() ==> ���丮 �ȿ� �ƹ��͵� ����� �� 
		//      ���� delete() ==> ���� �ȿ� �ƹ� ���뵵 ����� ��
		
		File f3 = new File("../../");
		System.out.println(f3.getAbsolutePath());
		try {
			System.out.println(f3.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}




