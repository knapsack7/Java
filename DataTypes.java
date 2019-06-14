 import java.io.IOException;
import java.io.*;
import java.util.*;
public class DataTypes 
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	for(int i=1;i<=t;i++)
	   {
		String s=br.readLine();
		try
		  {
			long a=Long.parseLong(s);
	   System.out.println(a+" can be fitted in:");
     if(a>=-Math.pow(2,7) && a<=Math.pow(2,7)-1)
    	 System.out.println("* byte");
     if(a>=-Math.pow(2,15) && a<=Math.pow(2,15)-1)
    	 System.out.println("* short"); 
     if(a>=-Math.pow(2,31) && a<=Math.pow(2,31)-1)
        	 System.out.println("* int");
     if(a>=-Math.pow(2,63) && a<=Math.pow(2,63)-1)
        	 System.out.println("* long");
		  }
      catch(Exception e)
          {
    	  System.out.println(s+" can't be fitted anywhere. ");
          }
        }
    }
}

