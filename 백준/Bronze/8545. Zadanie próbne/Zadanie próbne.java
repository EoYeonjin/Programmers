import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        for (int i=(s.length()-1); i>=0; i--) {
            sb.append(s.charAt(i));
        }
        
        System.out.print(sb);
	}
}