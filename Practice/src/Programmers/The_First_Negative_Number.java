package Programmers;

public class The_First_Negative_Number {

	public static void main(String[] args) {
		int[] num_list = {13, 12, 53, 24, 15, 6};
		int answer = 0;
		
		for(int k=0; k<num_list.length; k++) {
			if(num_list[k] < 0) {
				answer = k;
				break;
			}else {
				answer = -1;
			}
		}
		
		System.out.println(answer);

	}

}
