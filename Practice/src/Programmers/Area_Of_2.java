package Programmers;

import java.util.ArrayList;

public class Area_Of_2 {

	public static void main(String[] args) {
		int[] arr = {1,2,1,4,5,2,9};
		
		ArrayList<Integer> dtos = new ArrayList<Integer>();
		
		for(int k=0; k<arr.length; k++) {
			if(arr[k] == 2) {
				dtos.add(k);
			}else {
				dtos.add(-1); 
			}
		}
		
		
		if(dtos.get(0) != -1) {
			for(int k=dtos.get(0); k<=dtos.get(dtos.size()); k++) {
				
			}
		}
	}

}
