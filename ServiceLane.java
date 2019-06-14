import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ServiceLane{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int N=Integer.parseInt(s[0]);
		int T=Integer.parseInt(s[1]);
		String[] s1=br.readLine().split(" ");
		int[] lane_size=new int[N];
		for(int i=0;i<N;i++)
			lane_size[i]=Integer.parseInt(s1[i]);
		while(T-->0){
			String[] s2=br.readLine().split(" ");
			int I=Integer.parseInt(s2[0]);
			int J=Integer.parseInt(s2[1]);
			int smallest=lane_size[I];
			for(int i=I+1;i<=J;i++){
				if(lane_size[i]<=smallest)
					smallest=lane_size[i];
			}
			System.out.println(smallest);
		}
	}
}