package day14.generics;

public class Powder extends Material{
	//두프린팅이 오버라이딩 된거야 
	public void doPrinting() {
		System.out.println("파우더 재료를 출력합니다.");
	}
	public String toString() {
		return "재료는 파우더입니다.";
	}
}
