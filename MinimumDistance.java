import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
public class MinimumDistance{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		int n=Integer.parseInt(br.readLine());
		String[] s=br.readLine().split(" ");
		int[] num=new int[n];
		int flag=0;
		for(int i=0;i<n;i++)
			num[i]=Integer.parseInt(s[i]);
		for(int i=0;i<n-1;i++){
			int temp=num[i];
			for(int j=i+1;j<n;j++){
				if(num[j]==temp){
					flag=1;
					treeset.add(j-i);
					break;
				}
			}
		}
		if(flag==1){
		System.out.println(treeset.first());
		}
		else
		System.out.println(-1);
	}
}