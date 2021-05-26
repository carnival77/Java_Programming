package day14.basic;
/*
 * < ObjectInput/OutputStream >
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Pokemon implements Serializable{ // Serializable : ����ȭ ������(��Ʈ���� ����� �� �ִ�)
	String name;
	int level;
	Pokemon(String n, int lv){
		name = n;
		level = lv;
	}
	public String toString() {
		return name + "/lv." + level;
	}
}
public class Test01 {
	public static void main(String[] args) {
		FileOutputStream fOut = null;
		ObjectOutputStream oOut = null; 
		try {
			fOut = new FileOutputStream("objects.pok");// �� ��Ʈ��
			oOut = new ObjectOutputStream(fOut); // ���� ��Ʈ��
			
			oOut.writeObject(new Pokemon("��ī��", 10));
			oOut.writeObject(new Pokemon("������", 20)); 
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oOut != null) {
					oOut.close();
				}
				if(fOut != null) {
					fOut.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("��ü ���� �Ϸ�!");
	}
}



