import java.io.*;
import java.util.*;

public class Main {
    private static int[][] soccer;
    private static List<Integer> team1;
    private static boolean[] used;
    private static int N, min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        soccer = new int[N][N];
        team1 = new ArrayList<>();
        used = new boolean[N];
        
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                soccer[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        power(0); 

        System.out.print(min);
    }

    public static void power(int start){
        if(team1.size() == N/2){
            int sum = sum();
            min = Math.min(sum, min);
            return;
        }
        
        for (int i=start; i<N; i++) {
            if(used[i]) continue;
            team1.add(i+1);
            used[i] = true;

            power(i);

            team1.remove(team1.size() - 1);
            used[i] = false;
        }
    }

    public static int sum(){
        int sum1 = 0;
        int sum2 = 0;

        List<Integer> team2 = new ArrayList<>();
        for (int i=0; i<N; i++) {
            if(!used[i]) team2.add(i+1);
            
        }

        for (int i=0; i<N/2; i++) {
            for (int j=i+1; j<N/2; j++) {
                sum1 += soccer[team1.get(i) - 1][team1.get(j) - 1] + soccer[team1.get(j) - 1][team1.get(i) - 1];
            }
        }

        for (int i=0; i<N/2; i++) {
            for (int j=i+1; j<N/2; j++) {
                sum2 += soccer[team2.get(i) - 1][team2.get(j) - 1] + soccer[team2.get(j) - 1][team2.get(i) - 1];
            }
        }

        return Math.abs(sum1 - sum2);
    }
}