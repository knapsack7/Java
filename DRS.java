import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DRS{
	public static void main(String[] args)throws NumberFormatException,IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int T=Integer.parseInt(br.readLine());
	while(T-->0){
		int N=Integer.parseInt(br.readLine());
		int count=0;
		for(int i=0;i<N;i++){
			float temp=Float.parseFloat(br.readLine());
			count++;
		}
		System.out.println(count);
		}
     }
 }
 
