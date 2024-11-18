import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int D = Integer.parseInt(br.readLine());

        int result = ten(D, br.readLine());
            
        System.out.print(result);
    }

    public static int ten(int D, String s){
        StringTokenizer st = new StringTokenizer(s);
        int count = 0;
        while (st.hasMoreTokens()) {
            if(Integer.parseInt(st.nextToken()) == D) count++;
        }
        return count;
    }
}