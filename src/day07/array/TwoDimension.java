package day07.array;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
	for(int i=0; i<arr.length; i++){	
		for(int j=0; j<arr[i].length; j++)/*여기에 arr다랭스 가운데 아이가 중요한거야 행의 수인거지!!*/ {
			System.out.println(arr[i][j]);
		}
		System.out.println( );
	}
	}

}
