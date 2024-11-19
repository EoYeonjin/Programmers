import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(apple(br.readLine(), br.readLine()));
    }

    public static int apple(String people, String apple){
        StringTokenizer st = new StringTokenizer(apple);
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(people);
        int count = 1;
        
        while (st.hasMoreTokens()) {
            int p = Integer.parseInt(st.nextToken());
            if(p == x) return count;
            else count++;
        }

        return 0;
    }
}