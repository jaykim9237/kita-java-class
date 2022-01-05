package kutada.school.ui;

import java.util.Scanner;

import kutada.school.model.SchoolManager;
import kutada.school.vo.Employee;
import kutada.school.vo.Person;
import kutada.school.vo.Student;
import kutada.school.vo.Teacher;

public class SchoolTest {
	
	private static Scanner sc = new Scanner(System.in);
	private SchoolManager sm = new SchoolManager(50);
	
	public static void main(String[] args) {
		
		SchoolTest st = new SchoolTest();
		while(true) {
			st.printMainMenu();
			System.out.print("�޴� ��ȣ�� �����ϼ��� : ");
			int process = sc.nextInt();
			 //�б�ó��
			switch(process){
			case 1 :
				st.printManagerMenu();
				 break;
			case 2 :
				System.out.println("ã�����ϴ� ������ �ֹι�ȣ�� �Է��ϼ���.");
				String find_ssn = sc.next();
				Person p = st.sm.findPerson(find_ssn);//p�� �޾���
				if(p==null) {
					System.out.println("���� ����Դϴ�.");
				} else {
					p.printInfo();
				}
				
				break;
			case 3 :
				System.out.println("�����ϰ��� �ϴ� ������ �ֹι�ȣ�� �Է��ϼ���.");
				String delete_ssn = sc.next();
				if(st.sm.deletePerson(delete_ssn)) {
					System.out.println("���� ����!");
				} else {
					System.out.println("�����͸� ã�� ���߽��ϴ�.");
				}
				//������ ������ ���������� ������ ������ ������ ���̿����ϱ� ����Ʈ�� �Ϸ��� �װ� ������ �ؾ��ϴ� ������
				break;
				//�۽�Ŭ���� Ÿ���� �迭�� ����� ��. �迭�� �������� ���� �� �־�. Ŭ������ �ϳ��� Ÿ������, ������, �װ� �迭�� �������.
			case 4 : Person []  pe = st.sm.getAllpersons();
					 for(int i=0; i<st.sm.getPersonsLength(); i++) {
						 pe[i].printInfo();
					 }
				
				break;
			case 9 :
				System.exit(0);
					 
			}//switch
			
			
			//1.����Ʈ �ϰ� �����Ұ��� �޾ƾ��� 
			//2.�׸��� ���� �б� ó���� ������� ��¾�Ÿ� ��������
			//2-1. ���� ��ϸ޴��� �����ϸ� ����� ���� �޴��� ���� �ְ� ���� �޴� �̵��� �����ϱ� �������� ��� ��Ʃ�� �ݺ�ó���Ѵ�. 
			//
		}//while
		
		
	}

	
	private void printMainMenu() {
		System.out.println("��������������������������������������������");
		System.out.println("| KUTA DM �л���� �ý���	 |");
		System.out.println("��������������������������������������������");
		System.out.println("��������������������������������������������");
		System.out.println("|1. ���                            |");
		System.out.println("|2. ã��                            |");
		System.out.println("|3. ����                            |");
		System.out.println("|4. ��ü���                        |");
		System.out.println("|9. ����                            |");
		System.out.println("��������������������������������������������");
	}//printMain
	
	private void printManagerMenu() {
		System.out.println("��������������������������������������������");
		System.out.println("| KUTA DM �����ο� ���	 |");
		System.out.println("��������������������������������������������");
		System.out.println("��������������������������������������������");
		System.out.println("|1. ����                                |");
		System.out.println("|2. �л�                                |");
		System.out.println("|3. ���                             |");
		System.out.println("|4. �����޴�                          |");
		System.out.println("��������������������������������������������");
		System.out.print("�޴� ��ȣ�� �����ϼ��� : ");
		int process = sc.nextInt();
		
		switch(process){
		case 1 : Teacher t = sm.makeTeacher();
				 if(sm.addPerson(t)) {
					 System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				 } else {
					 System.out.println("��� ����!");
				 }
				 
			 break;
		case 2 : Student s = sm.makeStudent();
				if( sm.addPerson(s)) {
				 System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				} else {
					 System.out.println("��� ����!");
				}
			break;
		case 3 :
				Employee e = sm.makeEmployee();
				if(sm.addPerson(e)) {
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				} else {
					 System.out.println("��� ����!");
				}
			break;
		case 4 : return;
			//���� �޴��� ���ư��� �� 
		
		}//switch
	}//printmanagermenu
	
	//���� �ο���� ������ ȭ�� �����
}//class
