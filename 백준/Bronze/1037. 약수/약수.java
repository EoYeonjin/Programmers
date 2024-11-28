import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
            
        System.out.print(Divisior(arr, N));
    }

    public static int Divisior(int[] arr, int N) {
        if(N == 1) return (int)Math.pow(arr[0], 2);
        else{
            Arrays.sort(arr);
            return arr[0]*arr[N-1];
        }
    }
}