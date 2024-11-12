import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            sb.append(txtmsg(s)).append("\n");
        }

        System.out.print(sb);
        
    }

    public static String txtmsg(String s){
        switch (s) {
            case "CU":
                return "see you";
            case ":-)":
                return "I’m happy";
            case ":-(":
                return "I’m unhappy";
            case ";-)":
                return "wink";
            case ":-P":
                return "stick out my tongue";
            case "(~.~)":
                return "sleepy";
            case "TA":
                return "totally awesome";
            case "CCC":
                return "Canadian Computing Competition";
            case "CUZ":
                return "because";
            case "TY":
                return "thank-you";
            case "YW":
                return "you're welcome";
            case "TTYL":
                return "talk to you later";
            default:
                return s;
        }
    }
}