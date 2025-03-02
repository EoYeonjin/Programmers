import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        double length = Math.sqrt(a);

        double result = 4*length;

        if(result%2 == 0) System.out.print(result);
        else System.out.printf("%.8f", result);
    }
}