import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GreedyHarshit{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0){
		int N=Integer.parseInt(br.readLine());
		String[] s=br.readLine().split(" ");
		int[] arr=new int[N];
		int[] arr1=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=Integer.parseInt(s[i]);
			arr1[i]=Integer.parseInt(s[i]);
		}
		int total=arr[0];
		int k=1;
		while(k<N){
			for(int i=k;i<N;i++){
				arr1[i]+=arr[i];
			}
			total+=arr1[k];
			k++;
		}
		System.out.println(total);
		}
	}
}