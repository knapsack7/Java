import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Solution1{
	public static void main(String[]args)throws IOException{
		BufferedReader cin=new BufferedReader (new InputStreamReader(System.in ));
		String[] a=cin.readLine().trim().split("[ !,?\\._'@]+",0);
		if(a.length==1&&a[0].equals(""))
		{System.out.println(0);}
		else
	    System.out.println(a.length);
			for(String s:a)System.out.println(s);
      }
}