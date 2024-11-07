import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = 0;
        
        if(a == b && b == c) sum = 10000 + (a*1000);
        else if(a == b || b == c || a == c){
            if(a == b) {
                sum = 1000 + (a * 100);
            } else if(a == c) {
                sum = 1000 + (a * 100);
            } else {
                sum = 1000 + (b * 100);
            }
        }else{
            int max = Math.max(a, Math.max(b, c));
            sum = max*100;
        }

        System.out.print(sum);
	}
}