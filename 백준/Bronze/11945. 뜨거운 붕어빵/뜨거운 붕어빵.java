import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i=0; i<N; i++) {
            sb.append(taiyaki(M, br.readLine())).append("\n");
        }
        
        System.out.print(sb);
    }

    public static String taiyaki(int M, String s){
        StringBuilder sb = new StringBuilder();
        for (int i=M-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}