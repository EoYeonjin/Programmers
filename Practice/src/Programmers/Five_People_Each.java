package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Five_People_Each {

	public static void main(String[] args) {
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int k=0; k<names.length; k++) {
			if(k % 5 == 0) arr.add(names[k]);
		}
		
		String[] answer = arr.toArray(new String[arr.size()]);
		
		System.out.println(Arrays.toString(answer));
	}

}
