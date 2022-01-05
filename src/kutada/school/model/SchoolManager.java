package kutada.school.model;

import java.util.Scanner;

import kutada.school.vo.Employee;
import kutada.school.vo.Person;
import kutada.school.vo.Student;
import kutada.school.vo.Teacher;

 

/*�л� ���� ���α׷��� �������� Ŭ����
 * 0.� ����� ����� ���ΰ�? ����? �л�? ������?
 * 1.�л�, ����, ������ ���� ���
 * 2.��ϵ� ������ �˻�
 * 3.��ϵ� ������ ����
 * 4.��ϵ� ��� ������ ��ȯ
 * */
public class SchoolManager {
	//�л�, ���� ,������ ������ ����
	private Person persons[];//���⿡  = new Person[50]; �� ������ �����ž� �׷��� �׷��� 50���� ������ �Ǵ°Ŵϱ� 
	//Person �迭�� �����͸� ������ ���� �� ��ȣ���� ���� ��ϵ� ������ ���� 
	private int index;
	private String name, ssn;
	private int age;
	
	private Scanner sc = new Scanner(System.in);
	
	//�Ŵ����� ��ü�� ������ �� ���� �� ���� ���� �� �ְ� �Ϸ��� ���� ��
	public SchoolManager(int cap) {
		persons = new Person[cap];
	}
	Person member = new Person(name, age, ssn);
	
	/*
	 * �л�, ����, �������� ������ Person �迭�� ����Ѵ�. 
	 * ��, ��ϵ� ������ �ֹι�ȣ�� �ߺ��� �� �� ����. 
	 * ���࿡ ����� �����ϸ� ���� ����(�ߺ� ssn�� ����)�ϸ� ������ ��ȯ�Ѵ�.*/
	
	//����� ������ �Ű������� �޾ƾ�����
	public boolean addPerson(Person p) {
		boolean result = false;
		
		//�ߺ����� ���� ����
		for(int i=0; i < index; i++) {
			if(persons[i].getSsn().equals(p.getSsn())) {
				return false;
			}
		}//for
		persons[index++] = p;
		result = true;
		return result;
	}//add person boolean
	
	/*
	 * �Ű������� ������ �� �ֹι�ȣ�� �ش��ϴ� �����͸� �˻��Ͽ� ����� ��ȯ�Ѵ�.
	 * */
	public Person findPerson(String ssn){
		Person result = null;
		
		for (int i = 0; i < index; i++) {
			if(persons[i].getSsn().equals(ssn)) {
				result = persons[i];
				System.out.println(result);
			}//if
		}//for
		return result;
	}//findperson
	
	/*�Ű������� ���� �� �ֹι�ȣ�� �ش��ϴ� �����͸� �����Ѵ�.
	 * ������ �����ϸ� ���� �����ϸ� ������ ��ȯ�Ѵ�.*/
	public boolean deletePerson(String ssn) {
		boolean result = false;
		
		for(int i=0; i<index; i++) {
			if(persons[i].getSsn().equals(ssn)) {
				/*�Ʒ� ������ ��� �ذ�����*/
				int end = index;
				if(index == persons.length)
					end -=1;
				for (int j = i; j < end; j++) {
					/*�ٵ� �̷��� �Ǹ� j�� ���̰� �������� ���ݾ�. ������ �׷� ��� �ؾ��ұ�?*/
					persons[j] = persons[j+1];
				}//inner for
				result = true;
				index--;
				break;
			}//if
		}//outfor
		
		//���� ���� ���� ã�ƾ��� �װ� ���� ���� �ѹ� ���Ⱦ���� �ٷ� �ѹ��� �� ���� ���� 
		//������ ���� �극��ũ�� �߾���� 
		/*int i = 0;
		if(persons[i].getSsn() == ssn) {
			persons[i] = null;
			/�̷��� �ϸ� �׻� �ε��� ���̳ʽ� 1������ �ϴ°���
			for (int j = i+1;  j<= index-1; j++) {
				persons[i] = persons[j];
			}//for
			index--;
			return true;
		}//if
		else
			System.out.println("�ش��ϴ� �����Ͱ� �����ϴ�.");*/
		//�ش��ϴ� �����Ͱ� ������?
		
		return result;
	}
	
	public Person[] getAllpersons() {
		return persons;
	}
	
	public int getPersonsLength() {
		return index;
	}
	
	
	//��ĳ�ʸ� �޴°� �ݺ��ǰ� ���ݾ� �̰Ÿ� ������
	private void commonInput() {
		//�ذ���1. ���⿡ �ִ� �������� ���ú����� �ƴ϶� ��������� �����ϴ� ��
		System.out.println("�̸� : ");
		//���÷� ���� ������ ������µ� ������ ��������� �Ȱ���
		name = sc.next();
		System.out.println("���� : ");
		age = sc.nextInt();
		System.out.println("�ֹι�ȣ : ");
		ssn = sc.next();
	}
	/*Ű����� �л������� �Է� �޾� student ��ü�� �����Ͽ� ��ȯ�Ѵ�.*/
	public Student makeStudent() {
		Student s = null;
		commonInput();
		System.out.print("�й� : ");
		String stdNo = sc.next();
		System.out.println();
		//�޼��带 ���� ����� ���������� ���� �Էµ��� �޶����ϱ� ���⼭�� ���� �� ���°��� 
		s = new Student(name, age, ssn, stdNo);
	
		return s;
	}
	
	public Teacher makeTeacher() {
		Teacher t = null;
		commonInput();
		System.out.print("���� : ");
		String subject = sc.next();
		System.out.println();
		t = new Teacher(name, age, ssn, subject);
		
		return t;
	}
	
	public Employee makeEmployee() {
		Employee e = null;
		commonInput();
		System.out.print("�ٹ��μ� : ");
		String dept = sc.next();
		System.out.println();
		e = new Employee(name, age, ssn, dept);
		return e;
	}
	

}
