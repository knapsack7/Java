import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ViralAdvertising{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int initial=5,j=0,like=0,present=0;
		int n=Integer.parseInt(br.readLine());
		while(j<n){
			j++;
			initial=initial/2;
			present=present+initial;
			initial=initial*3;
		}
	System.out.println(present);
	}
}
