package kutada.school.model;

import java.util.Scanner;

import kutada.school.vo.Employee;
import kutada.school.vo.Person;
import kutada.school.vo.Student;
import kutada.school.vo.Teacher;

 

/*학사 관리 프로그램의 업무로직 클래스
 * 0.어떤 사람을 등록할 것인가? 교사? 학생? 교직원?
 * 1.학생, 교수, 교직원 정보 등록
 * 2.등록된 정보를 검색
 * 3.등록된 정보를 삭제
 * 4.등록된 모든 정보를 반환
 * */
public class SchoolManager {
	//학생, 교수 ,교직원 정보를 저장
	private Person persons[];//여기에  = new Person[50]; 도 가능은 했을거야 그런데 그러면 50으로 고정이 되는거니까 
	//Person 배열에 데이터를 저장할 다음 방 번호이자 현재 등록된 정보의 개수 
	private int index;
	private String name, ssn;
	private int age;
	
	private Scanner sc = new Scanner(System.in);
	
	//매니저의 객체를 생성할 때 마다 그 수를 정할 수 있게 하려고 만든 것
	public SchoolManager(int cap) {
		persons = new Person[cap];
	}
	Person member = new Person(name, age, ssn);
	
	/*
	 * 학생, 교수, 교직원의 정보를 Person 배열에 들록한다. 
	 * 단, 등록된 정보의 주민번호는 중복이 될 수 없다. 
	 * 만약에 등록을 성공하면 참을 실패(중복 ssn이 존재)하면 거짓을 반환한다.*/
	
	//등록할 정보를 매개변수로 받아야하지
	public boolean addPerson(Person p) {
		boolean result = false;
		
		//중복인지 보는 포문
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
	 * 매개변수로 전달이 된 주민번호에 해당하는 데이터를 검색하여 결과로 반환한다.
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
	
	/*매개변수로 전달 된 주민번호에 해당하는 데이터를 삭제한다.
	 * 삭제를 성공하면 참을 실패하면 거짓을 반환한다.*/
	public boolean deletePerson(String ssn) {
		boolean result = false;
		
		for(int i=0; i<index; i++) {
			if(persons[i].getSsn().equals(ssn)) {
				/*아래 오류를 어떻게 해결하지*/
				int end = index;
				if(index == persons.length)
					end -=1;
				for (int j = i; j < end; j++) {
					/*근데 이렇게 되면 j가 길이가 꽉찰수도 있잖아. 오류지 그럼 어떻게 해야할까?*/
					persons[j] = persons[j+1];
				}//inner for
				result = true;
				index--;
				break;
			}//if
		}//outfor
		
		//같은 것을 먼저 찾아야지 그걸 먼저 포를 한번 돌렸어야해 바로 한번에 할 수는 없지 
		//참으로 내고 브레이크를 했어야해 
		/*int i = 0;
		if(persons[i].getSsn() == ssn) {
			persons[i] = null;
			/이렇게 하면 항상 인덱스 마이너스 1까지만 하는거지
			for (int j = i+1;  j<= index-1; j++) {
				persons[i] = persons[j];
			}//for
			index--;
			return true;
		}//if
		else
			System.out.println("해당하는 데이터가 없습니다.");*/
		//해당하는 데이터가 없으면?
		
		return result;
	}
	
	public Person[] getAllpersons() {
		return persons;
	}
	
	public int getPersonsLength() {
		return index;
	}
	
	
	//스캐너를 받는게 반복되고 있잖아 이거를 빼보자
	private void commonInput() {
		//해결방법1. 여기에 있는 변수들을 로컬변수가 아니라 멤버변수로 선언하는 것
		System.out.println("이름 : ");
		//로컬로 각각 선언을 해줬었는데 이제는 멤버변수가 된거지
		name = sc.next();
		System.out.println("나이 : ");
		age = sc.nextInt();
		System.out.println("주민번호 : ");
		ssn = sc.next();
	}
	/*키보드로 학생정보를 입력 받아 student 객체를 생성하여 반환한다.*/
	public Student makeStudent() {
		Student s = null;
		commonInput();
		System.out.print("학번 : ");
		String stdNo = sc.next();
		System.out.println();
		//메서드를 따로 만들면 지역변수로 받은 입력들이 달라지니까 여기서는 읽을 수 없는거지 
		s = new Student(name, age, ssn, stdNo);
	
		return s;
	}
	
	public Teacher makeTeacher() {
		Teacher t = null;
		commonInput();
		System.out.print("과목 : ");
		String subject = sc.next();
		System.out.println();
		t = new Teacher(name, age, ssn, subject);
		
		return t;
	}
	
	public Employee makeEmployee() {
		Employee e = null;
		commonInput();
		System.out.print("근무부서 : ");
		String dept = sc.next();
		System.out.println();
		e = new Employee(name, age, ssn, dept);
		return e;
	}
	

}
