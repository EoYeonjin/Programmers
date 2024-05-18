package Programmers;

import java.util.Arrays;

public class Double_The_Array {

	public static void main(String[] args) {
		int[] numbers = {1,2,100,-99,1,2,3}, answer = {};
		
		for(int k=0; k<numbers.length; k++) {
			numbers[k] *= 2;
		}
		
		answer = Arrays.copyOf(numbers, numbers.length);
		
		System.out.println(Arrays.toString(answer));
	}

}
