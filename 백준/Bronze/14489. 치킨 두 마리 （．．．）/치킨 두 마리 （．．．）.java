import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(chicken(br.readLine(), Integer.parseInt(br.readLine())));
    }

    public static int chicken(String s, int C){
        StringTokenizer st = new StringTokenizer(s);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A+B >= 2*C) return (A+B) - (2*C);
        else return A+B;
    }
}