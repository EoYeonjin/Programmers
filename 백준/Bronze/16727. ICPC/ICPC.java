import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p1 = Integer.parseInt(st.nextToken());
        int s1 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int s2 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        if((p1+p2) > (s1+s2)) System.out.print("Persepolis");
        else if((p1+p2) < (s1+s2)) System.out.print("Esteghlal");
        else{
            if(s1 > p2) System.out.print("Esteghlal");
            else if(s1 < p2) System.out.print("Persepolis");
            else System.out.print("Penalty");
        }
    }
}