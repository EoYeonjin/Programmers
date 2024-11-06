import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(luck(br.readLine()));
	}
    
    public static int luck(String s){
        int num = Integer.parseInt(s);
        int result = 0;
        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '7'){
                if(num%7 == 0) result = 3;
                else result = 2;
                break;
            }else{
                if(num%7 == 0) result = 1;
                else result = 0;
            }
        }
        return result;
	}
}