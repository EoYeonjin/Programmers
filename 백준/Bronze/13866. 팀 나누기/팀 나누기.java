import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(team(br.readLine()));
    }

    public static int team(String team){
        StringTokenizer st = new StringTokenizer(team);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] arr = {A, B, C, D};
        Arrays.sort(arr);
        
        int result = arr[0]+arr[3] >= arr[1]+arr[2] ? (arr[0]+arr[3])-(arr[1]+arr[2]) : (arr[1]+arr[2])-(arr[0]+arr[3]);

        return result;
    }
}