import java.util.*;
import java.math.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        BigInteger C = new BigInteger(st.nextToken());

        sb.append(A.add(B).mod(C)).append("\n");
        sb.append(A.mod(C).add(B.mod(C)).mod(C)).append("\n");
        sb.append(A.multiply(B).mod(C)).append("\n");
        sb.append(A.mod(C).multiply(B.mod(C)).mod(C));

        System.out.print(sb);
	}
}