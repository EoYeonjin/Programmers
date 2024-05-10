package Programmers;

public class Flip_String {

	public static void main(String[] args) {
		String my_string = "Progra21Sremm3";
		int s = 6, e = 12;
		String answer = "";
		
		String a = my_string.substring(s, e+1);
		StringBuffer sb = new StringBuffer(a);
		String revA = sb.reverse().toString();
		
		answer = my_string.replaceAll(a, revA);
		
		System.out.println(answer);
	}

}