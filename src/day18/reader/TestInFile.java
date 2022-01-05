package day18.reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInFile {
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			//Ű���� �Է��� ����Ʈ ���ε� ĳ���ͷ� �ٲٰڴٴ� ������ 
			BufferedReader br = new BufferedReader(isr);
			FileWriter fw = new FileWriter("test.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String line = null;	
			//���� ��ť��Ʈ���� ���°ž� 
			while((line = br.readLine()) !=null) {
				System.out.println(" �Է°� =" +line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}