import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int sum = 0;
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;

            for (int i=N; i>0; i--) {
            sum += i;
            }
            sb.append(sum+"\n");
        }
        System.out.print(sb);
	}
}