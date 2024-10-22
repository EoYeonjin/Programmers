import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            StringBuilder sb = new StringBuilder();

            for (int j=0; j<S.length(); j++) {
                char c = S.charAt(j);
                for (int t=0; t<R; t++) {
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }        
}