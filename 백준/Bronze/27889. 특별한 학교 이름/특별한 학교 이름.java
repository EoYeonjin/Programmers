import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        System.out.print(school(name));
	}
    
    public static String school(String name){
        StringBuilder sb = new StringBuilder();
        
        if(name.equals("NLCS")) sb.append("North London Collegiate School");
        else if(name.equals("BHA")) sb.append("Branksome Hall Asia");
        else if(name.equals("KIS")) sb.append("Korea International School");
        else if(name.equals("SJA")) sb.append("St. Johnsbury Academy");
        
        return sb.toString();
	}
}