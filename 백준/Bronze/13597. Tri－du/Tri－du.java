import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
        System.out.print(tridu(br.readLine()));
    }

    public static int tridu(String card){
        StringTokenizer st = new StringTokenizer(card);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        return A >=B ? A : B;
    }
}