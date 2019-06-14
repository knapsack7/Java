import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Chutiyapa {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		int b[]=new int[n];
		String s1[]=br.readLine().split(" ");
		String s2[]=br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(s1[i]);
			b[i]=Integer.parseInt(s2[i]);
		}
		int a1=0,a2=0,a1pos=0;
		int b1=0,b2=0,b1pos=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(a[i]<min){
				min=a[i];
				a1pos=i;
			}
		}
		a1=min;
		min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(i==a1pos)continue;
			if(a[i]<min){
				min=a[i];
			}
		}
		a2=min;
		
		min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(b[i]<min){
				min=b[i];
				b1pos=i;
			}
		}
		b1=min;
		min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(i==b1pos)continue;
			if(b[i]<min){
				min=b[i];
			}
		}
		b2=min;
		if(a1pos==b1pos){
			System.out.println(min(a1+b2,a2+b1));
		}else{
			System.out.println(a1+b1);
		}
	}
	public static int min(int a,int b){
		return (a<b)?a:b;
	}
}
