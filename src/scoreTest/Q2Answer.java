package scoreTest;
import java.util.Scanner;

public class Q2Answer {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("ù ��° ���� �Է�: ");
	int num1 = sc.nextInt();
	System.out.print("�� ��° ���� �Է�: ");
	int num2 = sc.nextInt();
	
	
	//��? ������ ���� �ۼ��ϴ� �� ���ߴ�...
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