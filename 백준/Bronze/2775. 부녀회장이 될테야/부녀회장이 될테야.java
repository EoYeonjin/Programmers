import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int num = num(k, n);
            System.out.println(num);
        }
        
	}
	
	static int num(int k, int n){
        int[][] arr = new int[k+1][n+1];
        
        for (int i=0; i<=n; i++) {
		    arr[0][i] = i;
        }

        for (int i=1; i<=k; i++) {
            for (int j=1; j<=n; j++) {
		        arr[i][j] = arr[i-1][j] + arr[i][j-1];
		    }
        }
        return arr[k][n];
	}
}