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
			System.out.print("메뉴 번호를 선택하세요 : ");
			int process = sc.nextInt();
			 //분기처리
			switch(process){
			case 1 :
				st.printManagerMenu();
				 break;
			case 2 :
				System.out.println("찾고자하는 정보의 주민번호를 입력하세요.");
				String find_ssn = sc.next();
				Person p = st.sm.findPerson(find_ssn);//p로 받아줘
				if(p==null) {
					System.out.println("없는 결과입니다.");
				} else {
					p.printInfo();
				}
				
				break;
			case 3 :
				System.out.println("삭제하고자 하는 정보의 주민번호를 입력하세요.");
				String delete_ssn = sc.next();
				if(st.sm.deletePerson(delete_ssn)) {
					System.out.println("삭제 성공!");
				} else {
					System.out.println("데이터를 찾지 못했습니다.");
				}
				//삭제의 유무가 참거짓으로 나오는 블린으로 나오는 것이였으니까 프린트를 하려면 그걸 가지고 해야하는 것이지
				break;
				//퍼슨클래스 타입의 배열을 만드는 것. 배열은 뭐든지로 만들 수 있어. 클래스도 하나의 타입이지, 참조형, 그걸 배열로 만든거지.
			case 4 : Person []  pe = st.sm.getAllpersons();
					 for(int i=0; i<st.sm.getPersonsLength(); i++) {
						 pe[i].printInfo();
					 }
				
				break;
			case 9 :
				System.exit(0);
					 
			}//switch
			
			
			//1.프린트 하고 뭐를할건지 받아야지 
			//2.그리고 나서 분기 처리를 해줘야지 어쩐거를 실행할지
			//2-1. 만약 등록메뉴를 선택하면 등록한 서브 메뉴를 보여 주고 상위 메뉴 이동을 선택하기 전까지는 등록 메튜를 반복처리한다. 
			//
		}//while
		
		
	}

	
	private void printMainMenu() {
		System.out.println("┌────────────────────┐");
		System.out.println("| KUTA DM 학사관리 시스템	 |");
		System.out.println("└────────────────────┘");
		System.out.println("┌────────────────────┐");
		System.out.println("|1. 등록                            |");
		System.out.println("|2. 찾기                            |");
		System.out.println("|3. 삭제                            |");
		System.out.println("|4. 전체출력                        |");
		System.out.println("|9. 종료                            |");
		System.out.println("└────────────────────┘");
	}//printMain
	
	private void printManagerMenu() {
		System.out.println("┌────────────────────┐");
		System.out.println("| KUTA DM 관리인원 등록	 |");
		System.out.println("└────────────────────┘");
		System.out.println("┌────────────────────┐");
		System.out.println("|1. 교수                                |");
		System.out.println("|2. 학생                                |");
		System.out.println("|3. 운영진                             |");
		System.out.println("|4. 상위메뉴                          |");
		System.out.println("└────────────────────┘");
		System.out.print("메뉴 번호를 선택하세요 : ");
		int process = sc.nextInt();
		
		switch(process){
		case 1 : Teacher t = sm.makeTeacher();
				 if(sm.addPerson(t)) {
					 System.out.println("등록이 완료되었습니다.");
				 } else {
					 System.out.println("등록 실패!");
				 }
				 
			 break;
		case 2 : Student s = sm.makeStudent();
				if( sm.addPerson(s)) {
				 System.out.println("등록이 완료되었습니다.");
				} else {
					 System.out.println("등록 실패!");
				}
			break;
		case 3 :
				Employee e = sm.makeEmployee();
				if(sm.addPerson(e)) {
				System.out.println("등록이 완료되었습니다.");
				} else {
					 System.out.println("등록 실패!");
				}
			break;
		case 4 : return;
			//상위 메뉴로 돌아가는 것 
		
		}//switch
	}//printmanagermenu
	
	//관리 인원등록 페이지 화면 만들어
}//class
