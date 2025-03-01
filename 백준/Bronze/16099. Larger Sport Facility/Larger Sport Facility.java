import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            long lt = Long.parseLong(st.nextToken());
            long wt = Long.parseLong(st.nextToken());
            long le = Long.parseLong(st.nextToken());
            long we = Long.parseLong(st.nextToken());

            if((lt*wt) > (le*we)) sb.append("TelecomParisTech").append("\n");
            else if((lt*wt) < (le*we)) sb.append("Eurecom").append("\n");
            else sb.append("Tie").append("\n");
        }

        System.out.print(sb.toString());
    }
}