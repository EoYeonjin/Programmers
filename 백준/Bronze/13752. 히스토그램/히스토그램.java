import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            sb.append(histogram(br.readLine())).append("\n");
        }
        
        System.out.print(sb);
    }

    public static String histogram(String num){
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(num);

        for (int i=0; i<k; i++) {
            sb.append("=");
        }

        return sb.toString();
    }
}