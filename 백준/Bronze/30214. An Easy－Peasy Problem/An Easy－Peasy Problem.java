import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(level(br.readLine()));
	}
    
    public static String level(String s){
        StringTokenizer st = new StringTokenizer(s);
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());

        if(s1 >= (s2/2.0)) return "E";
        else return "H";
	}
}