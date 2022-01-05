package day08Test;

import java.util.Scanner;

public class Test01Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int array [] = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.print("original: ");
		for(int a: array) {
			System.out.print(a+ ", ");
		}//for
		
		System.out.println();
		System.out.println("변경하고 싶은 위치 1을 입력하세요 : ");
		int index1 = sc.nextInt()-1;//우리가 생각하는 자리랑 1이 다르니까
		System.out.println("변경하고 싶은 위치 1을 입력하세요 : ");
		int index2 = sc.nextInt()-1;
		
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
		System.out.print("mew: ");
		for(int a: array) {
			System.out.print(a+ " ");
		}
	}//main

}
