import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for (int i=0; i<N; i++) {
            sb.append("Case #"+(i+1)+": ").append(ricesnack(br.readLine())).append("\n");
        }

        System.out.print(sb);
    }

    public static int ricesnack(String s){
        StringTokenizer st = new StringTokenizer(s);
        int max = Integer.parseInt(st.nextToken());
        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            if(max < a) max = a;
        }

        return max;
    }
}