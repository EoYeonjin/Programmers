import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        
        System.out.print(meat(A, B, C, D, E));
    }

    public static int meat(int A, int B, int C, int D, int E){
        int time = 0;
        String state = "frozen";
        if(A > 0) state = "melted";

        while (A != B) {
            if(A < 0){
                A += 1;
                time += C;
            }else if(A == 0 && state.equals("frozen")){
                time += D;
                state = "melted";
            }else if(state.equals("melted")){
                time += E;
                A += 1;
            }
        }
        
        return time;
    }
}