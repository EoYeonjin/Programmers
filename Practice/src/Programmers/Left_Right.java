package Programmers;

import java.util.Arrays;

public class Left_Right {

	public static void main(String[] args) {
		String[] str_list = {"u" ,"u" ,"l", "r"}, answer = {};
		
		for(int k=0; k<str_list.length; k++) {
			if(str_list[k].equals("l")) {
				answer = Arrays.copyOfRange(str_list, 0, k);
				break;
			}else if(str_list[k].equals("r")) {
				answer = Arrays.copyOfRange(str_list, k+1, str_list.length);
				break;
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
