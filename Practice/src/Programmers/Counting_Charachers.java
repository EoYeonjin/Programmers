package Programmers;

import java.util.Arrays;

public class Counting_Charachers {

	public static void main(String[] args) {
		String my_string = "Programmers";
		int[] answer = new int[52];
		
		for(int k=0; k<my_string.length(); k++) {
			if(my_string.charAt(k) >= 65 && my_string.charAt(k) <= 90) {
				answer[my_string.charAt(k) - 65]++;
			}else if(my_string.charAt(k) >= 97 && my_string.charAt(k) <= 122){
				answer[my_string.charAt(k) - 71]++;
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
