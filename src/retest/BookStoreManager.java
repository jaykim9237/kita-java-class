package retest;

import java.util.HashSet;

public class BookStoreManager {
	private HashSet<Book> bookList = new HashSet<Book>();
	private HashSet<Novel> novelList = new HashSet<Novel>();
	private HashSet<Magazine> magaList = new HashSet<Magazine>();
	
	
	//������� --���̵��ε� �� ���蹮���� �Ҹ����� �����غ���
	public void insertBook(Book book) {
		bookList.add(book);
		//���� �Ѿ �Ҽ��̶� ���� ������ ��� ������� �����غ���
	}
	
	public void insertNovel(Novel novel) {
		novelList.add(novel);
		//���� �Ѿ �Ҽ��̶� ���� ������ ��� ������� �����غ���
	}
	
	public void insertMaga(Magazine maga) {
		magaList.add(maga);
		//���� �Ѿ �Ҽ��̶� ���� ������ ��� ������� �����غ���
	}
	
	//�������� ���� �˻�
	@SuppressWarnings("null")
	public Book searchBookTitle(String title) throws RecordNotFoundException{
		Book result = null;
		for(Book b : bookList) {
			if(title.equals(result.getTitle())) {
				result = b;
				break;
			}
		}//for
		if(result == null) throw new RecordNotFoundException("�˻� ����� �����ϴ�.");
	return result;
	}
	
	//ID(�����κй�ȣ)�� �˻�
	@SuppressWarnings("null")
	public Book searchBookId(String id) throws RecordNotFoundException{
		Book result = null;
		for(Book bb : bookList) {
			if(id.equals(result.getId())) {
				result = bb;
				break;
			}
		}//for
		if(result == null) throw new RecordNotFoundException("�˻� ����� �����ϴ�.");
	return result;
	}
	
	//��ϵ� ��� �������� ��ȯ å�̶� �Ҽ� ���� ���θ� �𸣰����ϱ� ��λ̰� ���̵� �����Ŵ� ������
	public HashSet<Book> showAll(){
		return bookList;
	}
	
	//�Ҽ�å ��ϸ� �����Ͽ� ��ȯ
	public HashSet<Novel> novelAll(){
		return novelList;
		
	}

	
	//����å ��ϸ� �����Ͽ� ��ȯ
	public HashSet<Magazine> magaAll(){
			return magaList;
		
	}

	

}
