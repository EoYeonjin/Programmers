import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int X = Integer.parseInt(br.readLine());

        for (int i=0; i<X; i++) {
            sb.append(quadrilateral(br.readLine())).append("\n");
        }
            
        System.out.print(sb);
    }

    public static String quadrilateral(String s){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i=0; i<b; i++) {
            for (int j=0; j<a; j++) {
                sb.append("X");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}