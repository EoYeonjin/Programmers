package Programmers;

public class Vertical_Reading {

	public static void main(String[] args) {
		String my_string = "programmers";
		int m = 1, c = 1;
		String answer = "";
		
		for(int k=c-1; k<my_string.length(); k=k+m) {
			answer += my_string.charAt(k);
			
		};
		
		System.out.println(answer);
	}

}
