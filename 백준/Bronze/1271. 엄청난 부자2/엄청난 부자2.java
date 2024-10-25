import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if(!B.equals(BigInteger.ZERO)){
            sb.append(A.divide(B)).append("\n");
            sb.append(A.remainder(B));
        }
        
        System.out.print(sb);
	}
}