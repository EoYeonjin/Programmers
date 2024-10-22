import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M >= 45) M = M-45;
        else{
            M = (M + 15) % 60;
            H = (H == 0) ? 23 : (H-1);
        }

        System.out.print(H+" "+M);
    }
}