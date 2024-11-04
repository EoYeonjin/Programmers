import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String s = br.readLine();
            for (int j=0; j<2; j++) {
                sb.append(s).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
	}
}