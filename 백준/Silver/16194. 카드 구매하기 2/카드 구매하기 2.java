import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N+1];

        dp[0] = 0;

        for (int i=1; i<=N; i++) {
            for (int j=1; j<=i; j++) {
                if(dp[i] == 0) dp[i] = dp[i-j] + arr[j-1];
                else dp[i] = Math.min(dp[i], dp[i-j] + arr[j-1]);
            }
        }

        System.out.print(dp[N]);
    }
}