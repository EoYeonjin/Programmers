import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String s = br.readLine();
        
        Arrays.fill(arr, -1);
        
        for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if(arr[(int)c - 97] == -1) arr[(int)c - 97] = i;
            }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }        
}