import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int count = 0;
        
        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'e') count++;
        }

        sb.append("h");
        for (int i=0; i<(count*2); i++) {
            sb.append("e");
        }
        sb.append("y");

        System.out.print(sb.toString());
    }
}