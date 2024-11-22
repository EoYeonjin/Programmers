import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[100][100];

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j=a; j<a+10; j++) {
                for (int k=b; k<b+10; k++) {
                    arr[j][k] = true;
                }
            }
        }

        int area = 0;

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == true) area += 1;
            }
        }
        
        System.out.print(area);
    }
}