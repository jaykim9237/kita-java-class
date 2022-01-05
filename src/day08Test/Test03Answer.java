package day08Test;

public class Test03Answer {

	public static void main(String[] args) {
		int data []= {10,50,40,60,70,80,90,51,4,6};
		
		Test03Answer t = new Test03Answer();
		
		System.out.println("합계: "+ t.sum(data));
		System.out.println("평균: "+ t.avarage(data));
		System.out.println("최대값: "+ t.max(data));
		System.out.println("최소값: "+ t.min(data));
	}//main
	
	//sum 함수
	public int sum(int data[]) {
		
		int sum = 0;
		for(int d : data) {
			sum += d;
		}
		return sum
	}//sum
	
	public double average(int data[]) {
		double avg = (double)sum(data) / data.length;
		return avg;
	}//anarage
	
	public int max(int data[]) {
		int max = data[0];
		for (int i = 0; i < data.length; i++) {
			if(max < data[i])
				max = data[i];
		}//for
		return max;
	}//max
		
		public int min(int data[]) {
			int min = data[0];
			for (int i = 0; i < data.length; i++) {
				if(min > data[i])
					min = data[i];
			}//for
			return min;
	}//min

}
