import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            String s = br.readLine();

            if(s.equals("0 0")) break;
            st = new StringTokenizer(s);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            String result = A > B ? "Yes" : "No";
            sb.append(result+"\n");
        }
        
        System.out.print(sb);
	}
}