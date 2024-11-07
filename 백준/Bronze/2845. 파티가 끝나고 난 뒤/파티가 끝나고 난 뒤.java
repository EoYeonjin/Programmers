import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String result = party(br.readLine(), br.readLine());

        System.out.print(result);
    }

    public static String party(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s1);
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int tp = L*P;
        
        st = new StringTokenizer(s2);
        int[] arr = new int[5];
            
        for (int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<5; i++) {
            sb.append(arr[i] - tp).append(" ");
        }
        
       return sb.toString();
	}
}