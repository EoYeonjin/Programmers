import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A1 = Double.parseDouble(st.nextToken());
        double P1 = Double.parseDouble(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        double R1 = Double.parseDouble(st.nextToken());
        double P2 = Double.parseDouble(st.nextToken());

        double slice = A1 / P1;
        double whole = (Math.PI*R1*R1) / P2;

        if(slice > whole) System.out.print("Slice of pizza");
        else System.out.print("Whole pizza");
    }
}