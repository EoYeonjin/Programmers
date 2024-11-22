import java.util.*;
import java.math.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(system(br.readLine()));
    }

    public static int system(String s){
        StringTokenizer st = new StringTokenizer(s);
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;
        int a = 0;

        for (int i=N.length()-1; i>=0; i--) {
            char c = N.charAt(i);
            int num;

            if(c >= 'A' && c <= 'Z') num = N.charAt(i) - 'A' +10;
            else num = N.charAt(i) - '0';
            
            result += num*Math.pow(B, a++);
        }
        
        return result;
        
    }
}