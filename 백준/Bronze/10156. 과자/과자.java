import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
            
        int result = snack(K, N, M);
        
        System.out.print(result);
    }

    public static int snack(int K, int N, int M){
        return (K*N) - M >= 0 ? (K*N) - M : 0;
    }
}