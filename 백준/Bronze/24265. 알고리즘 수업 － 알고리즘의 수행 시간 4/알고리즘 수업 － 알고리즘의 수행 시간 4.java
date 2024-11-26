import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long n = Long.parseLong(br.readLine());
        long sum = (n*(n-1))/2;
        sb.append(sum).append("\n").append(2);

        System.out.println(sb);
    }
}