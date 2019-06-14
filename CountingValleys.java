import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CountingValleys{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine();;
		int curr=0,total=0,prev=0;
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='U')
				curr++;
			else
				curr--;
			if(curr<0)
				prev=-1;
			if(curr>0)
				prev=1;
			if(curr==0&&prev==-1){
				total++;
			}
		}
		System.out.println(total);
		}
}
