package Programmers;

public class Odd_Vs_Even {

	public static void main(String[] args) {
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int answer = 0, a = 0, b = 0;
		
		for(int k=0; k<num_list.length; k++) {
			if(k%2 == 0) a += num_list[k];
			if(k%2 == 1) b += num_list[k];
		}
		
		answer = Math.max(a, b);
		
		System.out.println(answer);
	}

}
