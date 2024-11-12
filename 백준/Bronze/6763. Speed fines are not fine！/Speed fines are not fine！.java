import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        int car = Integer.parseInt(br.readLine());

        String result = fine(limit, car);

        System.out.print(result);
        
    }

    public static String fine(int limit, int car){
        if(car <= limit) return "Congratulations, you are within the speed limit!";
        int speed = car - limit;

        if(speed >=31) return "You are speeding and your fine is $500.";
        else if(speed >= 21) return "You are speeding and your fine is $270.";
        else return "You are speeding and your fine is $100.";
        
	}
}