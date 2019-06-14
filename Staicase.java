import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Staicase {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
        int space=n-1;
        for(int i=1;i<=n;i++){
        	for(int j=1;j<=n;j++){
        		if(j<=space)
        			System.out.print(" ");
        		else
        			System.out.print("*");
        	}
        	System.out.println();
        	--space;
        }
	}
}
