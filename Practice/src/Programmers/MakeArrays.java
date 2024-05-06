package Programmers;

import java.util.ArrayList;

public class MakeArrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int k = 50000, s = 5, l = 5;
		
		for(int a = 0; a<intStrs.length; a++) {
			int b = Integer.parseInt(intStrs[a].substring(s, s+l));
			
			if(k < b) {
				arr.add(b);
			}
		}
		
		int[] answer = new int[arr.size()];
		
		for(int a = 0; a<arr.size(); a++) {
			answer[a] = arr.get(a);
		}
	}

}
