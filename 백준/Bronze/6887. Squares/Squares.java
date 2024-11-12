import java.math.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tiles = Integer.parseInt(br.readLine());
        String result = tiles(tiles);

        System.out.print(result);
        
    }

    public static String tiles(int tiles){
        int result = (int)Math.sqrt(tiles);
        return "The largest square has side length "+result+".";
    }
}