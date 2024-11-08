import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (!(s=br.readLine()).equals("0 0")) {
            int friends = sum(s);
            System.out.println(friends);
        }
        
    }

    public static int sum(String f){
        StringTokenizer st = new StringTokenizer(f);
        int M = Integer.parseInt(st.nextToken());
        int F = Integer.parseInt(st.nextToken());
        
        return M+F;
	}
}