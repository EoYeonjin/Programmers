package Programmers;

import java.util.Arrays;

public class From_The_Nth_Element {

	public static void main(String[] args) {
		int[] num_list = {5, 2, 1, 7, 5}, answer = {};
		int n = 2;
		
		answer = Arrays.copyOfRange(num_list, n-1, num_list.length);
		
		System.out.println(Arrays.toString(answer));
		
	}

}
