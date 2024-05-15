package Programmers;

import java.util.Arrays;

public class Change_Order {

	public static void main(String[] args) {
		int[] num_list = {5, 2, 1, 7, 5}, answer = new int[num_list.length];
		int n = 3, i = 0;
		
		
		for(int k=n; k<num_list.length; k++) {
			answer[i++] = num_list[k];
		}

		for(int k=0; k<n; k++) {
			answer[i++] = num_list[k];
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
