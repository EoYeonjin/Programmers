import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        System.out.print(traffic(N, A, B));
	}
    
    public static String traffic(int N, int A, int B){
        StringBuilder sb = new StringBuilder();
        
        if(B-N == 0){
            if(A > B) sb.append("Subway");
            else if(A < B) sb.append("Bus");
            else sb.append("Anything");
        }else if(B > N){
            if(A > B) sb.append("Subway");
            else if(A < B) sb.append("Bus");
            else sb.append("Anything");
        }else sb.append("Bus");
        
        
        return sb.toString();
	}
}