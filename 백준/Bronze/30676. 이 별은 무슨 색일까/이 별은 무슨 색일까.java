import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(lotto(Integer.parseInt(br.readLine())));
	}
    
    public static String lotto(int num){
        if(620 <= num && num <= 780) return "Red";
        else if(590 <= num && num < 620) return "Orange";
        else if(570 <= num && num < 590) return "Yellow";
        else if(495 <= num && num < 570) return "Green";
        else if(450 <= num && num < 495) return "Blue";
        else if(425 <= num && num < 450) return "Indigo";
        else if(380 <= num && num < 425) return "Violet";
        else return "";
	}
}