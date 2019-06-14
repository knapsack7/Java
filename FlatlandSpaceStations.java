import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class FlatlandSpaceStations{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int m=Integer.parseInt(s[1]);
		int[] cities=new int[n];
		for(int i=0;i<n;i++)
			cities[i]=i;
		int[] spacestations=new int[m];
		String[] s1=br.readLine().split(" ");
		for(int i=0;i<m;i++)
			spacestations[i]=Integer.parseInt(s1[i]);
		Arrays.sort(spacestations);
		int max=cities[0],temp=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
			  temp=Math.abs(spacestations[i]-j);
			  if(temp<cities[j])
				  cities[j]=temp;
			}
		}
		for(int i:cities){
			if(i>max)
				max=i;
		}
		System.out.println(max);
	}
}
		