import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        
        for (int i=0; i<N; i++) {
            String line = br.readLine();
            for (int j=0; j<M; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        int max = Integer.MIN_VALUE;
        
        for (int k=0; k<(1 << (N*M)); k++) {
                int sum = 0;

            for (int i=0; i<N; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j=0; j<M; j++) {
                    int num = i*M+j;
                    if((k & (1 << num)) == 0) sb.append(arr[i][j]);
                    else{
                        if(sb.length() > 0){
                            sum += Integer.parseInt(sb.toString());
                            sb.setLength(0);
                        } 
                    }
                }

                if(sb.length() > 0) sum += Integer.parseInt(sb.toString());
            }

            for (int j=0; j<M; j++) {
                StringBuilder sb = new StringBuilder();
                for (int i=0; i<N; i++) {
                    int num = i*M+j;
                    if((k & (1 << num)) != 0) sb.append(arr[i][j]);
                    else{
                        if(sb.length() > 0){
                            sum += Integer.parseInt(sb.toString());
                            sb.setLength(0);
                        } 
                    }
                }

                if(sb.length() > 0) sum += Integer.parseInt(sb.toString());
            }

            max = Math.max(sum, max);
        }

        System.out.print(max);
    }
}