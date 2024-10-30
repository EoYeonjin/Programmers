import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int L = Integer.parseInt(br.readLine());

        if (L % 5 == 0) sb.append(L/5); 
        else sb.append((L/5)+1);
            
        System.out.print(sb);
	}
}