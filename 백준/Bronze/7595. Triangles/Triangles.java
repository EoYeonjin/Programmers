import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            String result = triangle(n);
            sb.append(result);
        }
        
        System.out.print(sb);
        
    }

    public static String triangle(int n){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            for (int j=0; j<i+1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
            
        return sb.toString();
    }
}