import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String D = br.readLine();
        int[] arr = new int[26];

        for (int i=0; i<D.length(); i++) {
            arr[D.charAt(i)-97]++;
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}