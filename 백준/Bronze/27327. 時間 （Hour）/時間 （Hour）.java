import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int X = Integer.parseInt(br.readLine());

        sb.append(X*24);
        
        System.out.print(sb);
	}
}