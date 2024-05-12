package Programmers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;


public class Area_Of_2 {

	public static void main(String[] args) {
		int[] arr = {1,2,1,2,1,10,2,1};
		int fst = 100000, lst = 0;
		
		for(int k=0; k<arr.length; k++) {
			if(arr[k] == 2) {
				fst = Math.min(fst, k);
				lst = Math.max(lst, k);
			}
		}
		
		int[] answer = {};
		
		if(fst <= lst) {
			answer = Arrays.copyOfRange(arr, fst, lst+1);	
		}else {
			answer = new int[] {-1};
		}
		
		System.out.print(Arrays.toString(answer));
	}

}
