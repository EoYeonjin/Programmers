import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());    

        System.out.print(divisor(N, K));
    }

    public static int divisor(int N, int K){
        int count = 0;
        int num = 1;
        while (num <= N) {
            if(N%num == 0){
                count++;
                if(count == K) return num;
                num++;
            }else num++;
        }

        return 0;
    }
}