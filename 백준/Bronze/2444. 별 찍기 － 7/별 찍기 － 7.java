import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print(star(N));
    }

    public static String star(int N){
        StringBuilder sb = new StringBuilder();
        String[][] arr = new String[2*N-1][2*N-1];

        for (int i=0; i<2*N-1; i++) {
            Arrays.fill(arr[i], " ");
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<=i; j++) {
                arr[i][N-j-1] = "*";
            }
            for (int j=N; j<=i+N; j++) {
                if(j == 2*N-1) continue;
                else if(j == i+N){
                    arr[i][j] = null;
                    continue;
                } 
                arr[i][j] = "*";
            }
        }

        int a = N-2;
        int b = N;
        while (a>0 || b<2*N-1) {
            for (int k=0; k<2*N-1; k++) {
                arr[b][k] = arr[a][k];
            }
            a--;
            b++;
        }

        for (int i=0; i<2*N-1; i++) {
            for (int j=0; j<2*N-1; j++) {
                if(arr[i][j] == null) break;
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}