import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        long N;
        
        for (int i=0; i<T; i++) {
            N = Integer.parseInt(br.readLine());
            sb.append(N*N).append("\n");
        }

        System.out.print(sb.toString());
    }
}