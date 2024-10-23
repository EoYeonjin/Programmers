import java.util.*;
import java.time.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int range = 2, count = 1;
        
        if(N == 1) System.out.print("1");
        else{
        	while(range <= N){
        		range += 6*count;
        		count++;
        	}
        	System.out.print(count);
        }
    }        
}