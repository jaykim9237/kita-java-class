package lotto;

import java.util.HashSet;

public class LottoTest {
	/*
	 * 1.메인메뉴 출력(종료메뉴를 선택할 때 까지 반복 수행한다.)
	 * -1)로또구매
	 * -2)구매한 로또번호 확인
	 * -3)추첨결과 확인
	 * -4) 종료
	 * 2. 선택메뉴 번호에 따른 분기처리
	 * -1)로또구매 -구매 횟수를 입력받는다. 
	 *     -각각의 게임에 대해 로또번호를 직접 입력할 것인지, 
	 *     -자동 선택을 할 것인짖를 무고 그에 맞게 처리한다.
	 *     -생성된 로또 번호를 ArrayLost<HashSet<Integer>>에 저장한다.
	 * -2) 구매한 로또 번호를 보여준다. 구매한 로또번호가 없을시에는 "로또를 먼저 구매하세요!"라는 문구를 출력한다.
	 * -3) 추첨결과를 보여준다.
	 *     -구매한 로또번호가 없을기에는 "로또를 먼저 구매하세요"라는 문구를 출력
	 *     -추첨결과를 맞춘 번호의 개수에 따라 0:꽝 1:꽝 3개 : 4등 ...6개: 1등으로 표기하여 보여준다.
	 * -4 )프로그램을 종료한다.
	 * */
	public static void main(String[] args) {
		
		LottoManager lm  = new LottoManager();
		HashSet<Integer> result = new HashSet<Integer>();
		result = lm.makeLottoNumber();
	}

}
