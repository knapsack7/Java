import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Palindro{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	
    String s=br.readLine();
    System.out.println(s);
    int flag=1;
    char a,b;
    int i,j;
    int l= s.length();
    i=0;
	j=l-1;
    while(i<=l/2)
       {
	   a=s.charAt(i);
	   b=s.charAt(j);
	   if(a!=b)
	   {System.out.println("No");
	   flag=0;
	   break;}
	   i++;
	   j--;
	   }
    if(flag==1)
    System.out.println("yes");
	}
}
	
