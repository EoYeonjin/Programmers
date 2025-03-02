import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<L; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            String line = st.nextToken();

            for (int j=0; j<N; j++) {
                sb.append(line);
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}