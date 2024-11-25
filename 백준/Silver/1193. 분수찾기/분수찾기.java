import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print(middle(N));
    }

    public static String middle(int N){
        int diagonal = 1;
        int sum = 1;

        while (N > sum) {
            diagonal++;
            sum += diagonal;
        }

        int position = N - (sum - diagonal);

        if(diagonal%2 == 0){
            return position+"/"+(diagonal-position+1);
        }else{
            return (diagonal-position+1)+"/"+position;
        }
    }
}