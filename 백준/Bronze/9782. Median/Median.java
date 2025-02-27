import java.io.*;
import java.util.*;

public class Main {
    static int count = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!(line=br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            median(n, arr);
        }
    }

    public static void median(int n, int[] arr){
        double median;
        
        if(n%2 == 0) median = (arr[n/2] + arr[(n/2)-1])/2.0;
        else median = arr[n/2];
        
        System.out.println("Case "+(count++)+": "+median);
    }
}