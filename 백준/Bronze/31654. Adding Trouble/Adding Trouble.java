import java.util.*;
import java.math.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(trouble(br.readLine()));
	}

    public static String trouble(String s){
        StringTokenizer st = new StringTokenizer(s);
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        BigInteger C = new BigInteger(st.nextToken());

        if(A.add(B).equals(C)) return "correct!";
        else return "wrong!";
	}
}