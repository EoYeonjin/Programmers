import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Z = Integer.parseInt(br.readLine());
        
        for (int i=0; i<Z; i++) {
            sb.append(schronisko(br.readLine())).append("\n");
        }

        System.out.print(sb);
    }

    public static int schronisko(String s){
        StringTokenizer st = new StringTokenizer(s);
        int W = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        return (W*K)/2;
    }
}