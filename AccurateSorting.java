import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AccurateSorting {
    public static void main(String[] args) throws NumberFormatException,IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int T=Integer.parseInt(br.readLine());
	while(T-->0){
		int n=Integer.parseInt(br.readLine());
		int[] num=new int[n];
		String[] s=br.readLine().split(" ");
		for(int i=0;i<n;i++)
			num[i]=Integer.parseInt(s[i]);
		int temp=0;
		boolean flag=true;
		for(int i=0;i<n-1;i++){
			if((num[i]-num[i+1])>=2){
				flag=false;
				break;
			}
			if((num[i]>num[i+1])&&(Math.abs(num[i]-num[i+1])==1)){
				temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}
		}
		for(int i=0;i<n-1;i++){
			if(num[i]>num[i+1]){
				flag=false;
				break;
		    }
		}
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
}
