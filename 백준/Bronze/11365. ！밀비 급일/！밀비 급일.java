import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        
        while (!(s = br.readLine()).equals("END")) {
            sb.append(secret(s)).append("\n");
        }
        
        System.out.print(sb);
    }

    public static String secret(String s){
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}