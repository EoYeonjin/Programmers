import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = sum(1, N);
        
        System.out.println(sum);
        System.out.println(sum*sum);
        System.out.println(thr(1, N));
	}
    
    public static int sum(int a, int N){
        int num = a;
        if(a < N){
            int mid = (a+N)/2;
            num = sum(a, mid) + sum(mid+1, N);
        }
        return num;
	}
    public static int thr(int a, int N){
        int num = a;
        if(a < N){
            int mid = (a+N)/2;
            num = thr(a, mid) + thr(mid+1, N);
        }else if(a == N) num = a*a*a;
        return num;
	}
}