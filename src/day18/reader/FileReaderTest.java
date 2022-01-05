package day18.reader;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try(FileInputStream fr =new FileInputStream("reader.txt")) {
			int i;
	while((i= fr.read())!= -1) {
		System.out.println((char)i);
	}
	 	System.out.println("end");
	
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
}

