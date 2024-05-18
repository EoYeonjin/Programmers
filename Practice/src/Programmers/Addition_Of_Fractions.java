package Programmers;

import java.util.Arrays;

public class Addition_Of_Fractions {

	public static void main(String[] args) {
		int numer1 = 9, denom1 = 2, numer2 = 1, denom2 = 3;
		int[] answer = new int[2];
		
		int a = (numer1*denom2) + (numer2*denom1), b = denom1*denom2; 
		int c = 0;
		
		for(int k=1; k<=a && k<=b; k++) {
			if(a%k == 0 && b%k == 0) {
				c = k;
			}
		}
		
		answer[0] = a/c;
		answer[1] = b/c;
		
		System.out.println(Arrays.toString(answer));
		
	}

}
