import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int result = time(D, H, M);
        System.out.print(result);
        
    }

    public static int time(int D, int H, int M){
        int start = (11*60) + 11;
        int finish = (D - 11)*24*60 + (H*60) + M;

        if(finish < start) return -1;

        return finish - start;
	}
}