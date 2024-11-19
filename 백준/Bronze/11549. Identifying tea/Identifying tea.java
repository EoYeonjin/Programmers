import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tea = br.readLine();    
        String sample = br.readLine();
        
        System.out.print(tea(tea, sample));
    }

    public static int tea(String tea, String sample){
        StringTokenizer st = new StringTokenizer(sample);
        int count = 0;
        
        while (st.hasMoreTokens()) {
            if(st.nextToken().equals(tea)) count++;
        }
        
        return count;
    }
}