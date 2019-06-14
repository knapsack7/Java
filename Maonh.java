import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Maonh {

	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String s[]=br.readLine().split("2");
		for(int i=0;i<s.length;i++){
			System.out.print("s["+i+"]="+s[i]+",");
		}

	}

}
