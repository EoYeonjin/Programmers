import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(cctv(br.readLine()));
    }

    public static long cctv(String camera){
        StringTokenizer st = new StringTokenizer(camera);
        double R = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());
        double N = Double.parseDouble(st.nextToken());

        long w = (long)Math.ceil(R/N);
        long h = (long)Math.ceil(C/N);
        
        return w*h;
    }
}