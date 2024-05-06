package Programmers;

import java.util.ArrayList;

public class Check_If_It_Is_A_Suffix {

	public static void main(String[] args) {
		String my_string = "banana";
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int k=0; k<my_string.length(); k++) {
			String a = my_string.substring(k, my_string.length());
			arr.add(a);
		}
		
		String is_suffix = "a";
		int answer = 0;
		
		for(int k=0; k<arr.size(); k++) {
			
			if(arr.get(k).equals(is_suffix)) {
				answer = 1;
				break;
			}else {
				answer = 0;
			}
		}
		
		System.out.println(answer);
		
	}

}
