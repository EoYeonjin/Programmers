package Programmers;

import java.util.ArrayList;

public class Make_A_Array3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[][] intervals = {{1,3}, {0,4}};
		
		ArrayList<Integer> dtos = new ArrayList<Integer>();
		
		for(int k=0; k<intervals.length; k++) {
			for(int j=intervals[k][0]; j<=intervals[k][1]; j++) {
				dtos.add(arr[j]);
			}
		}
		
		int[] answer = dtos.stream().mapToInt(x -> x).toArray();
		
		for(int k=0; k<answer.length; k++) {
			System.out.print(answer[k]);
		}
	}

}
