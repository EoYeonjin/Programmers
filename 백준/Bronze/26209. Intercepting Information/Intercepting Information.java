import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = "S";

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if(n == 9){
                s = "F";
                break;
            }
        }

        sb.append(s);

        System.out.print(sb);
	}
}