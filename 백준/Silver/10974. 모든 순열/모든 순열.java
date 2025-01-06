import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];

        findPermutation();
    }

    public static void findPermutation(){
        if((sb.length()/2) == N){
            System.out.println(sb.toString().trim());
            return;
        }
        
        for (int i=1; i<=N; i++) {
            if(visited[i]) continue;

            visited[i] = true;
            sb.append(i).append(" ");

            findPermutation();

            sb.delete(sb.length() - 2, sb.length());
            visited[i] = false;
        }
    }
}