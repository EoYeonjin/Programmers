import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        System.out.print(getYear(E, S, M));
    }

    public static int getYear(int E, int S, int M){
        int a = 1, b = 1, c = 1;
        int year = 1;
        while (E != a || S != b || M != c) {
            if(++a > 15) a = 1;
            if(++b > 28) b = 1;
            if(++c > 19) c = 1;
            year++;
        }
        
        return year;
    }
}