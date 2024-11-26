import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (!(s = br.readLine()).equals("0 0 0")) {
            System.out.println(land(s));
        }
    }

    public static String land(String s){
        StringTokenizer st = new StringTokenizer(s);
        int[] arr = new int[3];

        for (int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        if(arr[2] >= arr[0] + arr[1]) return "Invalid";
        
        if(arr[0] == arr[1] && arr[1] == arr[2]) return "Equilateral";
        else if(arr[0] == arr[1] || arr[1] == arr[2]) return "Isosceles";
        else return "Scalene";
    }
}