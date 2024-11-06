import java.time.*;
import java.time.format.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        System.out.print(tuesday(X));
	}

    public static int tuesday(int X){
        switch ((6+X)%7) {
            case 1:
                return 1;
            default:
                return 0;
        }
	}
}