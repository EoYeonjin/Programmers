import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        System.out.print(word(word));
    }

    public static int word(String word){
        word = word.replace("c=", "1");
        word = word.replace("c-", "1");
        word = word.replace("dz=", "1");
        word = word.replace("d-", "1");
        word = word.replace("lj", "1");
        word = word.replace("nj", "1");
        word = word.replace("s=", "1");
        word = word.replace("z=", "1");

        return word.length();
    }
}