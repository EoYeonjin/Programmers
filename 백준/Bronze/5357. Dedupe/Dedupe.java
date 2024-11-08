import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i=1; i<=N; i++) {
            String dedupe = dedupe(br.readLine());
            System.out.println(dedupe);
        }
    }

    public static String dedupe(String a){
        StringBuilder sb = new StringBuilder();
        char c = a.charAt(0);
        sb.append(c);
        
        for (int i=1; i<a.length(); i++) {
            if(c != a.charAt(i)){
                c = a.charAt(i);
                sb.append(c);
            }
        }
        return sb.toString();
	}
}