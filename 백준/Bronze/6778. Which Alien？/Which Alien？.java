import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int antenna = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());

        String result = alien(antenna, eyes);

        System.out.print(result);
        
    }

    public static String alien(int antenna, int eyes){
        StringBuilder sb = new StringBuilder();
        if(antenna >= 3 && eyes <= 4) sb.append("TroyMartian").append("\n");
        if(antenna <= 6 && eyes >= 2) sb.append("VladSaturnian").append("\n");
        if(antenna <= 2 && eyes <= 3) sb.append("GraemeMercurian").append("\n");

        return sb.toString();
    }
}