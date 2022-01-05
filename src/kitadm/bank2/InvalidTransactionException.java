package kitadm.bank2;

public class InvalidTransactionException extends Exception {
	public InvalidTransactionException(String message) {
		super(message);
	}
	
	public InvalidTransactionException() {
		super("부적절한 거래가 발생되었습니다.");
	}
}
