import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        System.out.print(suapc(N));
	}
    
    public static String suapc(int num){
        switch (num) {
            case 1:
                return "12 1600";
            case 2:
                return "11 894";
            case 3:
                return "11 1327";
            case 4:
                return "10 1311";
            case 5:
                return "9 1004";
            case 6:
                return "9 1178";
            case 7:
                return "9 1357";
            case 8:
                return "8 837";
            case 9:
                return "7 1055";
            case 10:
                return "6 556";
            case 11:
                return "6 773";
            default:
                return "";
        }
	}
}