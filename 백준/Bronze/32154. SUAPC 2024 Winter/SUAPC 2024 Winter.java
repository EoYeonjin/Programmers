import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(trouble(Integer.parseInt(br.readLine())));
	}

    public static String trouble(int s){
        switch (s) {
            case 1:
                return "11\nA B C D E F G H J L M";
            case 2:
                return "9\nA C E F G H I L M";
            case 3:
                return "9\nA C E F G H I L M";
            case 4:
                return "9\nA B C E F G H L M";
            case 5:
                return "8\nA C E F G H L M";
            case 6:
                return "8\nA C E F G H L M";
            case 7:
                return "8\nA C E F G H L M";
            case 8:
                return "8\nA C E F G H L M";
            case 9:
                return "8\nA C E F G H L M";
            case 10:
                return "8\nA B C F G H L M";
            default:
                return "";
        }
	}
}