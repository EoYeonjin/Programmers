import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] isbn = {9, 7, 8, 0, 9, 2, 1, 4, 1, 8, 0, 0, 0};
        for (int i=10; i<isbn.length; i++) {
            isbn[i] = Integer.parseInt(br.readLine());
        }

        String result = isbn(isbn);

        System.out.print(result);
        
    }

    public static String isbn(int[] isbn){
        int sum = 0;
        for (int i=0; i<isbn.length; i++) {
            if(i%2 == 0) sum += isbn[i]*1;
            else sum += isbn[i]*3;
        }

        return "The 1-3-sum is "+sum;
    }
}