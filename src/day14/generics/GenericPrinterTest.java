package day14.generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPinter<Powder> powderPrinter = new GenericPinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		//만약에 이래놓고 플라시틱을 넣으면 오류가 생기는거야 런타임이 아니고 컴파일할 떼
	}
	
	//뜬금없이 스트링이 나올수도 있잖아 그러면 안되지 우리는 파우더 이거나 플라스틱이어야지 그러니까 한정지을 수 있는거야. 특정 틀래스로 제한을 하고싶을 때 extends를 사용하는거지
	//에러가 날거야 왜냐하면 메터리얼의 하위가 안니이기 때문에 
	//GenericPinter<String> p = new GenericPinter<String>();
}
