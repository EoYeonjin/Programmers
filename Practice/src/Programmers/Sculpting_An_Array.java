package Programmers;

import java.util.Arrays;

public class Sculpting_An_Array {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5}, query = {4,1,2};
		
		int[] answer = {};
		
		for(int k=0; k<query.length; k++) {
			if(k % 2 == 0) {
				arr = Arrays.copyOfRange(arr, 0, query[k]+1);
			}else {
				arr = Arrays.copyOfRange(arr, query[k], arr.length);
			}
		}
		answer = Arrays.copyOfRange(arr, 0, arr.length);
		System.out.println(Arrays.toString(answer));
		
	}

}
