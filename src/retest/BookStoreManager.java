package retest;

import java.util.HashSet;

public class BookStoreManager {
	private HashSet<Book> bookList = new HashSet<Book>();
	private HashSet<Novel> novelList = new HashSet<Novel>();
	private HashSet<Magazine> magaList = new HashSet<Magazine>();
	
	
	//도서등록 --보이드인데 왜 시험문제는 불린인지 생각해보기
	public void insertBook(Book book) {
		bookList.add(book);
		//북을 넘어서 소설이랑 잡지 정보를 어떻게 등록할지 생각해보자
	}
	
	public void insertNovel(Novel novel) {
		novelList.add(novel);
		//북을 넘어서 소설이랑 잡지 정보를 어떻게 등록할지 생각해보자
	}
	
	public void insertMaga(Magazine maga) {
		magaList.add(maga);
		//북을 넘어서 소설이랑 잡지 정보를 어떻게 등록할지 생각해보자
	}
	
	//제목으로 도서 검색
	@SuppressWarnings("null")
	public Book searchBookTitle(String title) throws RecordNotFoundException{
		Book result = null;
		for(Book b : bookList) {
			if(title.equals(result.getTitle())) {
				result = b;
				break;
			}
		}//for
		if(result == null) throw new RecordNotFoundException("검색 결과가 없습니다.");
	return result;
	}
	
	//ID(도서두분번호)로 검색
	@SuppressWarnings("null")
	public Book searchBookId(String id) throws RecordNotFoundException{
		Book result = null;
		for(Book bb : bookList) {
			if(id.equals(result.getId())) {
				result = bb;
				break;
			}
		}//for
		if(result == null) throw new RecordNotFoundException("검색 결과가 없습니다.");
	return result;
	}
	
	//등록된 모든 도서정보 반환 책이랑 소설 잡지 따로를 모르겠으니까 모두뽑고 아이디가 같은거는 버리자
	public HashSet<Book> showAll(){
		return bookList;
	}
	
	//소설책 목록만 추출하여 반환
	public HashSet<Novel> novelAll(){
		return novelList;
		
	}

	
	//잡지책 목록만 추출하여 반환
	public HashSet<Magazine> magaAll(){
			return magaList;
		
	}

	

}
