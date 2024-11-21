import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int C = Integer.parseInt(br.readLine());
        
        System.out.print(cooking(s, C));
    }

    public static String cooking(String s, int C){
        StringTokenizer st = new StringTokenizer(s);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int min = B + C;
        if(min >= 60){
            A += min/60;
            min %= 60;
        }

        if(A >= 24) A -= 24;

        return A+" "+min;
    }
}