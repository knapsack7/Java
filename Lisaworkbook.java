import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Lisaworkbook{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int k=Integer.parseInt(s[1]);
		int[] qpc=new int[n];
		int temp=0,totalpage=0;
		String[] s1=br.readLine().split(" ");
		for(int i=0;i<n;i++){
			qpc[i]=Integer.parseInt(s1[i]);
			temp=qpc[i]/k;
			//System.out.println(temp);
			if(qpc[i]%k==0)
				totalpage+=temp;
			else
				totalpage+=(temp+1);
		}
		//System.out.println(totalpage);
		int[][] qop=new int[totalpage][k];
		int j=0,t=0;
		while(j<totalpage){
	       for(int l=0;l<qpc[t];l++){
	    	   if(l%k==0&&l!=0)
	    		   j++;
	    	   qop[j][l%k]=l+1;
	       }
	       j++;
	       t++;
		}
		/*for(int i=0;i<totalpage;i++){
			for(int m=0;m<k;m++){
				System.out.print(qop[i][m]+" ");
			}
			System.out.println();
		}*/
		int totalspecial=0;
		for(int i=0;i<totalpage;i++){
			for(int m=0;m<k;m++){
				if(i+1==qop[i][m])
					totalspecial++;
			}
		}
		System.out.println(totalspecial);
	}
}