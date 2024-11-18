import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        String result = special(M, D);
            
        System.out.print(result);
    }

    public static String special(int M, int D){
        if(M == 1) return "Before";
        else if(M > 2) return "After";
        else{
            if(D < 18) return "Before";
            else if(D > 18) return "After";
            else return "Special";
        }
    }
}