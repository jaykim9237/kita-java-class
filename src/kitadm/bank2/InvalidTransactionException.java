package kitadm.bank2;

public class InvalidTransactionException extends Exception {
	public InvalidTransactionException(String message) {
		super(message);
	}
	
	public InvalidTransactionException() {
		super("�������� �ŷ��� �߻��Ǿ����ϴ�.");
	}
}
