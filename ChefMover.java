import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ChefMover{
        public static void main(String[] args)	throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			String s[]=br.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
			int d=Integer.parseInt(s[1]);
			long a[]=new long[n];
			String s1[]=br.readLine().split(" ");
			long sum=0;
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(s1[i]);
				sum+=a[i];
			}
			if(sum%n!=0)
				System.out.println("-1");
			else {
				long MT=0;
				long mean=sum/n;
				int j;
				for(int i=0;i<(n-d);i++) {
					j=i+d;
					if(a[i]<=a[j]){
							long k=mean-a[i];
							a[i]=mean;
							a[j]=a[j]-k;
							if(k<0)
								MT=MT-k;
							else 
								MT+=k;
					}else {
							long k=a[i]-mean;
							a[i]=mean;
							a[j]=a[j]+k;
							if(k<0)
								MT=MT-k;
							else 
								MT+=k;
						}
					}
				boolean is=true;
				for(int i=0;i<n;i++){
					if(a[i]!=mean)is=false;
				}
				if(is==false)
					System.out.println(-1);
				else 
					System.out.println(MT);
			}
		}
	}
}