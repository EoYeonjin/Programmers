import java.io.*;
import java.util.*;

public class Main {
    static int N, arr[][], cal[], start = 0;
    static int result = Integer.MAX_VALUE;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        cal = new int[N+1];
        visited = new boolean[N];
        visited[0] = true;
        
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        backtrack(0, 1);
        System.out.print(result);
    }

    public static void backtrack(int now, int count){
        if(count == N && arr[now][start] > 0){
            int sum = 0;
            cal[N] = arr[now][start];
            for (int i=0; i<=N; i++) {
                sum += cal[i];
            }
            result = Math.min(result, sum);
            return;
        }

        for (int i=0; i<N; i++) {
            if(arr[now][i] > 0 && !visited[i]){
                visited[i] = true;
                cal[count] = arr[now][i];
                backtrack(i, count+1);
                visited[i] = false;
            }
        }
    }
}