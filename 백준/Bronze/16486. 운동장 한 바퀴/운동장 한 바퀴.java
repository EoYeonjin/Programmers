import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        double pi = 3.141592;

        double result = (2*pi*d2) + (2*d1);

        System.out.printf("%.6f", result);
    }
}