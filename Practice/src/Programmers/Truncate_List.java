package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Truncate_List {

	public static void main(String[] args) {
		int n = 4;
		int[] slicer = {1,5,2}, num_list = {1,2,3,4,5,6,7,8,9};
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int a = slicer[0], b = slicer[1], c = slicer[2];
		
		if(n == 1) {
			for(int k=0; k<b+1; k++) {
				arr.add(num_list[k]);
			}
			
		}else if(n == 2) {
			for(int k=a; k<num_list.length; k++) {
				arr.add(num_list[k]);
			}
			
		}else if(n == 3) {
			for(int k=a; k<b+1; k++) {
				arr.add(num_list[k]);
			}
			
		}else {
			for(int k=a; k<b+1; k += c) {
				arr.add(num_list[k]);
			}
		}
		
		int[] answer = arr.stream().mapToInt(x -> x).toArray();
		
		System.out.println(Arrays.toString(answer));
		
		
	}

}
