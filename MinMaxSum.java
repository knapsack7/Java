import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MinMaxSum {
	public static void main(String[] args) throws NumberFormatException,IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=5,k=0;
	long[] num=new long[5];
	long[] sum=new long[5];
	String s[]=br.readLine().split(" ");
	for(int i=0;i<5;i++)
		num[i]=Long.parseLong(s[i]);
	while(n>0){
		int i;
	    long summ=0;
		for(i=0;i<5;i++){
			if(i!=k)
				summ +=num[i];
		}
		sum[k]=summ;
		k++;
		n--;
	}
	Arrays.sort(sum);
	System.out.println(sum[0]+" "+sum[4]);
	}
}
