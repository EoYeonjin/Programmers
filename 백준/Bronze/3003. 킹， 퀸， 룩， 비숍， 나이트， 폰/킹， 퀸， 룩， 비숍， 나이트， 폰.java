import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = {1, 1, 2, 2, 2, 8};
        
        for (int i=0; i<6; i++) {
            int N = Integer.parseInt(st.nextToken());
            if(a[i] != N) sb.append(a[i]-N+" ");
            else sb.append(0+" ");
        }
        
        System.out.print(sb);
	}
}