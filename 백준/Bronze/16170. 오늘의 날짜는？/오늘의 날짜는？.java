import java.time.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        LocalDate today = LocalDate.now();

        sb.append(today.getYear()).append("\n");
        sb.append(today.getMonthValue()).append("\n");
        sb.append(today.getDayOfMonth());
            
        System.out.print(sb);
	}
}