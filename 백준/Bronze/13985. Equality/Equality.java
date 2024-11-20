import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(equality(br.readLine()));
    }

    public static String equality(String equality){
        StringTokenizer st = new StringTokenizer(equality);
        int a = Integer.parseInt(st.nextToken());
        st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        st.nextToken();
        int c = Integer.parseInt(st.nextToken());

        return a+b == c ? "YES" : "NO";
    }
}