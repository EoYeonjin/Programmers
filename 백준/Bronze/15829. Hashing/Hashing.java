import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String S = br.readLine();
        
        
        long sum = hash(L, S);
        System.out.print(sum);
	}
	
	static long hash(int L, String S){
		long sum = 0;
		long paw = 1;
        
        for(int i=0; i<L; i++){
        	sum += (S.charAt(i) - 96)*paw;
        	paw = (paw*31)%1234567891;
        	
        }
        return sum%1234567891;
	}
}