import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class OrganizingContainersOfBalls{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	    	int n=Integer.parseInt(br.readLine());
	    	int[][] binary=new int[n][n];
	    	long[] total=new long[n];
	    	int i=0;
	    	int z=n;
	    	while(z-->0){
	    	    String[] s=br.readLine().split(" ");
	    	    for(int j=0;j<n;j++){
	    	    	binary[i][j]=Integer.parseInt(s[j]);
	    	    	total[j] +=binary[i][j];
	    	    }
	    	    i++;
	    	}
	    	int temp=1;
	    	for(int k=1;k<n;k++){
	    	if(total[k-1]!=total[k]){
	    	    temp=0;
	    	    break;
	    	    }
	    	}
	    	for(long m:total)
	    		System.out.print(m+" ");
	    	System.out.println();
	    	if(temp==1)
	    		System.out.println("Possible");
	    	else
	    		System.out.println("Impossible");
	    }
	}
}