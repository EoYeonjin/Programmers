import java.io.*;
 
public class Main {
    static long[] sum;
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Divisior();
        
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(sum[N]).append("\n");
        }
        
        System.out.print(sb);
    }

    public static void Divisior(){
        int Max_N = 1000000;

        long[] divisorSum = new long[Max_N + 1];
        
        for (int i=1; i<=Max_N; i++) {
            for (int j=i; j<=Max_N; j+=i) {
                divisorSum[j] += i; 
            }
        }

        sum = new long[Max_N+1];
        for (int i=1; i<=Max_N; i++) {
            sum[i] = sum[i-1] + divisorSum[i];
        }
    }
}