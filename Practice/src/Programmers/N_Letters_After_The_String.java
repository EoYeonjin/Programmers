package Programmers;

public class N_Letters_After_The_String {

	public static void main(String[] args) {
		String my_string1 = "ProgrammerS123";
		int n1 = 11;
		
		String answer1 = "";
		
		answer1 = my_string1.substring
				(my_string1.length() - n1, my_string1.length());
		
		System.out.println(answer1);
		
		String my_string2 = "He110W0r1d";
		int n2 = 5;
		
		String answer2 = "";
		
		answer2 = my_string2.substring
				(my_string2.length() - n2, my_string2.length());
		
		System.out.println(answer2);
		
		
	}

}
