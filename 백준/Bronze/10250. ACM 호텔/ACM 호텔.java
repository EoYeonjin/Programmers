import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int H = 0, W = 0, N = 0;

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            int floor = (N%H) == 0 ? H : (N%H);
            int room = (N%H) == 0 ? (N/H) : (N/H)+1;

            System.out.println(floor*100+room);
        }
    }
}