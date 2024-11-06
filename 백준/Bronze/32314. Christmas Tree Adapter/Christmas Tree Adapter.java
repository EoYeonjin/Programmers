import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(adapter(Integer.parseInt(br.readLine()), br.readLine()));
	}

    public static int adapter(int a, String s){
        StringTokenizer st = new StringTokenizer(s);
        int w = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        if(a <= w/v) return 1;
        else return 0;
	}
}