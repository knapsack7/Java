import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TidyNumber{
	static boolean verification(long temp){
		int rrem=0;
		int srrem=0;
		do{
			rrem=(int)temp%10;
			temp/=10;
			srrem=(int)temp%10;
			}while((temp>0)&&(rrem>=srrem));
		if(temp==0)
			return true;
		else
			return false;
	}
public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		long limit=Long.parseLong(br.readLine());
		long greattidy=1,i=1;
		//if(limit>10)
			//i=limit-10;
		for(;i<=limit;i++){
			//System.out.println(i);
			if(verification(i)==true)
		    	 greattidy=i;
		}
		System.out.println(greattidy);
		}
	}

}
