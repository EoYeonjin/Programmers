import java.io.*;
import java.util.*;

public class Main {
    private static int[] arr;
    private static int[][] numbers;
    private static int[][] used;
    private static int N, M, K, max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        numbers = new int[N][M];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        used = new int[N][M];
        arr = new int[K];

        backtrack(0);
        System.out.print(max);
    }

    public static void backtrack(int count){
        if(count == K){
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            max = Math.max(sum, max);
            return;
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if(used[i][j] > 0) continue;
                
                go(i, j);
                arr[count] = numbers[i][j];
                
                backtrack(count+1);
                back(i, j);
            }              
        }
    }

    public static void go(int x, int y){
        used[x][y]++;
        if (y - 1 >= 0) used[x][y - 1]++;
        if (x - 1 >= 0) used[x - 1][y]++;
        if (y + 1 < M) used[x][y + 1]++;
        if (x + 1 < N) used[x + 1][y]++;
    }

    public static void back(int x, int y){
        used[x][y]--;
        if (y - 1 >= 0) used[x][y - 1]--;
        if (x - 1 >= 0) used[x - 1][y]--;
        if (y + 1 < M) used[x][y + 1]--;
        if (x + 1 < N) used[x + 1][y]--;
    }
}