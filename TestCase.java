import java.io.*;
public class  TestCase
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s[]=br.readLine().split(" ");
			int a=Integer.parseInt(s[0]);
			int b=Integer.parseInt(s[1]);
			int n=Integer.parseInt(s[2]);
			long x=a+b;
			System.out.print(x+" ");
			for(int i=1;i<n;i++)
				{
				long y=(long)Math.pow(2,i)*b+x;
				System.out.print(y+" ");
				x=y;
				}
			System.out.println();
	   }
   }
}
