package test;

import java.util.HashSet;
import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s =new Student(null, 0, 0, 0, 0, 0);
	
		
		System.out.print("����� �л� ������ �Է� �Ͻðڽ��ϱ�? ");
		int howmany = sc.nextInt();
		HashSet<Student> stu = new HashSet<Student>();
		for (int i = 0; i < howmany; i++) {
			System.out.printf("[%d��° �л� ���]%n", i+1);
			System.out.print("�̸� :");
			String name = sc.next();
			System.out.print("�й� :");
			int stdNo = sc.nextInt();
			System.out.print("�� :");
			int ban = sc.nextInt();
			System.out.print("���� :");
			int kor = sc.nextInt();
			System.out.print("���� :");
			int eng = sc.nextInt();
			System.out.print("���� :");
			int mat = sc.nextInt();
			//hashset�� ����
			Student a = new Student(name, stdNo, ban, kor, eng, mat);
			//�����ϸ�
			stu.add(a);
			System.out.println("��ϼ���!");
			//�����ϸ� 
			
		}//for 
		
		//�л����� ���
		System.out.println("=== ��� �л� ���� (�й� ������ ����) ===");
		for(Student student : stu) {
			System.out.println(student);
		}
		
		//�л� �������� ���
		System.out.println("=== ��� �л� ���� (��հ����� ����) ===");
		
		
	}//main

}
