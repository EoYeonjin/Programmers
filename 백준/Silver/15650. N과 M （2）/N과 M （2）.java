import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[N+1];

        List<Integer> arr = new ArrayList<>();

        backtrack(N, M, arr, visited, 1);
    }

    public static void backtrack(int N, int M, List<Integer> arr, boolean[] visited, int n){
        if(arr.size() == M){
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i=n; i<=N; i++) {
            if(visited[i]) continue;

            visited[i] = true;
            arr.add(i);

            backtrack(N, M, arr, visited, i + 1);

            arr.remove(arr.size() - 1);
            visited[i] = false;
        }
    }
}