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
		
		System.out.println("=== ��� �л� ���� (�й� ������ ����) ===");
		students.stream().sorted().forEach(s -> System.out.println(s));
		
		System.out.println("===��� �л� ���� ���� (��հ����� ����) ===");
		/*students.stream().sorted(new Comparator<StudentAnswer>() {
			public int compare(StudentAnswer s1, StudentAnswer s2) {
				return(int)s1.getAvg() - (int)s2.getAvg();
			}
		}).forEach(s -> System.out.printf("%s, �հ�:%d, ���:%.2f%n", s, s.getSum(), s.getBan()));
		*/
		students.stream().sorted((s1, s2)-> (int)s1.getAvg() - (int)s2.getAvg()).forEach(s -> System.out.println(s));
		
		
		test.generateReport(students);
	}
	
	///�Ǵ� students.stream().sorted(s1, s2) -> (int)s1.getAvg() - (int)s2.getAvg()).forEach(s -> System.out.println(s));
	
	public void generateReport(HashSet<StudentAnswer> students) {
		System.out.println("===�����͸� �����մϴ�.===");
		ArrayList<StudentAnswer> al = new ArrayList<StudentAnswer>(students);
		Collections.sort(al, (s1, s2) -> (int)s1.getAvg() - (int)s2.getAvg());
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt"))){
			for(StudentAnswer s : al) {
				bw.write(String.format("%s, �հ�:%d, ���:%.2f%", s, s.getSum(), s.getAvg()));
				bw.newLine();
			
		}
		
	}catch (IOException ioe){
		ioe.printStackTrace();
	}
}
	
	public HashSet<StudentAnswer> inputScore(){
		HashSet<StudentAnswer> students = new HashSet<StudentAnswer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====�����Է�====");
		System.out.print("����� �л� ������ �Է� �Ͻðڽ��ϱ�? ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.printf("[%d��° �л� ���]%n", i+1);
			System.out.print("�̸� :");
			String name = sc.next();
			System.out.print("�й� :");
			String stdNo = sc.next();
			System.out.print("�� :");
			int ban = sc.nextInt();
			System.out.print("���� :");
			int kor = sc.nextInt();
			System.out.print("���� :");
			int eng = sc.nextInt();
			System.out.print("���� :");
			int mat = sc.nextInt();
		
				StudentAnswer s = new StudentAnswer(name, stdNo, ban, kor, eng, mat);
			
				if(students.add(s)) {
					System.out.println("��ϼ���");
				}else {
					System.out.println("�̹� ��� �� ");
					i--;
				}
		}//for

		return students;
	}
}//class