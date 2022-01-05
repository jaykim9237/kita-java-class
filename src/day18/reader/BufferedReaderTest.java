package day18.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			//키보드 입력은 바이트 값인데 캐릭터로 바꾸겠다는 뜻이지 
			BufferedReader br = new BufferedReader(isr);
			String line = null;	
			//널은 다큐먼트에서 나온거야 
			while((line = br.readLine()) !=null) {
				System.out.println(" 입력값 =" +line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
