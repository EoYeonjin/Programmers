import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] xArr = new int[N];
        int[] yArr = new int[N];

        if(N == 1) System.out.print(0);
        else{
            for (int i=0; i<N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                xArr[i] = Integer.parseInt(st.nextToken());
                yArr[i] = Integer.parseInt(st.nextToken());
            }

            System.out.print(land(xArr, yArr, N));
        }
    }

    public static int land(int[] xArr, int[] yArr, int N){
        Arrays.sort(xArr);
        Arrays.sort(yArr);

        int area = (xArr[N-1] - xArr[0])*(yArr[N-1] - yArr[0]);
        
        return area;
    }
}