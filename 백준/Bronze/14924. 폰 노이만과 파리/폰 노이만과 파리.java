import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(baseball(br.readLine()));
    }

    public static int baseball(String s){
        StringTokenizer st = new StringTokenizer(s);
        int S = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        return (D/(2*S))*T;
    }
}