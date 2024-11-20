import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
        System.out.print(zeroOne(br.readLine()));
    }

    public static String zeroOne(String num){
        StringTokenizer st = new StringTokenizer(num);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A == B && B == C) return "*";
        else if(A == B && B != C) return "C";
        else if(A == C && C != B) return "B";
        else if(B == C && A != B) return "A";
        else return "*";
    }
}