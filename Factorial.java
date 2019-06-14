import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Factorial {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
	double fact=1;
	System.out.println("Enter the number whose factorial is to find::");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	int n=Integer.parseInt(s);
	for(int i=0;i<n;i++)
	{
	fact=fact*(i+1);	
	}
System.out.println("factorial of given number is:::"+ fact);
	}

}
