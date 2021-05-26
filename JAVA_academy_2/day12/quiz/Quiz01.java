package day12.quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Quiz01 {
	public static void main(String[] args) {
		// ����ڰ� exit�� �Է��� �� ���� jop���� ���ڿ��� ��� �Է� ����
		// �Էµ� ����� log.txt�� ����
		// �� ���� �տ� �ð��� ���
		
		// SimpleDateFormat Ŭ����
		// System.currentTimeMillis() 
		//SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		//String s = sdf.format(System.currentTimeMillis());
		
		StringBuffer log = new StringBuffer();
		String tmp;
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		FileWriter fw = null;
		
		while(true) {
			tmp = JOptionPane.showInputDialog("�ƹ��ų�(����� exit)");
			if("exit".equalsIgnoreCase(tmp)) {
				break;
			}
			log.append(sdf.format(System.currentTimeMillis()) + ">>" + tmp + "\r\n");
		}
		
		try {
			fw = new FileWriter("C:/Users\\PC\\Desktop\\log.txt");
			fw.write(log.toString());
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
