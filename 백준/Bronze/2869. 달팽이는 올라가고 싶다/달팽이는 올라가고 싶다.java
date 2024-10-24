import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        int day = day(A, B, V);
        System.out.println(day);
	}
	
	static int day(int A, int B, int V){
        return (int) Math.ceil((double) (V - B) / (A - B));
	}
}