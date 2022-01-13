package retest;

public class NobookException extends Exception{
	public NobookException(String message) {
		super(message);
	}
	
	public NobookException() {
		super("부적절한 거래가 발생되었습니다.");
	}
}
