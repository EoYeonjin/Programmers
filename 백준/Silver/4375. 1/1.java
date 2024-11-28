import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;

        while ((s = br.readLine()) != null) {
            sb.append(Number(Integer.parseInt(s))).append("\n");
        }

        System.out.print(sb);
    }

    public static int Number(int num) {
        int remainder = 0;
        
        for (int i=1; ; i++) {
            remainder = (remainder*10 + 1) % num;
            if(remainder == 0) return i;
        }
    }
}