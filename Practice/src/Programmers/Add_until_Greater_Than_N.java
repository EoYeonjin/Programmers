package Programmers;

public class Add_until_Greater_Than_N {

	public static void main(String[] args) {
		int[] numbers = {58, 44, 27, 10, 100};
		int n = 139, answer = 0;
		
		for(int k=0; k<numbers.length; k++) {
			if(answer <= n) answer += numbers[k];
			else break;
		}
		
		System.out.println(answer);
		
	}

}
