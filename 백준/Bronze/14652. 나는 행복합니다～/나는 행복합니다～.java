import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(baseball(br.readLine()));
    }

    public static String baseball(String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        return K/M +" "+ K%M;
    }
}