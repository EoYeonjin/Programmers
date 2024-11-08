import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i=1; i<=N; i++) {
            System.out.print(i+" ");
            if(i%6 == 0) System.out.print("Go! ");
            else if(i == N) System.out.print("Go!");
        }
    }
}