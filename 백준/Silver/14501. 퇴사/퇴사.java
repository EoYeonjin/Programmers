import java.io.*;
import java.util.*;

public class Main {
    private static int[][] schedule;
    private static int N, max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        
        schedule = new int[N][2];
        
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            schedule[i][0] = Integer.parseInt(st.nextToken());
            schedule[i][1] = Integer.parseInt(st.nextToken());
        }

        retire(0, 0); 

        System.out.print(max);
    }

    public static void retire(int day, int sum){
        if(day >= N){
            max = Math.max(max, sum);
            return;
        }

        if(day + schedule[day][0] <= N) retire(day + schedule[day][0], sum + schedule[day][1]);
        retire(day + 1, sum);
    }
}