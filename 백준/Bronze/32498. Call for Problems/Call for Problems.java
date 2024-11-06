import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i=0; i<n; i++) {
            int d = Integer.parseInt(br.readLine());
            if(d%2 != 0) count++;
        }
        
        System.out.print(count);
	}
}