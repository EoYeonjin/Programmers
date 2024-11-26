import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(land(s));
    }

    public static int land(String s){
        StringTokenizer st = new StringTokenizer(s);
        int[] arr = new int[3];

        for (int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        if(arr[2] < arr[0] + arr[1]) return arr[0] + arr[1] + arr[2];
        else return 2*(arr[0] + arr[1]) - 1;
    }
}