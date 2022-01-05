package scoreTest;
import java.util.Scanner;

public class Q2Answer {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("첫 번째 숫자 입력: ");
	int num1 = sc.nextInt();
	System.out.print("두 번째 숫자 입력: ");
	int num2 = sc.nextInt();
	
	
	//잉? 작은거 부터 작성하는 것 안했다...
	int start, end = 0;
	if(num1 > num2) {
		start = num2;
		end = num1;
	}else {
		start = num1;
		end = num2;
	}
	
	
	for (int i = start; i <= end; i++) {
		System.out.print(i + " ");
		}	
	}
}