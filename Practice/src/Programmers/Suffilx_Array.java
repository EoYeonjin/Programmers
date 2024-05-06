package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Suffilx_Array {

	public static void main(String[] args) {
		String my_string1 = "banana";
		ArrayList<String> arr1 = new ArrayList<>();
		
		for(int k=0; k<my_string1.length(); k++) {
			String a = my_string1.substring(k, my_string1.length());
			arr1.add(a);
		}
		
		String[] answer1 = new String[arr1.size()];
		
		for(int k=0; k<arr1.size(); k++) {
			answer1[k] = arr1.get(k);
		}
		
		Arrays.sort(answer1);
		
		for(int k=0; k<arr1.size(); k++) {
			System.out.print("["+answer1[k]+"]");
		}
		System.out.println();
		
		String my_string2 = "programmers";
		ArrayList<String> arr2 = new ArrayList<>();
		
		for(int k=0; k<my_string2.length(); k++) {
			String a = my_string2.substring(k, my_string2.length());
			arr2.add(a);
		}
		
		String[] answer2 = new String[arr2.size()];
		
		for(int k=0; k<arr2.size(); k++) {
			answer2[k] = arr2.get(k);
		}
		
		Arrays.sort(answer2);
		
		for(int k=0; k<arr2.size(); k++) {
			System.out.print("["+answer2[k]+"]");
		}
		
		
		
	}

}
