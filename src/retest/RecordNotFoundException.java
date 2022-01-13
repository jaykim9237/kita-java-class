package retest;

public class RecordNotFoundException extends Exception{
	public RecordNotFoundException(String message) {
		super(message);
	}
	
	public RecordNotFoundException() {
		super("검색결과가 없습니다.");
	}
}
