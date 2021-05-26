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

class Pokemon implements Serializable{ // Serializable : 직렬화 가능한(스트림을 통과할 수 있는)
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
			fOut = new FileOutputStream("objects.pok");// 주 스트림
			oOut = new ObjectOutputStream(fOut); // 보조 스트림
			
			oOut.writeObject(new Pokemon("피카츄", 10));
			oOut.writeObject(new Pokemon("라이츄", 20)); 
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
		System.out.println("객체 저장 완료!");
	}
}



