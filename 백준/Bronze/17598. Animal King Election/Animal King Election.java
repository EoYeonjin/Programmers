import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int tiger = 0;
        int lion = 0;
        
        while ((s = br.readLine()) != null) {
            if(s.equals("Lion")) lion++;
            else tiger++;
        }

        if(tiger > lion) System.out.print("Tiger");
        else System.out.print("Lion");
    }
}