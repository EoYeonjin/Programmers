import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a_x = Integer.parseInt(st.nextToken());
        int a_y = Integer.parseInt(st.nextToken());
        int a_z = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int c_x = Integer.parseInt(st.nextToken());
        int c_y = Integer.parseInt(st.nextToken());
        int c_z = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append(c_x-a_z).append(" ");
        sb.append(c_y/a_y).append(" ");
        sb.append(c_z-a_x).append(" ");

        System.out.print(sb.toString().trim());
    }
}