import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char result = index(Integer.parseInt(br.readLine()));
        
        System.out.println(result);
	}
    
    public static char index(int N){
        String s = "WelcomeToSMUPC";
        if(N%s.length() == 0) return s.charAt(s.length() - 1);
        else return s.charAt((N%s.length()) - 1);
	}
}