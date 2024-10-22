import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[10];
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String mul = Integer.toString(A*B*C);

        for (int i=0; i<mul.length(); i++) {
            int c = Character.getNumericValue(mul.charAt(i));
            num[c] += 1;
        }

        for (int i=0; i<10; i++) {
            System.out.println(num[i]);
        }
    }
}