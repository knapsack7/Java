import java.util.*;
import java.lang.*;
import java.io.*;
 
class AliceBob{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s1[]=br.readLine().split(" ");
		String s2[]=br.readLine().split(" ");
		for(int i=0;i<n;i++){
			int x=Integer.parseInt(s1[i]);
			int y=Integer.parseInt(s2[i]);
			int z=x | y;
			System.out.print(z+" ");
		}
 
	}
}