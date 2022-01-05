package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

import jdk.nashorn.internal.ir.CatchNode;

public class ScoreTestAnswer {

	public static void main(String[] args) {
		
		ScoreTestAnswer test = new ScoreTestAnswer();
		HashSet<StudentAnswer> students = test.inputScore();
		
		System.out.println("=== 등록 학생 정보 (학번 순서로 정렬) ===");
		students.stream().sorted().forEach(s -> System.out.println(s));
		
		System.out.println("===등록 학생 성적 정보 (평균값으로 정렬) ===");
		/*students.stream().sorted(new Comparator<StudentAnswer>() {
			public int compare(StudentAnswer s1, StudentAnswer s2) {
				return(int)s1.getAvg() - (int)s2.getAvg();
			}
		}).forEach(s -> System.out.printf("%s, 합계:%d, 평균:%.2f%n", s, s.getSum(), s.getBan()));
		*/
		students.stream().sorted((s1, s2)-> (int)s1.getAvg() - (int)s2.getAvg()).forEach(s -> System.out.println(s));
		
		
		test.generateReport(students);
	}
	
	///또는 students.stream().sorted(s1, s2) -> (int)s1.getAvg() - (int)s2.getAvg()).forEach(s -> System.out.println(s));
	
	public void generateReport(HashSet<StudentAnswer> students) {
		System.out.println("===데이터를 저장합니다.===");
		ArrayList<StudentAnswer> al = new ArrayList<StudentAnswer>(students);
		Collections.sort(al, (s1, s2) -> (int)s1.getAvg() - (int)s2.getAvg());
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt"))){
			for(StudentAnswer s : al) {
				bw.write(String.format("%s, 합계:%d, 평균:%.2f%", s, s.getSum(), s.getAvg()));
				bw.newLine();
			
		}
		
	}catch (IOException ioe){
		ioe.printStackTrace();
	}
}
	
	public HashSet<StudentAnswer> inputScore(){
		HashSet<StudentAnswer> students = new HashSet<StudentAnswer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====성적입력====");
		System.out.print("몇명의 학생 성적을 입력 하시겠습니까? ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.printf("[%d번째 학생 등록]%n", i+1);
			System.out.print("이름 :");
			String name = sc.next();
			System.out.print("학번 :");
			String stdNo = sc.next();
			System.out.print("반 :");
			int ban = sc.nextInt();
			System.out.print("국어 :");
			int kor = sc.nextInt();
			System.out.print("영어 :");
			int eng = sc.nextInt();
			System.out.print("수학 :");
			int mat = sc.nextInt();
		
				StudentAnswer s = new StudentAnswer(name, stdNo, ban, kor, eng, mat);
			
				if(students.add(s)) {
					System.out.println("등록성공");
				}else {
					System.out.println("이미 등록 된 ");
					i--;
				}
		}//for

		return students;
	}
}//class