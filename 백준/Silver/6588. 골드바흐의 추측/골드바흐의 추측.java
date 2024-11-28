import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main {
    static boolean[] prime = new boolean[1000001];
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n;
        Prime();
        
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            sb.append(Add(n)).append("\n");
        }
        
        System.out.print(sb);
    }

    public static void Prime(){
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        
        for (int i=2; i<(int)Math.sqrt(prime.length); i++) {
            if(prime[i]){
                for (int j=(int)Math.pow(i, 2); j<prime.length; j+=i) {
                    prime[j] = false;
                }
            }
        }      
    }

    public static String Add(int n) {
        for (int i=3; i<=n/2; i+=2) {
            if(prime[n-i] && prime[i]) return n+" = "+i+" + "+(n-i);
        }

        return "Goldbach's conjecture is wrong.";
    }
}