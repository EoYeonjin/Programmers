import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];
        
        
        while (true) {
            String input = br.readLine();
            if(input == null) break;
            int A = Integer.parseInt(input);
            arr[A%42] += 1; 
        }

        int count = 0;

        for (int i=0; i<42; i++) {
            if(arr[i] != 0) count += 1;
        }

        System.out.print(count);
    }        
}