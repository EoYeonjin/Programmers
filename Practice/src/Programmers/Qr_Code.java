package Programmers;

public class Qr_Code {

	public static void main(String[] args) {
		String code = "programmers";
		int q = 1, r = 0;
		
		String answer = "";
		
		for(int k=0; k<code.length(); k++) {
			int a = k % q;
			if(r == a) {
				answer += code.charAt(k);
			}
		}
		
		System.out.println(answer);

	}

}
