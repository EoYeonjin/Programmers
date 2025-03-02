import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        if((S + K + H) >= 100) System.out.print("OK");
        else{
            if(S > K){
                if(K > H) System.out.print("Hanyang");
                else System.out.print("Korea");
            }else if(S > H) {
                if(H > K) System.out.print("Korea");
                else System.out.print("Hanyang");
            }else if(K > H){
                if(H > S) System.out.print("Soongsil");
                else System.out.print("Hanyang");
            }else {
                if(K > S) System.out.print("Soongsil");
                else System.out.print("Korea");
            }
        }
    }
}