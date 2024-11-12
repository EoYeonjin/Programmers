import java.util.*;
import java.math.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        if(a.mod(BigInteger.TWO).equals(BigInteger.ZERO) || b.mod(BigInteger.TWO).equals(BigInteger.ZERO)) System.out.print(0);
        else System.out.print(a.min(b));
    }
}