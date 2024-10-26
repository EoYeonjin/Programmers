import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        if(n != 0) sum = (n*(n+1))/2;
        
        sb.append(sum).append("\n");
        
        System.out.print(sb);
	}
}