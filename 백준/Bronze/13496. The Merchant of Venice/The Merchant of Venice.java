import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        for (int i=0; i<K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int sum = 0;
            
            for (int j=0; j<n; j++) {
                sum += ship(s, d, br.readLine());
            }
            sb.append("Data Set "+(i+1)+":").append("\n");
            sb.append(sum).append("\n\n");
        }

        System.out.print(sb);
        
    }

    public static int ship(int s, int d, String ship){
        StringTokenizer st = new StringTokenizer(ship);
        int di = Integer.parseInt(st.nextToken());
        int si = Integer.parseInt(st.nextToken());

        if(s*d >= di) return si;
        else return 0;
    }
}