import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Subsets{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int[] num=new int[s.length];
		for(int i=0;i<s.length;i++)
			num[i]=Integer.parseInt(s[i]);
		for(int i=1;i<(1<<num.length);i++){
			for(int j=0;j<num.length;j++){
				if((i&(1<<j))>0)
					System.out.print(num[j]+" ");
			}
			System.out.println();
		}
	}
}
