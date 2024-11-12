import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = koszykarz(k, w, m);
        System.out.print(result);
    }

    public static int koszykarz (int k, int w, int m){
        if(k>=w) return 0;
        return (w-k)%m == 0 ? (w-k)/m : (w-k)/m + 1;
    }
}