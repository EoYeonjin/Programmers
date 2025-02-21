import java.io.*;
import java.util.*;

public class Main {
    static int N, arr[], cal[];
    static int result = 0;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        cal = new int[N];
        visited = new boolean[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        backtrack(0);
        System.out.print(result);
    }

    public static void backtrack(int depth){
        if(depth == N){
            int sum = 0;
            for (int i=0; i<N-1; i++) {
                sum += Math.abs(cal[i] - cal[i+1]);
            }
            result = Math.max(sum, result);
            return;
        }

        for (int i=0; i<N; i++) {
            if(!visited[i]){
                visited[i] = true;
                cal[depth] = arr[i];
                backtrack(depth+1);
                visited[i] = false;
            }
        }
    }
}