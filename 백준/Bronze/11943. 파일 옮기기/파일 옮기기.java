import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(basket(br.readLine(), br.readLine()));
    }

    public static int basket(String first, String second){
        StringTokenizer st = new StringTokenizer(first);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(second);
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        
        return A+D >= B+C ? B+C : A+D;
    }
}