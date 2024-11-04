import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        if(n == 0) sb.append(1);
        else{
            long mul = 1;
            for (int i=1; i<=n; i++) {
                mul *= i;
            }
            sb.append(mul);
        } 
        
        System.out.print(sb);
	}
}