package test;

public class StudentAnswer implements Comparable<StudentAnswer>{
	private String name;
	private String stdNo;
	private int ban;
	private int kor, eng, mat;
	
	
	public StudentAnswer(String name, String stdNo, int ban, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.stdNo = stdNo;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	public int getSum() {
		return kor + eng + mat;
	}
	
	public double getAvg() {
		return getSum() / 3.0;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
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
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ban;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((stdNo == null) ? 0 : stdNo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentAnswer other = (StudentAnswer) obj;
		if (ban != other.ban)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stdNo == null) {
			if (other.stdNo != null)
				return false;
		} else if (!stdNo.equals(other.stdNo))
			return false;
		return true;
	}


	@Override
	public int compareTo(StudentAnswer o) {
		return this.stdNo.compareTo(o.stdNo);
	}
	
	@Override
	public String toString() {
		return String.format("이름:%s, 학번:%s, 반:%02d", name, stdNo, ban);
	}
	
}
