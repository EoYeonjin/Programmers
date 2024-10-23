import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st1.nextToken());
        int P = Integer.parseInt(st1.nextToken());
        int sum = 0, tshirts = 0;
        
        while (st.hasMoreTokens()) {
            int S = Integer.parseInt(st.nextToken());
            sum += S;
            tshirts += (S%T) == 0 ? (S/T) : (S/T) + 1;
        }

        System.out.println(tshirts);
        System.out.println((sum/P)+" "+(sum%P));
    }        
}