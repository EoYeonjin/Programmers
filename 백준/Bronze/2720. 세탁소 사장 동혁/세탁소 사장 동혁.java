import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            int change = Integer.parseInt(br.readLine());
            sb.append(change(change)).append("\n");
        }

        System.out.print(sb);
        
    }

    public static String change(int change){
        StringBuilder sb = new StringBuilder();
        
        if(change/25 > 0) {
            sb.append(change/25).append(" ");
            change %= 25;
        }else sb.append(0).append(" ");
        
        if(change/10 > 0) {
            sb.append(change/10).append(" ");
            change %= 10;
        }else sb.append(0).append(" ");
        
        if(change/5 > 0) {
            sb.append(change/5).append(" ");
            change %= 5;
        }else sb.append(0).append(" ");
        
        if(change/1 > 0) {
            sb.append(change/1).append(" ");
            change %= 1;
        }else sb.append(0).append(" ");
        
        
        return sb.toString();
    }
}