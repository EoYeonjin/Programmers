import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String result = "";

        for (int i=0; i<N; i++) {
            result = slogan(br.readLine());
            if(result.equals("Yes")) break;
        }
        
        System.out.println(result);
	}
    
    public static String slogan(String s){
        if(s.equals("Never gonna give you up")) return "No";
        else if(s.equals("Never gonna let you down")) return "No";
        else if(s.equals("Never gonna run around and desert you")) return "No";
        else if(s.equals("Never gonna make you cry")) return "No";
        else if(s.equals("Never gonna say goodbye")) return "No";
        else if(s.equals("Never gonna tell a lie and hurt you")) return "No";
        else if(s.equals("Never gonna stop")) return "No";
        else return "Yes";
	}
}