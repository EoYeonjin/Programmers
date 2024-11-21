import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i=0; i<N; i++) {
            sum += bill(br.readLine());
        }

        if(X == sum) System.out.print("Yes");
        else System.out.print("No");
    }

    public static int bill(String s){
        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        return a*b;
    }
}