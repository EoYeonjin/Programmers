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
        int sum = 0;

        for (int i=0; i<n; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
       
        if(sum > 0) return "Right";
        else if(sum < 0) return "Left";
        else return "Stay";
	}
}