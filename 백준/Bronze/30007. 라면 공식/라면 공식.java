import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            sb.append(ramen(br.readLine())).append("\n");
        }

        System.out.print(sb);
	}
    
    public static int ramen(String s){
        StringTokenizer st = new StringTokenizer(s);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        return A*(X-1) + B;
	}
}