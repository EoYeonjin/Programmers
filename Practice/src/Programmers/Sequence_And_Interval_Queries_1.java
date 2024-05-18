package Programmers;

import java.util.Arrays;

public class Sequence_And_Interval_Queries_1 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4}, answer = {};
		int[][] queries = {{0,1}, {1,2}, {2,3}};
		
		for(int k=0; k<queries.length; k++) {
			for(int j=queries[k][0]; j<=queries[k][1]; j++) {
				arr[j] += 1;
			}
		}
		
		answer = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(answer));
	}

}
