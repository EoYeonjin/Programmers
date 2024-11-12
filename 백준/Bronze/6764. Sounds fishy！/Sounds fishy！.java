import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        for (int i=0; i<4; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        String result = depth(arr);

        System.out.print(result);
        
    }

    public static String depth(int[] arr){
        boolean identi = true;
        boolean rising = true;
        boolean diving = true;
        
        for (int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i - 1]) identi = false;
            if(arr[i] <= arr[i-1]) rising = false;
            if(arr[i] >= arr[i-1]) diving = false;
        }
        
        if(identi) return "Fish At Constant Depth";
        if(rising) return "Fish Rising";
        if(diving) return "Fish Diving";

        return "No Fish";
	}
}