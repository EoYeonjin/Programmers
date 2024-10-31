import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int i =1;

        while (!s.equals("0")) {
            sb.append("Case "+(i++)+": Sorting... done!").append("\n");
            s = br.readLine();
        }
        
        System.out.print(sb);
	}
}