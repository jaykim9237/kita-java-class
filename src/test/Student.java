package test;

import java.util.HashSet;

public class Student implements Comparable<Student>{
	
	private String name;
	private int stdNo;
	private int ban;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double avg;
	
	public Student(String name, int stdNo, int ban, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.stdNo = stdNo;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	/*public Student(int kor, int eng, int mat) {
		super();
		Student s = new Student(kor, eng, mat);
		s.getSum(kor, eng, mat);
		s.getAvg(kor, eng, mat);
	}*/
	
	//은닉을 적용하여 게터세터 작성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return mat;
	}
	public void setMath(int mat) {
		this.mat = mat;
	}
	
	//총점 메서드
	public int getSum(int kor, int eng, int mat) {
		int sum = kor + eng + mat;
		return sum;
	}
	//평균메서드
	
	public double getAvg(int kor, int eng, int mat) {
		double avg = (kor + eng + mat)/3;
		return avg;
	}
	
	@Override
	public String toString() {
		return "이름 :" + name + "  학번 :" + stdNo + "  반 : " + ban;
	}


	//private static HashSet<Student> studnetlist = new HashSet<Student>();

	@Override
	public int compareTo(Student o) {
		
		return o.stdNo - o.stdNo;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		String namee = ((Student)obj).name;
		int stdNoo = ((Student)obj).stdNo;
		int bann = ((Student)obj).ban;
		
		if(name.equals(namee) && stdNo==stdNoo && ban ==bann)
			return false;
		else return true;
	}
	

	
}
