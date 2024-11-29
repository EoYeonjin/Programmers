import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main {
    static boolean[] arr = new boolean[10];
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        Arrays.fill(arr, true);
        
        if(M>0){
            StringTokenizer st = new StringTokenizer(br.readLine());
        
            
            for (int i=0; i<M; i++) {
                int button = Integer.parseInt(st.nextToken());
                arr[button] = false;
            } 
        }
        
        if(N == 100) System.out.print(0);
        else{
            int result = Math.min(push(N), Math.abs(N-100));
            System.out.print(result);
        }
    }

    public static int push(int N){
        int min = Integer.MAX_VALUE;

        int length = (int) Math.log10(N) + 1;
        for (int i=0; i < 999999; i++) {
            String channelStr = String.format("%d", i);
            boolean possible = true;

            for (int j=0; j<channelStr.length(); j++) {
                int digit = channelStr.charAt(j) - '0';
                if(!arr[digit]){
                    possible = false;
                    break;
                }
            }

            if(possible) min = Math.min(min, Math.abs(Integer.parseInt(channelStr) - N) + channelStr.length());
        }
        return min;
    }
}