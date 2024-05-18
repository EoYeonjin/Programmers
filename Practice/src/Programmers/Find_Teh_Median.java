package Programmers;

import java.util.Arrays;

public class Find_Teh_Median {

	public static void main(String[] args) {
	int[] array = {9,-1,0};
	int answer = 0;
	
	Arrays.sort(array);
	answer = array[array.length / 2];
	
	System.out.println(answer);
	}

}
