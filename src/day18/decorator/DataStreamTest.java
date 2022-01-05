package day18.decorator;

import java.io.DataOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14F);
			dos.writeUTF("Test");
		} catch (IOException e) {
		e.printStackTrace();
		}
		try (FileInputStream fis = new FileInputStream("data.txt")){
			
		} catch (IOException e) {
		}
	}

}
//p548