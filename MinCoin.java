import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MinCoin{
	public static void main(String[] args) throws NumberFormatException ,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			String[] s=br.readLine().split(" ");
			int no_coin=Integer.parseInt(s[0]);
			int ntotal=Integer.parseInt(s[1]);
		    int[] cointype=new int[no_coin];
		    String[] s1=br.readLine().split(" ");
		    for(int i=0;i<no_coin;i++)
		    	cointype[i]=Integer.parseInt(s1[i]);
		    int[] total=new int[ntotal+1];
		    for(int i=0;i<ntotal+1;i++)
		    	total[i]=Integer.MAX_VALUE;
		    total[0]=0;
		    for(int i=0;i<ntotal+1;i++)
		    System.out.print(total[i]+" ");
		    for(int i=0;i<no_coin;i++){
		    	for(int j=cointype[i];j<=ntotal;j++){
		    		if(total[j]>(1+total[j-cointype[i]]))
		    			total[j]=1+total[j-cointype[i]];
		    	}
		    }
		    for(int i=0;i<ntotal+1;i++)
			    System.out.print(total[i]+" ");
		    System.out.println();
			if(total[ntotal]!=Integer.MAX_VALUE)
		    	System.out.println(total[ntotal]);
		    else
		    	System.out.println(-1);
		}
	}
}
