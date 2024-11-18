import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
            
        String result = triangle(a, b, c);
        
        System.out.print(result);
    }

    public static String triangle(int a, int b, int c){
        if(a == 60 && b == 60 && c == 60) return "Equilateral";
        else if((a+b+c) == 180){
            if(a != b && b != c && a != c) return "Scalene";
            else return "Isosceles";
        }else return "Error";
    }
}