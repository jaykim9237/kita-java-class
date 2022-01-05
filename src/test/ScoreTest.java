package test;

import java.util.HashSet;
import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s =new Student(null, 0, 0, 0, 0, 0);
	
		
		System.out.print("몇명의 학생 성적을 입력 하시겠습니까? ");
		int howmany = sc.nextInt();
		HashSet<Student> stu = new HashSet<Student>();
		for (int i = 0; i < howmany; i++) {
			System.out.printf("[%d번째 학생 등록]%n", i+1);
			System.out.print("이름 :");
			String name = sc.next();
			System.out.print("학번 :");
			int stdNo = sc.nextInt();
			System.out.print("반 :");
			int ban = sc.nextInt();
			System.out.print("국어 :");
			int kor = sc.nextInt();
			System.out.print("영어 :");
			int eng = sc.nextInt();
			System.out.print("수학 :");
			int mat = sc.nextInt();
			//hashset에 저장
			Student a = new Student(name, stdNo, ban, kor, eng, mat);
			//성공하면
			stu.add(a);
			System.out.println("등록성공!");
			//실패하면 
			
		}//for 
		
		//학생정보 출력
		System.out.println("=== 등록 학생 정보 (학번 순서로 정렬) ===");
		for(Student student : stu) {
			System.out.println(student);
		}
		
		//학생 성적정보 출력
		System.out.println("=== 등록 학생 정보 (평균값으로 정렬) ===");
		
		
	}//main

}
