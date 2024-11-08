import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while ((s = br.readLine()) != null) {
            String team = football(s);
            System.out.println(team);
        }
    }

    public static String football(String a){
        StringBuilder sb = new StringBuilder(a);
        for (int i=0; i<sb.length(); i++) {
            if(sb.charAt(i) == 'i') sb.setCharAt(i, 'e');
            else if(sb.charAt(i) == 'e') sb.setCharAt(i, 'i');
            else if(sb.charAt(i) == 'I') sb.setCharAt(i, 'E'); 
            else if(sb.charAt(i) == 'E') sb.setCharAt(i, 'I');
        }
        return sb.toString();
	}
}