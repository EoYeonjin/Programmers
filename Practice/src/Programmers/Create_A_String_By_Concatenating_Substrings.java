package Programmers;

public class Create_A_String_By_Concatenating_Substrings {

	public static void main(String[] args) {
		String[] my_strings = 
			{"progressive", "hamburger", "hammer", "ahocorasick"};
		
		int[][] parts = {{0,4}, {1,2}, {3,5}, {7,7}};
		
		String answer = "";
		
		for(int k=0; k<my_strings.length; k++) {
			answer += my_strings[k].substring(parts[k][0], parts[k][1]+1);
				
			}
			
		System.out.println(answer);
		
	}

}
