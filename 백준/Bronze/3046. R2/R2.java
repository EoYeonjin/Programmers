import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R2 = r2(br.readLine());

        System.out.print(R2);
    }

    public static int r2(String s){
        StringTokenizer st = new StringTokenizer(s);
        int R1 = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        
       return (2*S) - R1;
	}
}