import java.util.*;
import java.io.*;
import java.text.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            double sum = 1;
            while (st.hasMoreTokens()) {
                sum *= Double.parseDouble(st.nextToken());
            }
            sb.append("$").append(String.format("%.2f",sum)).append("\n");
        }

        System.out.print(sb);
	}
}