package day14.basic;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test02 {
	public static void main(String[] args) {
		FileInputStream fIn = null;
		ObjectInputStream oIn = null;
		
		try {
			fIn = new FileInputStream("objects.pok");
			oIn = new ObjectInputStream(fIn);
			
//			Pokemon p1 = (Pokemon)oIn.readObject();
//			Pokemon p2 = (Pokemon)oIn.readObject();
//			
//			System.out.println(p1);
//			System.out.println(p2);
			while(true) {
				try {
					System.out.println( (Pokemon)oIn.readObject() );
				} catch(EOFException e) {
					break;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oIn != null) { oIn.close(); }
				if(fIn != null) { fIn.close(); }
			} catch(Exception e) { e.printStackTrace(); }
		}
	}
}
