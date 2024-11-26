import java.util.*;
import java.math.*;
import java.io.*;
 
public class Main {
    public static boolean[][] arr;
    public static int min = 64;

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new boolean[N][M]; 
        for (int i=0; i<N; i++) {
            String s = br.readLine();
            for (int j=0; j<M; j++) {
                if(s.charAt(j) == 'W') arr[i][j] = true;
                else arr[i][j] = false;
            }
        }

        for (int i=0; i<N-7; i++) {
            for (int j=0; j<M-7; j++) {
                chess(i, j);
            }
        }

        System.out.print(min);
    }

    public static void chess(int x_start, int y_start){
        int x_end = x_start + 8;
        int y_end = y_start + 8;
        int count = 0;
        
        boolean TF = arr[x_start][y_start];
        
        for (int i=x_start; i<x_end; i++) {
            for (int j=y_start; j<y_end; j++) {
                if(TF != arr[i][j]) count++;
                TF = !TF;
            }
            TF = !TF;
        }

        count = Math.min(count, 64-count);

        min = Math.min(min, count);
    }
}