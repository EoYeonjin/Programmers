import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result = patyki(a, b, c);
        System.out.print(result);
    }

    public static int patyki (int a, int b, int c){
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        if(a == b && b == c) return 2;
        else if(arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2]) return 1;
        else return 0;
    }
}