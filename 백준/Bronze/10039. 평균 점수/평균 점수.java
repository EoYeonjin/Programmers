import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i=0; i<5; i++) {
            int score = avg(Integer.parseInt(br.readLine()));
            sum += score;
        }

        int result = sum/5;
        
        System.out.print(result);
    }

    public static int avg(int score){
        if(score >= 40) return score;
        else return 40;
    }
}