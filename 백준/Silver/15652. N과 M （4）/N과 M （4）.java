import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        backtrack(0, 1);
        System.out.print(sb);
    }

    public static void backtrack(int n, int start){
        if(n == M){
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=start; i<=N; i++) {
            arr[n] = i;
            backtrack(n+1, i);
        }
    }
}