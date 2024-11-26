import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String[] arr = str.split("");
        
        int[] newArr = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            newArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(newArr);

        for (int i=arr.length-1; i>=0; i--) {
            sb.append(newArr[i]);
        }
        
        System.out.print(sb);
    }
}