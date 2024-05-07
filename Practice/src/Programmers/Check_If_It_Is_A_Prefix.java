package Programmers;

import java.util.ArrayList;

public class Check_If_It_Is_A_Prefix {

	public static void main(String[] args) {
		String my_string = "banana";
		String[] arr = new String[my_string.length()];
		String is_prefix = "nan";
		int answer = 0;
		
		for(int k=0; k<my_string.length(); k++) {
			arr[k] = my_string.substring(0, k);
		}
		
		for(int k=0; k<arr.length; k++) {
			if(arr[k].equals(is_prefix)) {
				answer = 1;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
