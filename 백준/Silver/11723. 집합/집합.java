import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int S = 0;
        StringTokenizer st;

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("all")) S = (1 << 21) - 1;
            else if(command.equals("empty")) S = 0;
            else {
                int x = Integer.parseInt(st.nextToken());
                if(command.equals("add")) S |= (1 << x);
                else if(command.equals("remove")) S &= ~(1 << x);
                else if(command.equals("check")) sb.append((S & (1 << x)) != 0 ? 1 : 0).append("\n");
                else if(command.equals("toggle")) S ^= (1 << x);
            }
        }

        System.out.print(sb);
    }
}