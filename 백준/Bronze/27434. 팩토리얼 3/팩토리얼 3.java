import java.math.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(factorial(1, n));
	}
    
    public static BigInteger factorial(int a, int n){
        StringBuilder sb = new StringBuilder();
        BigInteger result = BigInteger.valueOf(a);
        
        if(a < n){
            int mid = (a+n)/2;
            result = factorial(a, mid).multiply(factorial(mid+1, n));
        }
        
        return result;
	}
}