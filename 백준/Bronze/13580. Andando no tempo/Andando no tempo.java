import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
        System.out.print(time(br.readLine()));
    }

    public static String time(String time){
        StringTokenizer st = new StringTokenizer(time);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = {A, B, C};
        Arrays.sort(arr);

        if(arr[0] == arr[1] || arr[1] == arr[2]) return "S";
        else if(arr[0] + arr[1] == arr[2]) return "S";
        else return "N";
    }
}