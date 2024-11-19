import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        
        int[] arr = {A, B, C, D};
        
        System.out.print(score(arr, E, F));
    }

    public static int score(int[] arr, int E, int F){
        Arrays.sort(arr);
        int sum = arr[1] + arr[2] + arr[3];
        
        return E>=F? sum+E : sum+F;
    }
}