import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String S = br.readLine();
        
        
        int sum = hash(L, S);
        System.out.print(sum);
	}
	
	static int hash(int L, String S){
		int sum = 0;
        
        for(int i=0; i<L; i++){
        	char c = S.charAt(i);
        	int m = (int) c - 96;
        	int mul = 1;
        	
        	if(i == 0) sum += m;
        	else{
        		for(int j=0; j<i; j++){
        			mul *= 31;
        		}
        		sum += m*mul;
        	}
        }
        return sum;
	}
}