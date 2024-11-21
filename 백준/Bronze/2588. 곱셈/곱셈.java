import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        
        System.out.print(multiply(A, B));
    }

    public static String multiply(int A, int B){
        StringBuilder sb = new StringBuilder();
        sb.append(A*(B%10)).append("\n");
        sb.append(A*((B%100)/10)).append("\n");
        sb.append(A*(B/100)).append("\n");
        sb.append(A*B).append("\n");

        return sb.toString();
    }
}