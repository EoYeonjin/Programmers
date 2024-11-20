import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(fa(br.readLine()));
    }

    public static String fa(String s){
        StringTokenizer st = new StringTokenizer(s);
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        if(l == 0 && r == 0) return "Not a moose";
        else if(l == r) return "Even "+(r+l);
        else return r > l ? "Odd "+(r*2) : "Odd "+(l*2);
    }
}