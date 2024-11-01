import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = {6, 3, 2, 1, 2};

        StringTokenizer st;
        for (int i=0; i<2; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j=0; j<5; j++) {
                int a = Integer.parseInt(st.nextToken());
                sum += (a*arr[j]);
            }
            sb.append(sum).append(" ");
        }

        System.out.print(sb);
	}
}