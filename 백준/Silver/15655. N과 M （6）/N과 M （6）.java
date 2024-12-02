import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static boolean[] used;
    static int[] numbers;
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        numbers = new int[N];
        for (int i=0; i<N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        arr = new int[M];
        used = new boolean[N];

        backtrack(0, 0);
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

        for (int i=start; i<N; i++) {
            if(used[i]) continue;

            used[i] = true;
            arr[n] = numbers[i];
            
            backtrack(n+1, i);
            used[i] = false;
        }
    }
}