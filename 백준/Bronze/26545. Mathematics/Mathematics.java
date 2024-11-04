import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i=0; i<n; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        sb.append(sum);

        System.out.print(sb);
	}
}