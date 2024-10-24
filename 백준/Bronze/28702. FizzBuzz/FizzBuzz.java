import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];
        String s = "";

        for (int i=0; i<3; i++) {
            arr[i] = br.readLine();
        }
        
        String result = fizzBuzz(arr);
        
        System.out.print(result);
	}
	
	static String fizzBuzz(String[] arr){
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<3; i++) {
            if(arr[i].matches("^[0-9]*$")){
                int n = Integer.parseInt(arr[i]) + (3-i);
                
                if(n%3 == 0 && n%5 == 0) sb.append("FizzBuzz");
                else if(n%3 == 0 && n%5 != 0) sb.append("Fizz");
                else if(n%3 != 0 && n%5 == 0) sb.append("Buzz");
                else sb.append(n);

                break;
            }
        }

        return sb.toString();
	}
}