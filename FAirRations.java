import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FAirRations{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[]  num=new int[n];
		String[] s=br.readLine().split(" ");
		int count=0,sum=0;
		for(int i=0;i<s.length;i++){
			num[i]=Integer.parseInt(s[i]);
			sum+=num[i];
		}
		if(sum%2!=0)
			System.out.println("NO");
		else{
			for(int i=0;i<n;i++){
				if(num[i]%2!=0){
					num[i]++;
					num[i+1]++;
					count+=2;
				}
			}
			System.out.println(count);
		}
	}
}