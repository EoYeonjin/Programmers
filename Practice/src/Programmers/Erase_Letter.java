package Programmers;

import java.util.Arrays;

public class Erase_Letter {

	public static void main(String[] args) {
		String my_string = "apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		String answer = "";
		
		String[] arr = my_string.split("");
		
		for(int k=0; k<indices.length; k++) {
			arr[indices[k]] = "";
		}
		
		for(String x: arr) {
			answer += x;
		}
		
		System.out.println(answer);
	}

}
