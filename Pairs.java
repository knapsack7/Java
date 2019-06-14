import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Pairs{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int N=Integer.parseInt(s[0]);
		int K=Integer.parseInt(s[1]);
		int[] num=new int[N];
		String[] s1=br.readLine().split(" ");
		for(int i=0;i<N;i++)
			num[i]=Integer.parseInt(s1[i]);
		Arrays.sort(num);
		long total=0;
		for(int i=0;i<N-1;i++){
			for(int j=N-1;j>0;j--){
				if((num[j]-num[i])==K){
					total++;
				    break;
				}
			}
		}
		System.out.println(total);
	}
}
