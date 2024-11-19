import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            sb.append(gather(br.readLine())).append("\n");
        }
        
        System.out.print(sb);
    }

    public static String gather(String s){
        StringTokenizer st = new StringTokenizer(s);
        String a = st.nextToken();
        String b = st.nextToken();

        if(a.equals(b)) return "OK";
        else return "ERROR";
    }
}