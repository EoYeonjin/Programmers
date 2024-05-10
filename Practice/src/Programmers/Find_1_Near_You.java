package Programmers;

public class Find_1_Near_You {

	public static void main(String[] args) {
		int[] arr = {1,1,1,1,0};
		int idx = 3, answer = 0;
		
		
		for(int k=idx; k<arr.length; k++) {
			if(arr[k] == 1) {
				answer = k;
				break;
			}else {
				answer = -1;
			}
		}
		
		System.out.println(answer);
	}

}
