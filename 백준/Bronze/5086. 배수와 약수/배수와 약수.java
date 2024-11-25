import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        while (!(s = br.readLine()).equals("0 0")) {
            sb.append(middle(s)).append("\n");
        }

        System.out.print(sb);
    }

    public static String middle(String s){
        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(b%a == 0) return "factor";
        else if(a%b == 0) return "multiple";
        else return "neither";
    }
}