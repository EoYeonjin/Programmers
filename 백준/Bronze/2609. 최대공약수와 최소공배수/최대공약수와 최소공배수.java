import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int gcd = GCD(A, B);
        int lcm = LCM(A, B, gcd);
        
    	System.out.print(gcd+"\n"+lcm);
	}
	
	static int LCM(int A, int B, int gcd){
		return Math.abs(A*B)/gcd;
	}
	
	static int GCD(int A, int B){
		while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
	}
}