import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A = 0, B = 0;
        
        if(N == 1010) System.out.print(20);
        else if(N % 10 == 0){
            A += N/100;
            System.out.print(A + 10);
        }else {
            B += N%10;
            A += N/10;

            if(A == 10) System.out.print(10+B);
            else System.out.print(A+B);
        }
    }
}