import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main {
    static boolean[] prime;
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        Prime(M, N);
        
        for (int i=0; i<prime.length; i++) {
            if(prime[i]) sb.append(i).append("\n");
        }
        
        System.out.print(sb);
    }

    public static void Prime(int M, int N){
        prime = new boolean[N+1];

        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        
        for (int i=2; i<=(int)Math.sqrt(N); i++) {
            if(prime[i]){
                for (int j=(int)Math.pow(i, 2); j<=N; j+=i) {
                    prime[j] = false;
                }
            }
        }

        for (int i=0; i<M; i++) {
            if(prime[i]) prime[i] = false;
        }
    }
}