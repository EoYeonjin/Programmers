import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;

        for (int i=0; i<4; i++) {
            int volume = 0;
            
            if(i == 0) volume = h*v*4;
            if(i == 1) volume = (n-h)*v*4;
            if(i == 2) volume = h*(n-v)*4;
            if(i == 3) volume = (n-h)*(n-v)*4;
            
            max = Math.max(volume, max);
        }

        System.out.print(max);
    }
}