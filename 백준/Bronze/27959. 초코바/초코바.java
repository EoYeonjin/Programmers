import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        System.out.print(chocolate(N, M));
	}
    
    public static String chocolate(int N, int M){
        StringBuilder sb = new StringBuilder();
        
        if((N*100) >= M) sb.append("Yes");
        else sb.append("No");
        
        return sb.toString();
	}
}