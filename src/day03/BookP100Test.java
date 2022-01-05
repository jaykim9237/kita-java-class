package day03;

import java.util.Scanner;


class BookP100Test
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("성적을 입력하세요 : ");
		int score = sc.nextInt();
		

		if(score >= 90)
			System.out.println("A");

		else if(80<=score && score<90)
			System.out.println("B");

		else if(70<=score && score<80)
			System.out.println("C");

		else if(60<=score && score<70)
			System.out.println("D");
		
		else//어떤 분이 질문을 했는데 else if로 60미만일때 오류가 나오는게 로컬 변수에 초기화가 안도ㅐ서라고 하셨는데...
			System.out.println("F"); //아....5<ㅇ<5일 필요가 없었네... else if가 어떤 뜻인지 이해를 못해서 생긴 오류이다.
		//답안지 사진으로 찍어두었으니 다시 풀어보기 
		
	}
}
