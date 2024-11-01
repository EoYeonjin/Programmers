import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());

        int left = (R*8) + (S*3) - 28;

        sb.append(left);
        
        System.out.print(sb);
	}
}