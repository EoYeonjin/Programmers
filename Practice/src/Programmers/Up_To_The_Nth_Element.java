package Programmers;

import java.util.Arrays;

public class Up_To_The_Nth_Element {

	public static void main(String[] args) {
		int[] num_list = {5, 2, 1, 7, 5}, answer = {};
		int n = 3;
		
		for(int k=0; k<=n; k++) {
			answer = Arrays.copyOfRange(num_list, 0, n);
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
