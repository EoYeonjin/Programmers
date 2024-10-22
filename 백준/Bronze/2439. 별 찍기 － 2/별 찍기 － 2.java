import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=1; i<=N; i++) {
            if(i == N){
                for (int j=1; j<=i; j++) {
                    System.out.print("*");
                }
            }else{
                for (int j=N; j>=1; j--) {
                    if(j <= i) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}