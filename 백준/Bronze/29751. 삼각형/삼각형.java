import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double area = slogan(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        System.out.printf("%.1f", area);
	}
    
    public static double slogan(int W, int H){
        return (W*H)/2.0;
	}
}