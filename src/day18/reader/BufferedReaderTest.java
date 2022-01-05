package day18.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			//Ű���� �Է��� ����Ʈ ���ε� ĳ���ͷ� �ٲٰڴٴ� ������ 
			BufferedReader br = new BufferedReader(isr);
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
