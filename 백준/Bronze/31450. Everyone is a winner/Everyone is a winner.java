import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        System.out.print(winner(M, K));
	}
    
    public static String winner(int M, int K){
        switch (M%K) {
            case 0:
                return "Yes";
            default:
                return "No";
        }
	}
}