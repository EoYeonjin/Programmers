import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            sb.append(semina(br.readLine())).append("\n");
        }

        System.out.print(sb);
	}
    
    public static String semina(String semina){
        switch (semina) {
            case "Algorithm":
                return "204";
            case "DataAnalysis":
                return "207";
            case "ArtificialIntelligence":
                return "302";
            case "CyberSecurity":
                return "B101";
            case "Network":
                return "303";
            case "Startup":
                return "501";
            case "TestStrategy":
                return "105";
            default:
                return "";
        }
	}
}