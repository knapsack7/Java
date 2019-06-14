import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class NegativeSumSubArray {
public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s[]=br.readLine().split(" ");
		int nums[]=new int[n];
		for(int i=0;i<n;i++)nums[i]=Integer.parseInt(s[i]);
		int cnt=0;
		for(int i=0;i<n;i++){
			int length=1;
			while(length<=(n-i)){
				int sum=0;
				for(int j=i;j<i+length && j<n;j++){
					//System.out.print(nums[j]+" ");
					sum+=nums[j];
					}
				if(sum<0)cnt++;
				length++;
				//System.out.println();
			}
		}
		System.out.println(cnt);
		
	}

}
