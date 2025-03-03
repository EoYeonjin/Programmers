import java.io.*;
import java.util.*;

public class Main {
    static int n, k, count = 0;
    static int[] arr = {1, 2, 3};
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        add(0);
        if(count < k) System.out.print(-1);
    }

    public static void add(int sum) {
        if (sum == n) {
            count++;
            if(count == k){
                sb.deleteCharAt(sb.length() - 1);  
                System.out.println(sb.toString());
                System.exit(0);
            }
            return;
        }

        if(sum > n) return;
        
        for (int i = 0; i < 3; i++) {
            sb.append(arr[i]).append("+");  
            add(sum + arr[i]);
            if(sb.length() % 2 == 0)sb.delete(sb.length() - 2, sb.length()); 
            else sb.deleteCharAt(sb.length() - 1);  
        }
    }
}