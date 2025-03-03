import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        if(N.substring(0, 3).equals("555")) System.out.print("YES");
        else System.out.print("NO");
    }
}