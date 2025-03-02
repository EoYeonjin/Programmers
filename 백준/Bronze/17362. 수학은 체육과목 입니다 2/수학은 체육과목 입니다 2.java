import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        switch (n%8) {
            case 1:
                System.out.print(1);
                break;
            case 2:
                System.out.print(2);
                break;
            case 3:
                System.out.print(3);
                break;
            case 4:
                System.out.print(4);
                break;
            case 5:
                System.out.print(5);
                break;
            case 6:
                System.out.print(4);
                break;
            case 7:
                System.out.print(3);
                break;
            case 0:
                System.out.print(2);
                break;
        }
    }
}