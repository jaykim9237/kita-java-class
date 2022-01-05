package day13.string;

public class StringBufferTest {
	public static void main(String[] args) {
		String str = "select";
		int lasting	= 100;
		
		//여기는 스트링으로 다 돌린 것이고 
		long startTime = System.currentTimeMillis();
		String newStr = "";
		for (int i = 0; i < lasting; i++) {
			newStr += str;
		}
		long endTime = System.currentTimeMillis();
		//저 위에 시작이랑 마지막에 끝나는 시간을 찍으면 그 차이가 걸린 시간인 것이지 
		System.out.println("[String +]" + (endTime - startTime));
		
		
		//여기는 스트링버퍼를 사용하는 중인 것이지 
		startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < lasting; i++) {
			buffer.append(str);
		}
		endTime = System.currentTimeMillis();
		//저 위에 시작이랑 마지막에 끝나는 시간을 찍으면 그 차이가 걸린 시간인 것이지 
		System.out.println("[String +]" + (endTime - startTime));
		
	}
}
