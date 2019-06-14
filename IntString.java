import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IntString {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1[]=br.readLine().split(" ");
		String s2[]=br.readLine().split(" ");
		int arr1[]=new int[3];
		int arr2[]=new int[3];
		for(int i=0;i<3;i++)
			arr1[i]=Integer.parseInt(s1[i]);
		for(int i=0;i<3;i++)
			arr2[i]=Integer.parseInt(s2[i]);
		int cnt1=0,cnt2=0;
		for(int i=0;i<3;i++)
		{
			if(arr1[i]>arr2[i])
				cnt1++;
			else if(arr1[i]<arr2[i])
				cnt2++;
		}
		System.out.printf("%d %d",cnt1,cnt2);
		}

}
