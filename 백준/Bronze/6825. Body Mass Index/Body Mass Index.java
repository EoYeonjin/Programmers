import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());

        String result = bmi(weight, height);

        System.out.print(result);
        
    }

    public static String bmi(double weight, double height){
        double bmi = weight/(height*height);

        if(bmi >= 25) return "Overweight";
        else if(bmi >= 18.5) return "Normal weight";
        else return "Underweight";
    }
}