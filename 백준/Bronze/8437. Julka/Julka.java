import java.util.*;
import java.math.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        sb.append(A.add(B).divide(BigInteger.valueOf(2))).append("\n");
        sb.append(A.subtract(B).divide(BigInteger.valueOf(2))).append("\n");
        
        System.out.print(sb);
	}
}