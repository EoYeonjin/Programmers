package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class To_Do_List {

	public static void main(String[] args) {
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"}, answer = {};
		boolean[] finished = {true, false, true, false};
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int k=0; k<todo_list.length; k++) {
			if(finished[k] == false) {
				arr.add(todo_list[k]);
			}
		}
		
		answer = arr.toArray(new String[arr.size()]);
		
		System.out.println(Arrays.toString(answer));
	}

}
