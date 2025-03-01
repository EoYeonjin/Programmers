import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line_1 = br.readLine();
        String line_2 = br.readLine();
        String line_3 = br.readLine();
        String line_4 = br.readLine();
        boolean telemarketer = false;
        
        if(line_1.equals("8") || line_1.equals("9")){
          if(line_2.equals(line_3)){
              if(line_4.equals("8") || line_4.equals("9")) telemarketer = true;
          }
        }

        if(telemarketer) System.out.print("ignore");
        else System.out.print("answer");
    }
}