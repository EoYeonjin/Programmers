import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i=0; i<5; i++) {
            int N = Integer.parseInt(br.readLine());
            sum += N;
        }

        sb.append(sum+"\n");

        System.out.print(sb);
	}
}