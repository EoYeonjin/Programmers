import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main {
    static char[][] candy;
    static int maxCandies = 0;
    static int N;
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        candy = new char[N][N];
        
        for (int i=0; i<N; i++) {
            candy[i] = br.readLine().toCharArray();
        }

        

        for (int i=0; i<N; i++) {
            for (int j=0; j<N - 1; j++) {
                if(i+1 < N) swap(i, j, i+1, j);
                swap(i, j, i, j+1);
                if(maxCandies == N) break;
            }
            if(maxCandies == N) break;
        }

        System.out.print(maxCandies);
    }
    
    public static void swap(int x1, int y1, int x2, int y2){
        if(candy[x1][y1] != candy[x2][y2]){
            char temp = candy[x1][y1];
            candy[x1][y1] = candy[x2][y2];
            candy[x2][y2] = temp;

            maxCandies = Math.max(maxCandies, getCandies());
            
            candy[x2][y2] = candy[x1][y1];
            candy[x1][y1] = temp;
        }
    }

    public static int getCandies(){
        int max = 0;

        for (int i=0; i<N; i++) {
            int count = 1;
            for (int j=0; j<N-1; j++) {
                if(candy[i][j] == candy[i][j+1]) count++;
                else{
                    max = Math.max(max, count);
                    if(max == N) break;
                    count = 1;
                }
            }
            max = Math.max(max, count);
            if(max == N) break;
        }

        for (int j=0; j<N; j++) {
            int count = 1;
            for (int i=0; i<N-1; i++) {
                if(candy[i][j] == candy[i+1][j]) count++;
                else{
                    max = Math.max(count, max);
                    if(max == N) break;
                    count = 1;
                }
            }
            max = Math.max(count, max);
            if(max == N) break;
        }
        return max;
    }
}