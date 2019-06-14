import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class determiningClass {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter IP Address");
		String[] s=br.readLine().split("\\.");
		int foctet=Integer.parseInt(s[0]);
		if(foctet>=1&&foctet<=127)
			System.out.println("Class A");
		else if(foctet>=128&&foctet<=191)
			System.out.println("Class B");
		else if(foctet>=192&&foctet<=223)
			System.out.println("Class C");
		else if(foctet>=224&&foctet<=239)
			System.out.println("Class D");
		else if(foctet>=240&&foctet<=254)
			System.out.println("Class E");
		else
			System.out.println("Wrong IP Address");
		}

}
