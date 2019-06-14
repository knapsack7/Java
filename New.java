import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class New{
public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s[]=br.readLine().split(" ");
		int nums[]=new int[n];
		for(int i=0;i<n;i++)nums[i]=Integer.parseInt(s[i]);
		int sum=0,cnt=0;
		for(int i=0;i<n;i++){
		int k=1,j;
		while(k<=n){
			for(i=0;i<n;i+=k){
				if(k==1){
					   sum=0;
						    sum+=nums[i];
					        if(sum<0)
					        cnt++;
					   }
				else
				       {
					   sum=0;
					   for(j=0;j<k;j++)
						sum+=nums[j];
						if(sum<0)
						  cnt++;
						}
					   }
                 k++;}
	}
	System.out.println(cnt);	
	}
}
