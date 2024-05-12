package Programmers;

import java.util.Arrays;

public class Make_A_Array {

	public static void main(String[] args) {
		int n = 15, k = 5;
		int[] answer = new int[n/k];
		
		for(int j=0; j<answer.length; j++) {
			answer[j] = k*(j+1);
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
