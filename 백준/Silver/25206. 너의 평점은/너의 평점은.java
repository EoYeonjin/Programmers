import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        double majorSum = 0;
        double gradeSum = 0;

        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if(!grade.equals("P")){
                majorSum += score(score, grade);
                gradeSum += score;
            }
        }

        System.out.printf("%.6f" ,majorSum/gradeSum);
    }

    public static double score(double score, String grade){
        switch (grade) {
            case "A+":
                return 4.5*score;
            case "A0":
                return 4.0*score;
            case "B+":
                return 3.5*score;
            case "B0":
                return 3.0*score;
            case "C+":
                return 2.5*score;
            case "C0":
                return 2.0*score;
            case "D+":
                return 1.5*score;
            case "D0":
                return 1.0*score;
            default:
                return 0.0;
        }
    }
}