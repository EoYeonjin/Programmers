import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for (int i=0; i<T; i++) {
            sb.append("Case "+(i+1)+": ").append(dice(br.readLine())).append("\n");
        }

        System.out.print(sb);
    }

    public static int dice(String s){
        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        return a+b;
    }
}