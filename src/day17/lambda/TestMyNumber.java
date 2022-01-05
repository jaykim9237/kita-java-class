package day17.lambda;

public class TestMyNumber {
 public static void main(String[] args) {
	MyNumber max = (x,y) -> (x >= y) ? x : y;
	System.out.println(max.genMax(10, 20));
}
}
