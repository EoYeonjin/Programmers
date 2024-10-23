import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    	while(true){
    		String N = br.readLine();
    		
    		if(N.equals("0")) break;
    		
    		String result = palindrom(N);
        	System.out.println(result);
    	}
	}
	
	static String palindrom(String N){
		String result = "yes";
		
    	for(int i=0; i<N.length()/2; i++){
    		if(N.charAt(i) != N.charAt(N.length()-1-i)){
    			result = "no";
    			break;
    		} 
    	}
        
        return result;
	}
}