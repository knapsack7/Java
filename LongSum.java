import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LongSum{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int arr[][]=new int[N][N];
		for(int i=0;i<N;i++){
		String[] row = br.readLine().split(" ");
		   for(int j=0;j<N;j++){
			arr[i][j]=Integer.parseInt(row[j]);}
		}
		int cnt1=0,cnt2=0;
		for(int i=0;i<N;i++)
		{
		 for(int j=0;j<=N;j++)
		 {
		  if(i==j)
			  cnt1 +=arr[i][j];
		  if((i+j)==N-1)
			  cnt2 +=arr[i][j];
		 }
	    }
		System.out.println(Math.abs(cnt1-cnt2));
       }
}

