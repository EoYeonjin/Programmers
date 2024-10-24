import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int num = num(N, K);
        
        System.out.print(num);
	}
	
	static int num(int N, int K){
        if(K == 0 || N == K) return 1;
        return num(N-1, K) + num(N-1, K-1);
	}
}