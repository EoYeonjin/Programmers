import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(congurent(br.readLine()));
    }

    public static int congurent(String s){
        StringTokenizer st = new StringTokenizer(s);
        int p1 = Integer.parseInt(st.nextToken());
        int q1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());
        int q2 = Integer.parseInt(st.nextToken());

        long numerator = (long) p1 * p2;
        long denominator = 2L * q1 * q2;

        if(numerator % denominator == 0) return 1;
        else return 0;
    }
}