package Programmers;

import java.util.Arrays;

public class Elements_In_N_Intervals {

	public static void main(String[] args) {
		int[] num_list = {4, 2, 6, 1, 7, 6}, answer = {};
		int n = 4, i = 0;
		
		if(num_list.length % n == 0) {
			
			answer = new int[num_list.length / n];
			
		}else{
			
			answer = new int[num_list.length / n +1];
			
		}
		
		for(int k=0; k<num_list.length; k+=n) {
			answer[i++] = num_list[k]; 
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
