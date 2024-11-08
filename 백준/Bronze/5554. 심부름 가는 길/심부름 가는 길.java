import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int home = Integer.parseInt(br.readLine());
        int school = Integer.parseInt(br.readLine());
        int pc = Integer.parseInt(br.readLine());
        int academy = Integer.parseInt(br.readLine());

        String time = distance(home, school, pc, academy);
        
        System.out.println(time);
    }

    public static String distance(int home, int school, int pc, int academy){
        int time = home + school + pc + academy;
        int x = time/60;
        int y = time%60;
        
        return x+"\n"+y;
	}
}