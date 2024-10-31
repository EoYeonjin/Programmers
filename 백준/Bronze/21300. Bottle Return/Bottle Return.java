import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int beer = Integer.parseInt(st.nextToken());
        int malt = Integer.parseInt(st.nextToken());
        int wine = Integer.parseInt(st.nextToken());
        int soft = Integer.parseInt(st.nextToken());
        int seltzer = Integer.parseInt(st.nextToken());
        int water = Integer.parseInt(st.nextToken());
        
        int result = (beer*5) + (malt*5) + (wine*5) + (soft*5) + (seltzer*5) + (water*5);
        
        sb.append(result);
            
        System.out.print(sb);
	}
}