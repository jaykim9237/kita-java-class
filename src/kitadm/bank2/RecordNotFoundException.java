package kitadm.bank2;

public class RecordNotFoundException extends Exception {
	public RecordNotFoundException(String message) {
		super(message);
	}
	
	public RecordNotFoundException() {
		super("레코드를 찾지 못했습니다.");
	}
}
