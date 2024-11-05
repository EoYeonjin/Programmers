import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        System.out.print(slogan(s));
	}
    
    public static String slogan(String s){
        StringBuilder sb = new StringBuilder();
        
        if(s.equals("SONGDO")) sb.append("HIGHSCHOOL");
        else if(s.equals("CODE")) sb.append("MASTER");
        else if(s.equals("2023")) sb.append("0611");
        else if(s.equals("ALGORITHM")) sb.append("CONTEST");
        
        return sb.toString();
	}
}