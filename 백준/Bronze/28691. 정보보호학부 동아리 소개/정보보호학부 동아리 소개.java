import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(circle(br.readLine()));
	}
    
    public static String circle(String s){
        switch (s) {
            case "M":
                return "MatKor";
            case "W":
                return "WiCys";
            case "C":
                return "CyKor";
            case "A":
                return "AlKor";
            case "$":
                return "$clear";
            default:
                return "";
        }
	}
}