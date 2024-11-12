import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        String result = election(X, Y);

        System.out.print(result);
        
    }

    public static String election(int X, int Y){
        StringBuilder sb = new StringBuilder();
        int year = X;
        do{
            sb.append("All positions change in year ").append(year).append("\n");
            year += 60;
        }while (year <= Y);
            
        return sb.toString();
    }
}