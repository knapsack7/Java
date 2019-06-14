import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DecimalToBinary{
	public static void main(String[] args) throws IOException,NumberFormatException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[64];
		int index=0,j=0;
		while(n>0){
			arr[index++]=n%2;
			n/=2;
		}
		int[] binary=new int[index];
		for(int i=index-1;i>=0;i--){
		binary[j]=arr[i];
		j++;
		}
		for(int i:binary)
			System.out.print(i);
	}
}
