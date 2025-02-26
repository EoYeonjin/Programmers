import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Sab = Integer.parseInt(br.readLine());
        int Fab = Integer.parseInt(br.readLine());

        if(Sab>Fab) System.out.print("flight");
        else System.out.print("high speed rail");
    }
}