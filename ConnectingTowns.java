import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConnectingTowns {
	public static void main(String[] args) throws NumberFormatException,IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(br.readLine());
	   while(n-->0){
		    int m=1234567;
		    int ans=1;
	    	int no_of_townsinbetween=Integer.parseInt(br.readLine());
	    	String s[]=br.readLine().split(" ");
	        int[] route=new int[no_of_townsinbetween-1];
	    	for(int i=0;i<no_of_townsinbetween-1;i++){
	 	    route[i]=Integer.parseInt(s[i]);
	    	ans =((ans*route[i])%m);
	    	}
	    	System.out.println(ans%m);
	    	}
	   }
}
