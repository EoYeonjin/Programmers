import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(system(br.readLine()));
    }

    public static String system(String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            int num = N%B;
            if(num >= 10 && num <= 35) sb.append((char) (num+55));
            else sb.append(num);

            N /= B;
        }
        
        return sb.reverse().toString();
    }
}