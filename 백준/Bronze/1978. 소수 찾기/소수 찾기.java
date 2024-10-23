import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(num == 1) continue;
            int sum = 0;
            for (int i=2; i<num; i++) {
                if(num%i == 0) {
                    sum++;
                    break;
                }
            }
            if(sum == 0) count++;
        }

        System.out.print(count);
    }        
}