import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(hiarc(br.readLine()));
	}
    
    public static int hiarc(String s){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        int H = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        return (H*I) - (A*R*C);
	}
}