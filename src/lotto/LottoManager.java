package lotto;

import java.util.ArrayList;
import java.util.HashSet;

/*3개의 메서드
 * */
public class LottoManager {
/*
 * 1에서 45사이에 중복되지 않은 정수 6개를 생성하여 반환한다.*/
	public HashSet<Integer> makeLottoNumber(){
		HashSet<Integer> result = new HashSet<Integer>();
		//랜덤한 정수를 뽑아 여섯번 돌린다고 알 수 있어? 무한반복을 해서 해야 진짜 랜덤이 나올 수 있어 해쉬안에 원소의 개수가 6개가 됐을 때 빠져나가게 하면 되는 것이지
		
		return result;
	}
	
	/*
	 * 1에서 45사이에 중복되지 않은 정수 6개를 키보드로 입력 받아 변환한다. 중복되지 않은 6개여야 해 
	 * 만약, 입력 값이 숫자가 아닌 경우 예외 처리를 통해 숫자만 입력하세요를 출력하고 재입력을 받아야한다. 
	 * 또한 입력한 값이 1에서 45사이가 아니거나 이미 입력받은 값이어도 재입력을 받는다.
	 * 
	 * */
	
	public HashSet<Integer> inputLottoNumber(){
		HashSet<Integer> result = new HashSet<Integer>();
		
		return result;
	}
	
	/*
	 * 추첨메서드*
	 * 컴퓨터에의해 생성된 6개의 오또 번호와 사용자가 구매한 6개의 로또번호 n세트를 비교하여 맞춘결과(일치하는 수를 반환한다.)
	 * 컴퓨터에 의해 생성된 로또번호 6개 (x,x,x,x,x,x)--------> 사용자가 1번째 구매한 로또번호 6개 (y,y,y,y,y,y)랑 비교를 하는 것이지
	 * ---> 맞춘 결과  . . . . . .. . . 사용자가 구매한 n번째 구매한 로또번호 6개 
	 * 결과값: (M1,...,Mn) -> M은 맞춘 결과(일치하는 개수)*/
	
	//망할노무 해쉬셋
	
	
	public ArrayList<Integer> evaluateResult(HashSet<Integer> com, ArrayList<HashSet<Integer>> user){
		ArrayList<Integer> result = new ArrayList<Integer>();
		return result;
	}
}
