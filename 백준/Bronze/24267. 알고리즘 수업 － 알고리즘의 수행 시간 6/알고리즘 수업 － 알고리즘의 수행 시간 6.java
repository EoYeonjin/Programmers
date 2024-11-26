import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long n = Long.parseLong(br.readLine());
        long count = 0;

        for (long i=1; i<=n-2; i++) {
            count += (i*(i+1))/2;
        }
                
        sb.append(count).append("\n").append(3);

        System.out.println(sb);
    }
}