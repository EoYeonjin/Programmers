import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = conveyor(Integer.parseInt(br.readLine()), br.readLine());
        
        System.out.println(result);
	}
    
    public static String conveyor(int n, String s){
        StringTokenizer st = new StringTokenizer(s);
        int even = 0, odd = 0;

        for (int i=0; i<n; i++) {
            if(Integer.parseInt(st.nextToken())%2 == 0) even++;
            else odd++;
        }
       
        if(even > odd) return "Happy";
        else return "Sad";
	}
}