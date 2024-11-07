import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if(s.equals("# 0 0")) break;

            sb.append(football(s)).append("\n");
        }
        
        System.out.print(sb);
	}

    public static String football(String s){
        StringTokenizer st = new StringTokenizer(s);
        String name = st.nextToken();
        String age = "Junior";
        if(Integer.parseInt(st.nextToken()) > 17 || Integer.parseInt(st.nextToken()) >= 80) age = "Senior";
        
       return name+" "+age;
	}
}