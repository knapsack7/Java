import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Subsetsdiv8{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int[] num=new int[s.length];
		int count=0;
		for(int i=0;i<s.length;i++)
			num[i]=Integer.parseInt(s[i]);
		for(int i=1;i<(1<<num.length);i++){
			int temp=0,k=1;
			for(int j=0;j<num.length;j++){
				if((i&(1<<j))>0){
					temp=temp*k+num[j];
					k*=10;
				}
			}
			if(temp%8==0)
		    count++;
	}
		System.out.println(count%(1000000007));
}
}
