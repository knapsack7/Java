import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AppleandOrange {
	public static void main(String[] args)throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String Str1[]=br.readLine().split(" ");
		String Str2[]=br.readLine().split(" ");
		String Str3[]=br.readLine().split(" ");
		int s=Integer.parseInt(Str1[0]);
		int t=Integer.parseInt(Str1[1]);
		int a=Integer.parseInt(Str2[0]);
		int b=Integer.parseInt(Str2[1]);
		int m=Integer.parseInt(Str3[0]);
		int n=Integer.parseInt(Str3[1]);
		String Str4[]=br.readLine().split(" ");
		String Str5[]=br.readLine().split(" ");
		int arr1[]=new int[m];
		int arr2[]=new int[n];
		int apple=0,orange=0;
		for(int i=0;i<m;i++)
			arr1[i]=Integer.parseInt(Str4[i]);
		for(int i=0;i<n;i++)
			arr2[i]=Integer.parseInt(Str5[i]);
		for(int i=0;i<m;i++){
			if((a+arr1[i]>=s)&&(a+arr1[i]<=t))
				apple++;}
		for(int i=0;i<n;i++){
			if((b+arr2[i]>=s)&&(b+arr2[i]<=t))
				orange++;}
		System.out.println(apple);
		System.out.println(orange);
		}
	}
