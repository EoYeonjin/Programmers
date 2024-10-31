import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        int m = (int)((N*0.8)+ (N*0.2*0.78));
        
        sb.append((int)(N*0.78)).append(" ").append(m);
            
        System.out.print(sb);
	}
}