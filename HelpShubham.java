import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HelpShubham{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split("_");
		System.out.println(s.length);
	}
}