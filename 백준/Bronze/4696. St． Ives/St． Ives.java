import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            double a = Double.parseDouble(br.readLine());
            if(a == 0) break;

            double result = stlves(a);
            System.out.printf("%.2f\n", result);
        }
    }

    public static double stlves(double a){
        double result = 1 + a + (a*a) + (a*a*a) + (a*a*a*a);

        return result;
	}
}