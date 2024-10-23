import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int max = Math.max(A, Math.max(B,C));
            int sumOfSquares = (A*A) + (B*B) + (C*C) - (max*max);
            
            if(A == 0 && B == 0 && C == 0) break;
            else if((max*max) == sumOfSquares) System.out.println("right");
            else System.out.println("wrong");
        }
    }        
}