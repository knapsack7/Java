import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class CuttheSticks {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int num[]=new int[n];
        int t=n,k=-1;
        for(int i=0;i<n;i++)
        	num[i]=Integer.parseInt(str[i]);
        Arrays.sort(num);
        System.out.println(t);
        do{
        	int initial=num[k+1];
        	for(int i=k+1;i<n;i++){	
              num[i]=num[i]-initial;
              if(num[i]==0)
              k=i;}
        	 if(num[n-1]!=0)
                 System.out.println(n-k-1);
         }while(num[n-1]!=0);
      }
}
