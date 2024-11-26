import java.math.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        System.out.print(sugar(N));
    }
    
    public static int sugar(int N){
        int count = 0;
        
        while (N >= 0) {
            if(N%5 == 0) return count + N/5;

            N -= 3;
            count++;
        }
        
        return -1;
    }
}