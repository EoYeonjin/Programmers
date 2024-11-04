import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        String S = st.nextToken();
        
        if(T >= 12 && T <= 16){
            if(S.equals("0")) sb.append(320);
            else sb.append(280);
        }else sb.append(280);

        System.out.print(sb);
	}
}