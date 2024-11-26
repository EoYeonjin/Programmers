import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
        System.out.print(distance(br.readLine()));
    }

    public static int distance(String s){
        StringTokenizer st = new StringTokenizer(s);
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int xDistance = x < w-x ? x : w-x;
        int yDistance = y < h-y ? y : h-y;
        
        return xDistance <= yDistance ? xDistance : yDistance;
    }
}