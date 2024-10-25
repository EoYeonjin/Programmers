import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String pati = br.readLine();
        String doc = br.readLine();
        String result = "no";

        if(pati.length() >= doc.length()) result = "go";
        
        sb.append(result);
        System.out.print(sb);
	}
}