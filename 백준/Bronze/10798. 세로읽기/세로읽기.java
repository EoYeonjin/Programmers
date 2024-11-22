import java.math.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        String s4 = br.readLine();
        String s5 = br.readLine();
        System.out.print(max(s1, s2, s3, s4, s5));
    }

    public static String max(String s1, String s2, String s3, String s4, String s5){
        StringBuilder sb = new StringBuilder();
        int max = Math.max(s1.length(), Math.max(s2.length(), Math.max(s3.length(), Math.max(s4.length(), s5.length()))));

        for (int i=0; i<max; i++) {
            if (i < s1.length()) sb.append(s1.charAt(i));
            if (i < s2.length()) sb.append(s2.charAt(i));
            if (i < s3.length()) sb.append(s3.charAt(i));
            if (i < s4.length()) sb.append(s4.charAt(i));
            if (i < s5.length()) sb.append(s5.charAt(i));
        }

        return sb.toString();
    }
}