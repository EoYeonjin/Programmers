import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            String brain = zombie(br.readLine());
            sb.append(brain).append("\n");
        }
        
        System.out.print(sb);
    }

    public static String zombie(String s){
        StringTokenizer st = new StringTokenizer(s);
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        if(X >= Y) return "MMM BRAINS";
        else return "NO BRAINS";
	}
}