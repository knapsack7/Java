import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class TailorShop{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s[]=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int p=Integer.parseInt(s[1]);
		int a[]=new int[n];
		String ss[]=br.readLine().split(" ");
		for(int i=0;i<n;i++){
			a[i]=(int)Math.ceil((float)Integer.parseInt(ss[i])/p);
		}
		Arrays.sort(a);
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					a[j]++;
				}
				else{
					break;
				}
			}
		}
		long cnt=0;
		for(int i=0;i<n;i++){
			cnt+=a[i];
		}
		System.out.println(cnt);
	 }
}
