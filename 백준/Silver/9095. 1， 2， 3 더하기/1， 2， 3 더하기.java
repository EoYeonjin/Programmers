import java.io.*;

public class Main {
    private static int[] numbers = {1, 2, 3};
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = count(n);
            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }

    public static int count(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;

        for (int i=1; i<=n; i++) {
            for (int num : numbers) {
                if(i - num >=0) dp[i] += dp[i - num];
            }
        }

        return dp[n];
    }
}